<template>
    <div>
        <el-card class="box-card">
            <div slot="header" class="clearfix">
                <span>新股数据上传</span>
            </div>
            <div >
                <el-row>
                    <el-col>
                        <span>股票代码：</span> <el-input style="width: 220px" placeholder="请输入" v-model="queryForm.stockCode" @input="queryData" clearable/>
                        <span style="padding-left: 30px">股票市场：</span>
                        <el-select v-model="queryForm.stockMarket" placeholder="请选择" @change="queryData" clearable>
                            <el-option
                                    v-for="item in options"
                                    :key="item.value"
                                    :label="item.label"
                                    :value="item.value">
                            </el-option>
                        </el-select>
                        <el-button type="primary" style="margin-left: 30px" @click="showUploadDialog">批量上传新股数据</el-button>
                    </el-col>
                </el-row>
            </div>
            <div style="padding-top: 20px">
                <el-table :data="tableList" style="width: 100%">
                    <el-table-column
                            prop="stockName"
                            label="股票名称"
                            width="200">
                    </el-table-column>
                    <el-table-column
                            prop="stockMarket"
                            label="股票市场">
                    </el-table-column>
                    <el-table-column
                            prop="stockCode"
                            label="股票代码">
                    </el-table-column>
                    <el-table-column prop="status" label="状态">
                        <template slot-scope="scope" >
                            <span v-if="scope.row.status === 1" style="color: #4c9f29">有效</span>
                            <span v-if="scope.row.status === 2" style="color: #c71012">无效</span>
                        </template>
                    </el-table-column>
                    <el-table-column prop="createDatetime" label="创建时间"  width="400">
                        <template slot-scope="scope">
                            {{parseTime(scope.row.createDatetime) }}
                        </template>
                    </el-table-column>
                    <el-table-column label="操作">
                        <template slot-scope="scope">
                            <el-link v-if="scope.row.status===1" type="primary" @click="updateStockStatus(scope.row)">失效</el-link>
                            <el-link v-if="scope.row.status===2" type="primary" @click="updateStockStatus(scope.row)">启用</el-link>
                            <el-link style="padding-left: 10px" type="primary" >查看</el-link>
                            <el-link style="padding-left: 10px" type="danger" @click="deleteStockInfo(scope.row)">删除</el-link>
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
        <el-dialog title="批量上传大新数据" :visible.sync="dialogUploadVisible">
            <el-upload
                    class="upload-demo"
                    ref="upload"
                    action=""
                    :on-preview="handlePreview"
                    :on-remove="handleRemove"
                    :before-remove="beforeRemove"
                    multiple
                    :limit="1"
                    :on-exceed="handleExceed"
                    :auto-upload="false"
                    :on-change="onChangeFileList"
                    :file-list="templateFileList">
                <el-button size="small" type="primary">点击上传</el-button>
                <div slot="tip" class="el-upload__tip">请用打新数据上传标准模板.excel</div>
            </el-upload>
            <span slot="footer" class="dialog-footer">
                <el-button @click="dialogUploadVisible = false">取 消</el-button>
                <el-button type="primary" @click="submitUploadForm">确 定</el-button>
            </span>
        </el-dialog>
    </div>

</template>

<script>
    export default {
        name: "stockInfoList",
        data(){
            return{
                queryForm:{
                    stockCode:'',
                    stockMarket:'',
                    page:1,
                    pageSize:10,
                },
                total:0,
                tableList:[],
                dialogUploadVisible:false,
                templateFileList:[],
                options: [
                    {value: 'HK', label: 'HK'},
                    {value: 'US', label: 'US    '},
                    {value: 'SZ', label: 'SZ'},
                    {value: 'SH', label: 'SH'},
                ],
            }
        },
        created(){
            this.queryData()
        },
        methods:{
            showUploadDialog(){
                this.dialogUploadVisible = true
            },
            queryData(){
                this.$axios.post('/stockInfo/queryStockInfoList',{
                    stockCode:this.queryForm.stockCode,
                    stockMarket:this.queryForm.stockMarket,
                    page:this.queryForm.page,
                    pageSize:this.queryForm.pageSize,
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.tableList = resp.data.items;
                        this.total = resp.data.total;
                    }
                });
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
            handleRemove(file, fileList) {
                window.console.log(file, fileList);
            },
            handlePreview(file) {
                window.console.log(file);
            },
            handleExceed() {
                this.$message.warning(`只能选择一个文件`);
            },
            beforeRemove(file) {
                return this.$confirm(`确定移除 ${ file.name }？`);
            },
            onChangeFileList(templateFileList,fileList){
                this.templateFileList = fileList;
            },
            submitUploadForm(){
                let formData = new FormData();
                formData.append("file",this.templateFileList[0].raw);
                this.$axios.postFormData(
                    '/stockInfo/uploadStockTemplateFile',
                    formData
                ).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("上传成功");
                        this.dialogUploadVisible = false
                    }else{
                        this.$message.error(resp.data.message);
                    }
                });
            },
            updateStockStatus(row){
                this.$axios.post('/stockInfo/updateStockInfoStatus',{
                    id:row.id,
                    status:row.status===1?2:1,
                }).then(resp=>{
                    window.console.info(resp)
                    this.queryData()
                });
            },
            deleteStockInfo(row){
                this.$axios.post('/stockInfo/deleteStockInfo',{
                    id:row.id,
                }).then(resp=>{
                    window.console.info(resp)
                    this.queryData()
                });
            },
        }
    }

</script>

<style scoped>

</style>