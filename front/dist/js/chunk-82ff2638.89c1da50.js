(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-82ff2638"],{"1dde":function(e,t,r){var a=r("d039"),s=r("b622"),i=r("2d00"),o=s("species");e.exports=function(e){return i>=51||!a((function(){var t=[],r=t.constructor={};return r[o]=function(){return{foo:1}},1!==t[e](Boolean).foo}))}},"3e7b":function(e,t,r){"use strict";r.r(t);var a=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[e._m(0),r("el-card",{staticStyle:{margin:"20px 100px"}},[r("div",{staticStyle:{height:"30px"},attrs:{slot:"header"},slot:"header"},[r("div",{staticStyle:{float:"left","margin-right":"10px"}},[r("label",{},[e._v("账号或名称:")])]),r("div",{staticStyle:{float:"left","margin-right":"10px"}},[r("el-input",{attrs:{size:"small",placeholder:"搜索账号或名称",clearable:""},on:{change:function(t){return e.queryData()}},model:{value:e.queryForm.searchInput,callback:function(t){e.$set(e.queryForm,"searchInput",t)},expression:"queryForm.searchInput"}},[r("i",{staticClass:"el-input__icon el-icon-search",attrs:{slot:"prefix"},slot:"prefix"})])],1),r("div",{staticStyle:{float:"left","margin-right":"10px","padding-left":"20px"}},[r("label",{},[e._v("管理员状态:")])]),r("div",{staticStyle:{float:"left","margin-right":"10px"}},[r("el-select",{attrs:{size:"small",clearable:"",placeholder:"请选择管理员状态"},on:{change:function(t){return e.queryData()}},model:{value:e.queryForm.status,callback:function(t){e.$set(e.queryForm,"status",t)},expression:"queryForm.status"}},[r("el-option",{attrs:{value:"1",label:"有效"}},[e._v("有效")]),r("el-option",{attrs:{value:"0",label:"无效"}},[e._v("无效")])],1)],1),r("div",{staticStyle:{float:"right","margin-right":"10px"}},[r("el-button",{attrs:{type:"primary",size:"small"},on:{click:e.showCreateDialog}},[e._v("新增")])],1)]),r("div",[r("el-table",{staticStyle:{width:"100%"},attrs:{data:e.userList,stripe:""}},[r("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"userAccount",label:"管理员账号"}}),r("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"userName",label:"管理员名称"}}),r("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"userMail",label:"邮箱地址"}}),r("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"userPhone",label:"联系方式"}}),r("el-table-column",{staticStyle:{width:"15%"},attrs:{label:"创建时间"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(" "+e._s(e.parseTime(t.row.createDatetime))+" ")]}}])}),r("el-table-column",{staticStyle:{width:"15%"},attrs:{label:"状态"},scopedSlots:e._u([{key:"default",fn:function(t){return[e._v(" "+e._s(e.parseStatus(t.row.status))+" ")]}}])}),r("el-table-column",{staticStyle:{width:"10%"},attrs:{label:"操作"},scopedSlots:e._u([{key:"default",fn:function(t){return[0==t.row.status?r("el-button",{attrs:{type:"primary",size:"mini"},on:{click:function(r){return e.changeUserStatus(t.row,"启用")}}},[e._v("启用")]):r("el-button",{attrs:{type:"danger",size:"mini"},on:{click:function(r){return e.changeUserStatus(t.row,"禁用")}}},[e._v("禁用")])]}}])})],1)],1),r("div",{staticStyle:{"padding-top":"20px"}},[r("div",{staticClass:"block"},[r("el-pagination",{attrs:{"current-page":e.queryForm.page,"page-size":e.queryForm.pageSize,"page-sizes":[5,10,15,20],layout:"total,sizes, prev ,pager, next, jumper",total:e.total},on:{"size-change":e.handleSizeChange,"current-change":e.handleCurrentChange}})],1)]),r("el-dialog",{attrs:{title:"管理员新建",visible:e.createDialog,width:"40%",center:""},on:{"update:visible":function(t){e.createDialog=t}}},[r("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.userForm,rules:e.rules,"label-width":"100px"}},[r("el-form-item",{attrs:{label:"管理员账号",prop:"mediaName"}},[r("el-input",{attrs:{placeholder:"请输入管理员账号"},model:{value:e.userForm.userAccount,callback:function(t){e.$set(e.userForm,"userAccount",t)},expression:"userForm.userAccount"}})],1),r("el-form-item",{attrs:{label:"管理员名称",prop:"mediaType"}},[r("el-input",{attrs:{placeholder:"请输入管理员名称"},model:{value:e.userForm.userName,callback:function(t){e.$set(e.userForm,"userName",t)},expression:"userForm.userName"}})],1)],1),r("span",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[r("el-button",{on:{click:function(t){e.createDialog=!1}}},[e._v("取 消")]),r("el-button",{attrs:{type:"primary"},on:{click:e.submitForm}},[e._v("确 定")])],1)],1)],1)],1)},s=[function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"card-header",staticStyle:{"margin-top":"20px","margin-left":"100px"}},[r("h3",[e._v("管理员管理")])])}],i=(r("fb6a"),{name:"AdminManage",data:function(){return{queryForm:{searchInput:"",status:"",pageSize:5,page:1,roleType:"admin"},userList:[],total:0,createDialog:!1,userForm:{userName:"",userAccount:"",roleType:"admin",userPassword:"000000"},rules:{userAccount:[{required:!0,message:"请输入用户账号",trigger:"change"}],userName:[{required:!0,message:"请输入用户名称",trigger:"change"}]}}},created:function(){this.queryData()},methods:{parseTime:function(e){var t=new Date(e),r=t.getFullYear(),a=("0"+(t.getMonth()+1)).slice(-2),s=("0"+t.getDate()).slice(-2),i=("0"+t.getHours()).slice(-2),o=("0"+t.getMinutes()).slice(-2),n=("0"+t.getSeconds()).slice(-2);return r+"-"+a+"-"+s+" "+i+":"+o+":"+n},parseStatus:function(e){return 0==e?"无效":"有效"},queryData:function(){var e=this;this.$axios.post("/user/queryUserList",{searchInput:this.queryForm.searchInput,status:this.queryForm.status,pageSize:this.queryForm.pageSize,page:this.queryForm.page,roleType:this.queryForm.roleType}).then((function(t){200==t.code&&(e.userList=t.data.items,e.total=t.data.total)}))},changeUserStatus:function(e,t){var r=this;this.$confirm("此操作将"+t+"该管理员, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((function(){r.$axios.post("/user/changeUserStatus",{id:e.id,status:e.status}).then((function(e){200==e.code&&(r.$message.success("操作成功"),r.queryData())}))})).catch((function(){}))},submitForm:function(){var e=this;this.$axios.post("/user/register",{userName:this.userForm.userName,userAccount:this.userForm.userAccount,roleType:this.userForm.roleType,userPassword:this.userForm.userPassword}).then((function(t){200==t.code&&e.$message.success("管理员创建成功,初始密码为000000,请联系该管理员完善信息"),e.queryData(),e.createDialog=!1}))},showCreateDialog:function(){this.createDialog=!0},handleSizeChange:function(e){this.queryForm.pageSize=e,this.queryData()},handleCurrentChange:function(e){this.queryForm.page=e,this.queryData()}}}),o=i,n=r("2877"),l=Object(n["a"])(o,a,s,!1,null,"06e9cb93",null);t["default"]=l.exports},8418:function(e,t,r){"use strict";var a=r("c04e"),s=r("9bf2"),i=r("5c6c");e.exports=function(e,t,r){var o=a(t);o in e?s.f(e,o,i(0,r)):e[o]=r}},ae40:function(e,t,r){var a=r("83ab"),s=r("d039"),i=r("5135"),o=Object.defineProperty,n={},l=function(e){throw e};e.exports=function(e,t){if(i(n,e))return n[e];t||(t={});var r=[][e],u=!!i(t,"ACCESSORS")&&t.ACCESSORS,c=i(t,0)?t[0]:l,p=i(t,1)?t[1]:void 0;return n[e]=!!r&&!s((function(){if(u&&!a)return!0;var e={length:-1};u?o(e,1,{enumerable:!0,get:l}):e[1]=1,r.call(e,c,p)}))}},e8b5:function(e,t,r){var a=r("c6b6");e.exports=Array.isArray||function(e){return"Array"==a(e)}},fb6a:function(e,t,r){"use strict";var a=r("23e7"),s=r("861d"),i=r("e8b5"),o=r("23cb"),n=r("50c4"),l=r("fc6a"),u=r("8418"),c=r("b622"),p=r("1dde"),m=r("ae40"),d=p("slice"),f=m("slice",{ACCESSORS:!0,0:0,1:2}),h=c("species"),g=[].slice,y=Math.max;a({target:"Array",proto:!0,forced:!d||!f},{slice:function(e,t){var r,a,c,p=l(this),m=n(p.length),d=o(e,m),f=o(void 0===t?m:t,m);if(i(p)&&(r=p.constructor,"function"!=typeof r||r!==Array&&!i(r.prototype)?s(r)&&(r=r[h],null===r&&(r=void 0)):r=void 0,r===Array||void 0===r))return g.call(p,d,f);for(a=new(void 0===r?Array:r)(y(f-d,0)),c=0;d<f;d++,c++)d in p&&u(a,c,p[d]);return a.length=c,a}})}}]);
//# sourceMappingURL=chunk-82ff2638.89c1da50.js.map