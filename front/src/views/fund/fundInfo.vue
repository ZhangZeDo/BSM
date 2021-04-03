<template>
    <div>
        <el-card class="box-card">
            <div slot="header" class="clearfix">
                <span>明星基金跟踪</span>
            </div>
            <div >
                <el-row>
                    <el-col>
                        <span>基金名称：</span>
                        <el-select style="width: 220px" v-model="queryForm.fundName" placeholder="请选择" @change="queryData" clearable>
                            <el-option
                                    v-for="item in fundNameList"
                                    :key="item"
                                    :label="item"
                                    :value="item">
                            </el-option>
                        </el-select>
                        <span style="padding-left: 30px">操作方向：</span>
                        <el-select style="width: 220px" v-model="queryForm.operateDirect" placeholder="请选择" @change="queryData" clearable>
                            <el-option
                                    v-for="(item,index) in directList"
                                    :key="item+index"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                        <span style="padding-left: 30px">股票名称：</span>
                        <el-input style="width: 220px" placeholder="请输入" v-model="queryForm.stockName" @input="queryData" clearable/>
                        <el-button style="margin-left: 30px" type="primary" @click="showDialog('create')">新增</el-button>
                    </el-col>
                </el-row>
            </div>
            <div style="padding-top: 20px">
                <el-table :data="tableList" style="width: 100%">
                    <el-table-column
                            prop="id"
                            label="编号"
                            width="100">
                    </el-table-column>
                    <el-table-column
                            prop="fundName"
                            label="基金名称">
                    </el-table-column>
                    <el-table-column
                            prop="stockName"
                            label="股票名称">
                    </el-table-column>
                    <el-table-column prop="createDatetime" label="买入卖出时间"  width="200">
                        <template slot-scope="scope">
                            {{parseTime(scope.row.buyInoutDate) }}
                        </template>
                    </el-table-column>
                    <el-table-column prop="createDatetime" label="操作方向"  width="200">
                        <template slot-scope="scope">
                            {{parseOperateDirect(scope.row.operateDirect) }}
                        </template>
                    </el-table-column>
                    <el-table-column
                            prop="stockNum"
                            label="股数(万股)">
                    </el-table-column>
                    <el-table-column prop="stockRate" label="比例">
                        <template slot-scope="scope">
                            {{scope.row.stockRate}}%
                        </template>
                    </el-table-column>
                    <el-table-column
                            prop="buyInoutPrice"
                            label="买入卖出价格">
                    </el-table-column>
                    <el-table-column label="操作">
                        <template slot-scope="scope">
                            <el-link type="primary" @click="updateStockStatus(scope.row)">编辑</el-link>
                            <el-link style="padding-left: 20px" type="primary" @click="deleteFundInfo(scope.row)">删除</el-link>
                        </template>
                    </el-table-column>
                </el-table>
            </div>
            <div align="left" style="padding-top: 20px">
                <div class="block">
                    <el-pagination
                            @size-change="handleSizeChange"
                            @current-change="handleCurrentChange"
                            :current-page="queryForm.page"
                            :page-size="queryForm.pageSize"
                            :page-sizes="[10,20,50,100]"
                            layout="total, sizes,prev, pager, next, jumper"
                            :total="total">
                    </el-pagination>
                </div>
            </div>
        </el-card>
        <el-dialog :title=this.dialogTitle :visible.sync="dialogVisible">
            <el-form ref="form" :model="submitForm" label-width="120px">
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="基金名称">
                            <el-select v-model="submitForm.fundName"
                                    filterable allow-create placeholder="请选择基金名称">
                                <el-option v-for="item in fundNameList" :key="item" :label="item" :value="item"></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="股票名称">
                            <el-select v-model="submitForm.stockName"
                                       filterable remote :remote-method="queryStockInfoList" placeholder="股票名称">
                                <el-option v-for="(item,index) in stockInfoList" :key="item+index" :label="item.stockName" :value="item.stockName"></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="操作方向">
                            <el-select style="width: 220px" v-model="submitForm.operateDirect" placeholder="请选择">
                                <el-option
                                        v-for="(item,index) in directList"
                                        :key="item+index"
                                        :label="item.label"
                                        :value="item.value">
                                </el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="买入卖出时间">
                            <el-date-picker v-model="submitForm.buyInoutDate" type="date" placeholder="选择日期"/>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="股数">
                            <el-input v-model="submitForm.stockNum" placeholder="股数"></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="比例">
                            <el-input v-model="submitForm.stockRate" placeholder="比例"></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="买入卖出价格">
                            <el-input v-model="submitForm.buyInoutPrice" placeholder="买入卖出价格"></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
            </el-form>

            <span slot="footer" class="dialog-footer">
                <el-button @click="dialogVisible = false">取 消</el-button>
                <el-button type="primary" @click="submitUploadForm">提交</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        name: "fundInfo",
        data(){
            return{
                queryForm:{
                    fundName:'',
                    operateDirect:'',
                    stockName:'',
                    page:1,
                    pageSize:10,
                },
                total:0,
                tableList:[],
                fundNameList:[],
                directList:[
                    {label:'卖出',value:'1'},
                    {label:'买入',value:'2'}
                ],

                dialogTitle:'',
                dialogVisible:false,
                submitForm:{
                    fundName:'',
                    stockCode:'',
                    stockName:'',
                    buyInoutDate:'',
                    operateDirect:'',
                    stockNum:'',
                    stockRate:'',
                    buyInoutPrice:'',
                },
                stockInfoList:[],
            }
        },
        created(){
            this.queryData();
            this.queryFundNameList();
            this.queryStockInfoList();
        },
        methods:{
            queryData(){
                this.$axios.post('/fundInfo/queryFundInfoList',{
                    fundName:this.queryForm.fundName,
                    operateDirect:this.queryForm.operateDirect,
                    stockName:this.queryForm.stockName,
                    page:this.queryForm.page,
                    pageSize:this.queryForm.pageSize,
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.tableList = resp.data.items;
                        this.total = resp.data.total;
                    }
                });
            },
            queryFundNameList(){
                this.$axios.post('/fundInfo/queryFundNameList',{
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.fundNameList = resp.data;
                    }
                });
            },
            showDialog(operate){
                if (operate == 'create'){
                    this.dialogTitle = '新增基金信息'
                    this.dialogVisible = true
                } else if (operate == 'update'){
                    this.dialogTitle = '编辑基金信息'
                    this.dialogVisible = true
                }
            },
            handleSizeChange(val) {
                this.queryForm.pageSize = val;
                this.queryData()
            },
            handleCurrentChange(val) {
                this.queryForm.page = val;
                this.queryData()
            },

            parseTime(dateObj) {
                var date = new Date(dateObj);
                var year = date.getFullYear();
                var month = ("0" + (date.getMonth() + 1)).slice(-2);
                var day = ("0" + date.getDate()).slice(-2);
                var hour = ("0" + date.getHours()).slice(-2);
                var min = ("0" + date.getMinutes()).slice(-2);
                var second = ("0" + date.getSeconds()).slice(-2);
                return year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + second;
            },
            parseOperateDirect(row){
                for (const direct of this.directList) {
                    if (direct.value == row){
                        return direct.label
                    }
                }
            },
            submitUploadForm(){
                this.$axios.post('/fundInfo/insertFundInfo',
                    this.submitForm
                ).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("操作成功");
                        this.dialogVisible = false;
                        this.queryData();
                        this.queryFundNameList();
                    }else{
                        this.$message.error(resp.data.message);
                    }
                });
            },
            queryStockInfoList(queryValue){
                this.$axios.post('/stockInfo/queryStockInfoList',{
                    stockName:queryValue,
                    page:1,
                    pageSize:5,
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.stockInfoList = resp.data.items;
                    }
                });
            },
            deleteFundInfo(row){
                this.$axios.post('/fundInfo/deleteFundInfo',{
                    id:row.id
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("删除成功");
                    }
                });
            }

        }
    }
</script>

<style scoped>

</style>