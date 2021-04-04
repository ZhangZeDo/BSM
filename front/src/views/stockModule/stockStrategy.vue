<template>
    <div>
        <el-card class="box-card">
            <div slot="header" class="clearfix">
                <span>新股申购策略</span>
            </div>
            <div >
                <el-row>
                    <el-col>
                        <span>股票代码：</span> <el-input style="width: 220px" placeholder="请输入" v-model="queryForm.stockCode" @input="queryData" clearable/>
                        <el-button type="primary" style="margin-left: 30px" @click="showDialog('create')">新增新股申购策略</el-button>
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
                            <el-link style="padding-left: 10px" type="primary" @click="showDialog('show',scope.row)">查看</el-link>
                            <el-link style="padding-left: 10px" type="primary" @click="showDialog('update',scope.row)">编辑</el-link>
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
        <el-dialog :title=this.dialogTitle :visible.sync="dialogVisible">
            <el-form ref="form" :model="submitForm" label-width="120px">
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="股票名称">
                            <el-select v-model="submitForm.stockName"
                                       filterable remote :remote-method="queryStockInfoList" placeholder="股票名称" :disabled="canNotUpdateForm">
                                <el-option v-for="(item,index) in stockInfoList" :key="item+index" :label="item.stockName" :value="item.stockName"></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="开始招股时间">
                            <el-date-picker v-model="submitForm.startShareDate" type="date" placeholder="选择日期" :disabled="canNotUpdateForm"/>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="结束招股时间">
                            <el-date-picker v-model="submitForm.endShareDate" type="date" placeholder="选择日期" :disabled="canNotUpdateForm"/>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row>
                    <el-col :span="12">
                        <el-form-item label="股票暗盘时间">
                            <el-date-picker v-model="submitForm.darkDate" type="date" placeholder="选择日期" :disabled="canNotUpdateForm"/>
                        </el-form-item>
                    </el-col>
                    <el-col :span="12">
                        <el-form-item label="股票上市时间">
                            <el-date-picker v-model="submitForm.listingDate" type="date" placeholder="选择日期" :disabled="canNotUpdateForm"/>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="模块名称">
                            <el-input v-model="submitForm.moduleName" placeholder="模块名称" :disabled="canNotUpdateForm"></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="22">
                        <el-form-item label="文本内容">
                            <el-input type="textarea" :rows="4" placeholder="请输入文本内容" v-model="submitForm.moduleContent" :disabled="canNotUpdateForm"></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row>
                    <el-upload
                            class="upload-demo"
                            ref="upload"
                            action=""
                            :on-preview="handlePreview"
                            :on-remove="handleRemove"
                            :before-remove="beforeRemove"
                            multiple
                            :limit="1"
                            list-type="picture"
                            :on-exceed="handleExceed"
                            :auto-upload="false"
                            :on-change="onChangeFileList"
                            :file-list="pictureFileList">
                        <el-button size="small" type="primary">点击上传图片</el-button>
                        <div slot="tip" class="el-upload__tip">只支持png.jpg格式的文件</div>
                    </el-upload>
                </el-row>
            </el-form>

            <span slot="footer" class="dialog-footer">
                <el-button @click="dialogVisible = false">取 消</el-button>
                <el-button v-if="!canNotUpdateForm" type="primary" @click="submitDialogForm">提交</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        name: "stockStrategy",
        data(){
            return{
                queryForm:{
                    stockCode:'',
                    page:1,
                    pageSize:10,
                },
                submitForm:{
                    stockName:'',
                    startShareDate:'',
                    endShareDate:'',
                    darkDate:'',
                    listingDate:'',
                    moduleName:'',
                    moduleContent:'',
                },
                total:0,
                tableList:[],
                dialogVisible:false,
                dialogTitle:'',
                pictureFileList:[],
                stockInfoList:[],
                canNotUpdateForm:false
            }
        },
        created(){
            this.queryData();
            this.queryStockInfoList();
        },
        methods:{
            showDialog(operate,row){
                if (operate === 'create'){
                    this.dialogVisible = true;
                    this.dialogTitle = '新增新股申购策略';
                    this.canNotUpdateForm = false;
                }else if (operate === 'update'){
                    this.dialogVisible = true;
                    this.dialogTitle = '修改新股申购策略';
                    this.submitForm = row;
                    this.canNotUpdateForm = false
                }else if (operate === 'show') {
                    this.dialogVisible = true;
                    this.submitForm = row;
                    this.dialogTitle = '查看新股申购策略';
                    this.canNotUpdateForm = true;
                }
            },
            queryData(){
                this.$axios.post('/stockStrategy/queryStockStrategyList',{
                    stockCode:this.queryForm.stockCode,
                    page:this.queryForm.page,
                    pageSize:this.queryForm.pageSize,
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.tableList = resp.data.items;
                        this.total = resp.data.total;
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
            onChangeFileList(pictureFileList,fileList){
                this.pictureFileList = fileList;
            },
            submitDialogForm(){
                let formData = new FormData();
                if (this.pictureFileList.length>0) {
                    formData.append("file",this.pictureFileList[0].raw);
                }
                formData.append("stockName",this.submitForm.stockName);
                formData.append("startShareDate",this.submitForm.startShareDate);
                formData.append("endShareDate",this.submitForm.endShareDate);
                formData.append("darkDate",this.submitForm.darkDate);
                formData.append("listingDate",this.submitForm.listingDate);
                formData.append("moduleName",this.submitForm.moduleName);
                formData.append("moduleContent",this.submitForm.moduleContent);
                this.$axios.postFormData(
                    '/stockStrategy/insertStockStrategy',
                    formData
                ).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("新增成功");
                        this.dialogVisible = false
                        this.queryData();
                    }else{
                        this.$message.error(resp.data.message);
                    }
                });
            },
            updateStockStatus(row){
                this.$axios.post('/stockStrategy/updateStockStrategyStatus',{
                    id:row.id,
                    status:row.status===1?2:1,
                }).then(resp=>{
                    window.console.info(resp)
                    this.queryData()
                });
            },
            deleteStockInfo(row){
                this.$axios.post('/stockStrategy/deleteStockStrategy',{
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