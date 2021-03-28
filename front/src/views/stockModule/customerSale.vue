<template>
    <div>
        <el-card class="box-card">
            <div slot="header" class="clearfix">
                <span>用户卖出</span>
            </div>
            <div >
                <el-row>
                    <el-col>
                        <span>用户ID：</span> <el-input style="width: 220px" placeholder="请输入" v-model="queryForm.customerId" @input="queryData" clearable/>
                        <span style="padding-left: 30px">用户昵称：</span><el-input style="width: 220px" placeholder="请输入" v-model="queryForm.customerName" @input="queryData" clearable/>
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
                            prop="customerName"
                            label="用户昵称">
                    </el-table-column>
                    <el-table-column
                            prop="customerId"
                            label="用户ID">
                    </el-table-column>
                    <el-table-column prop="createDatetime" label="创建时间"  width="200">
                        <template slot-scope="scope">
                            {{parseTime(scope.row.createDatetime) }}
                        </template>
                    </el-table-column>
                    <el-table-column prop="createDatetime" label="卖出时间"  width="200">
                        <template slot-scope="scope">
                            {{parseTime(scope.row.buyOutDate) }}
                        </template>
                    </el-table-column>
                    <el-table-column
                            prop="stockName"
                            label="股票名称">
                    </el-table-column>
                    <el-table-column
                            prop="buyOutNumber"
                            label="卖出手数">
                    </el-table-column>
                    <el-table-column
                            prop="buyOutPrice"
                            label="卖出价格">
                    </el-table-column>
                    <el-table-column
                            prop="buyOutProfit"
                            label="卖出收益">
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
    </div>
</template>

<script>
    export default {
        name: "customerSale",
        data(){
            return{
                queryForm:{
                    customerName:'',
                    customerId:'',
                    page:1,
                    pageSize:10,
                },
                total:0,
                tableList:[],
            }
        },
        created(){
            this.queryData()
            this.insert()
        },
        methods:{
            insert(){
                this.$axios.post('/buyOutInfo/insertBuyOutInfo',{
                    openId:"111111",
                    stockCode:'01643',
                    buyOutNumber:5,
                    buyOutPrice:100
                })
            },
            queryData(){
                this.$axios.post('/buyOutInfo/queryBuyOutInfoList',{
                    customerName:this.queryForm.customerName,
                    customerId:this.queryForm.customerId,
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
            }
        }
    }
</script>

<style scoped>

</style>