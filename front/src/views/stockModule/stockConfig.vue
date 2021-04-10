<template>
    <div>
        <el-card class="box-card">
            <div slot="header" class="clearfix">
                <span>打新统计配置</span>
            </div>
            <div >
                <el-row>
                    <el-col>
                        <span style="padding-left: 30px">模块名称：</span>
                        <el-input style="width: 220px" placeholder="请输入" v-model="queryForm.configName" @input="queryData" clearable/>
                        <el-button style="margin-left: 30px" type="primary" @click="showDialog()">新建模块</el-button>
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
                            prop="configName"
                            label="模块名称">
                    </el-table-column>
                    <el-table-column
                            prop="configCondition"
                            label="筛选条件">
                    </el-table-column>
                    <el-table-column
                            prop="seqNo"
                            label="排序">
                        <template slot-scope="scope" >
                            <el-input v-model="scope.row.seqNo" @change="updateStockConfig(scope.row)"></el-input>
                        </template>
                    </el-table-column>
                    <el-table-column
                            prop="configContent"
                            label="打新点评">
                        <template slot-scope="scope" >
                            <el-input type="textarea" autosize v-model="scope.row.configContent" @change="updateStockConfig(scope.row)"></el-input>
                        </template>
                    </el-table-column>
                    <el-table-column label="操作">
                        <template slot-scope="scope">
                            <el-link style="padding-left: 20px" type="primary" @click="deleteStockConfig(scope.row)">删除</el-link>
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
        <el-dialog title="新增打新统计配置" :visible.sync="dialogVisible">
            <el-form ref="form" :model="submitForm" label-width="160px">
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="模块名称">
                            <el-input v-model="submitForm.configName" placeholder="模块名称"></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="24">
                        <el-form-item
                                v-for="(condition, index) in submitForm.configCondition"
                                :label="'筛选条件' + (index+1)"
                                :key="condition.key"
                                :prop="'configCondition.' + index + '.value'">
                            <el-row :gutter="24">
                                <el-col :span="6">
                                    <el-select v-model="condition.selectCondition" placeholder="选择筛选条件">
                                        <el-option
                                                v-for="(item,index) in selectConditionOptions"
                                                :key="item+index"
                                                :label="item"
                                                :value="item">
                                        </el-option>
                                    </el-select>
                                </el-col>
                                <el-col :span="6">
                                    <el-select v-model="condition.compareCondition" placeholder="选择比较条件">
                                        <el-option
                                                v-for="(item,index) in compareConditionOptions"
                                                :key="item+index"
                                                :label="item.label"
                                                :value="item.value">
                                        </el-option>
                                    </el-select>
                                </el-col>
                                <el-col :span="5">
                                    <el-input v-model="condition.conditionValue" placeholder="输入比较值"></el-input>
                                </el-col>
                                <el-col :span="3">
                                    <el-button @click="addCondition">新增</el-button>
                                </el-col>
                                <el-col :span="3">
                                    <el-button @click.prevent="removeCondition(condition)">删除</el-button>
                                </el-col>
                            </el-row>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="24">
                        <el-form-item label="打新点评">
                            <el-input type="textarea" :autosize="{ minRows: 3 }" v-model="submitForm.configContent" placeholder="打新点评"></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-row :gutter="24">
                    <el-col :span="12">
                        <el-form-item label="排序">
                            <el-input-number v-model="submitForm.seqNo" placeholder="排序"></el-input-number>
                        </el-form-item>
                    </el-col>
                </el-row>
            </el-form>

            <span slot="footer" class="dialog-footer">
                <el-button @click="closeDialog">取 消</el-button>
                <el-button type="primary" @click="submitDialogForm">提交</el-button>
            </span>
        </el-dialog>
    </div>
</template>

<script>
    export default {
        name: "stockConfig",
        data(){
            return{
                queryForm:{
                    configName:'',
                    page:1,
                    pageSize:10,
                },
                total:0,
                tableList:[],
                dialogVisible:false,
                submitForm:{
                    configName:'',
                    configContent:'',
                    configCondition:[{
                        selectCondition: '',
                        compareCondition:'',
                        conditionValue:''
                    }],
                    seqNo:'',
                },
                compareConditionOptions: [
                    {value: '<=', label: '精确等于某个文本'},
                    {value: 'like', label: '包含某个文本'},
                    {value: '==', label: '==某个数值'},
                    {value: '<=', label: '<=某个数值'},
                    {value: '<', label: '<某个数值'},
                    {value: '>=', label: '>=某个数值'},
                    {value: '>', label: '>某个数值'},
                ],
                selectConditionOptions:[],
            }
        },
        created(){
            this.queryData();
            this.queryConfigConditionEnum();
        },
        methods:{
            queryData(){
                this.$axios.post('/stockConfig/queryStockConfigList',{
                    configName:this.queryForm.configName,
                    page:this.queryForm.page,
                    pageSize:this.queryForm.pageSize,
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.tableList = resp.data.items;
                        this.total = resp.data.total;
                    }
                });
            },

            showDialog(){
                this.dialogVisible = true;
            },
            handleSizeChange(val) {
                this.queryForm.pageSize = val;
                this.queryData()
            },
            handleCurrentChange(val) {
                this.queryForm.page = val;
                this.queryData()
            },
            closeDialog(){
                this.dialogVisible = false;
                this.resetSubmitForm();
            },
            submitDialogForm(){
                let finalCondition = "";
                for (const condition of this.submitForm.configCondition) {
                    finalCondition = finalCondition + condition.selectCondition + condition.compareCondition + condition.conditionValue + ';'
                }
                this.$axios.post('/stockConfig/insertStockConfig',{
                    configCondition:finalCondition,
                    configName:this.submitForm.configName,
                    configContent:this.submitForm.configContent,
                    seqNo:this.submitForm.seqNo,
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("操作成功");
                        this.dialogVisible = false;
                        this.queryData();
                        this.resetSubmitForm();
                    }else{
                        this.$message.error(resp.data.message);
                    }
                });
            },
            resetSubmitForm(){
                this.submitForm = {
                    configName:'',
                    configContent:'',
                    configCondition:[{
                        selectCondition: '',
                        compareCondition:'',
                        conditionValue:''
                    }],
                    seqNo:'',
                }
            },
            deleteStockConfig(row){
                this.$axios.post('/stockConfig/deleteStockConfig',{
                    id:row.id
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("删除成功");
                        this.queryData();
                    }
                });
            },
            removeCondition(item) {
                var index = this.submitForm.configCondition.indexOf(item)
                if (index !== -1) {
                    this.submitForm.configCondition.splice(index, 1)
                }
            },
            addCondition() {
                this.submitForm.configCondition.push({
                    selectCondition: '',
                    compareCondition:'',
                    conditionValue:'',
                    key: Date.now()
                });
            },
            updateStockConfig(row){
                this.$axios.post('/stockConfig/updateStockConfig',row).then(resp=>{
                    if (resp.code == 200) {
                        this.$message.success("更新成功");
                        this.queryData();
                    }
                });
            },
            queryConfigConditionEnum(){
                this.$axios.post('/stockConfig/queryConfigConditionEnum'
                ).then(resp=>{
                    if (resp.code == 200) {
                        this.selectConditionOptions = resp.data
                    }
                });
            }

        }
    }
</script>

<style scoped>

</style>