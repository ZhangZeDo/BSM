(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-50068340"],{"1dde":function(t,e,a){var r=a("d039"),i=a("b622"),n=a("2d00"),s=i("species");t.exports=function(t){return n>=51||!r((function(){var e=[],a=e.constructor={};return a[s]=function(){return{foo:1}},1!==e[t](Boolean).foo}))}},8418:function(t,e,a){"use strict";var r=a("c04e"),i=a("9bf2"),n=a("5c6c");t.exports=function(t,e,a){var s=r(e);s in t?i.f(t,s,n(0,a)):t[s]=a}},ae40:function(t,e,a){var r=a("83ab"),i=a("d039"),n=a("5135"),s=Object.defineProperty,o={},l=function(t){throw t};t.exports=function(t,e){if(n(o,t))return o[t];e||(e={});var a=[][t],c=!!n(e,"ACCESSORS")&&e.ACCESSORS,u=n(e,0)?e[0]:l,d=n(e,1)?e[1]:void 0;return o[t]=!!a&&!i((function(){if(c&&!r)return!0;var t={length:-1};c?s(t,1,{enumerable:!0,get:l}):t[1]=1,a.call(t,u,d)}))}},bcaa:function(t,e,a){"use strict";a.r(e);var r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",[t._m(0),a("el-card",{staticStyle:{margin:"20px 100px"}},[a("div",{staticStyle:{height:"30px"},attrs:{slot:"header"},slot:"header"},[a("div",{staticStyle:{float:"left","margin-right":"10px"}},[a("label",{},[t._v("快速查询:")])]),a("div",{staticStyle:{float:"left","margin-right":"10px"}},[a("el-input",{attrs:{size:"small",placeholder:"搜索作品标题或备注",clearable:""},on:{change:function(e){return t.queryData()}},model:{value:t.queryForm.searchInput,callback:function(e){t.$set(t.queryForm,"searchInput",e)},expression:"queryForm.searchInput"}},[a("i",{staticClass:"el-input__icon el-icon-search",attrs:{slot:"prefix"},slot:"prefix"})])],1),a("div",{staticStyle:{float:"left","margin-right":"10px","padding-left":"20px"}},[a("label",{},[t._v("作品状态:")])]),a("div",{staticStyle:{float:"left","margin-right":"10px"}},[a("el-select",{attrs:{size:"small",clearable:"",placeholder:"请选择作品状态"},on:{change:function(e){return t.queryData()}},model:{value:t.queryForm.status,callback:function(e){t.$set(t.queryForm,"status",e)},expression:"queryForm.status"}},[a("el-option",{attrs:{value:"1",label:"有效"}},[t._v("有效")]),a("el-option",{attrs:{value:"0",label:"无效"}},[t._v("无效")])],1)],1)]),a("div",[a("el-table",{staticStyle:{width:"100%"},attrs:{data:t.meidaList,stripe:""}},[a("el-table-column",{staticStyle:{width:"15%"},attrs:{label:"作品名称"},on:{click:function(e){return t.showDetail(t.id)}},scopedSlots:t._u([{key:"default",fn:function(e){return[a("span",{staticStyle:{color:"#3a8ee6"},on:{click:function(a){return t.showDetail(e.row.id)}}},[t._v(t._s(e.row.mediaName))])]}}])}),a("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"createBy",label:"上传人"}}),a("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"approvalUser",label:"审批人"}}),a("el-table-column",{staticStyle:{width:"15%"},attrs:{label:"状态"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v(" "+t._s(t.parseStatus(e.row.status))+" ")]}}])}),a("el-table-column",{staticStyle:{width:"15%"},attrs:{label:"创建时间"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v(" "+t._s(t.parseTime(e.row.createDatetime))+" ")]}}])}),a("el-table-column",{staticStyle:{width:"15%"},attrs:{prop:"updateBy",label:"更新人"}}),a("el-table-column",{staticStyle:{width:"10%"},attrs:{label:"操作"},scopedSlots:t._u([{key:"default",fn:function(e){return[0==e.row.status?a("el-button",{attrs:{type:"primary",size:"mini"},on:{click:function(a){return t.changeMediaStatus(e.row,"启用")}}},[t._v("启用")]):a("el-button",{attrs:{type:"danger",size:"mini"},on:{click:function(a){return t.changeMediaStatus(e.row,"禁用")}}},[t._v("禁用")])]}}])})],1)],1),a("div",{staticStyle:{"padding-top":"20px"}},[a("div",{staticClass:"block"},[a("el-pagination",{attrs:{"current-page":t.queryForm.page,"page-size":t.queryForm.pageSize,"page-sizes":[5,10,15,20],layout:"total, sizes,prev, pager, next, jumper",total:t.total},on:{"size-change":t.handleSizeChange,"current-change":t.handleCurrentChange}})],1)])])],1)])},i=[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"card-header",staticStyle:{"margin-top":"20px","margin-left":"100px"}},[a("h3",[t._v("作品列表")])])}],n=(a("fb6a"),{name:"mediaList",data:function(){return{meidaList:[],queryForm:{searchInput:"",status:"",pageSize:5,page:1,order:""},total:0}},created:function(){this.queryData()},methods:{parseTime:function(t){var e=new Date(t),a=e.getFullYear(),r=("0"+(e.getMonth()+1)).slice(-2),i=("0"+e.getDate()).slice(-2),n=("0"+e.getHours()).slice(-2),s=("0"+e.getMinutes()).slice(-2),o=("0"+e.getSeconds()).slice(-2);return a+"-"+r+"-"+i+" "+n+":"+s+":"+o},parseStatus:function(t){return 0==t?"无效":"有效"},queryData:function(){var t=this;this.$axios.post("/mediaWork/mediaWorkList",{searchInput:this.queryForm.searchInput,status:this.queryForm.status,pageSize:this.queryForm.pageSize,page:this.queryForm.page,order:this.queryForm.order}).then((function(e){200==e.code&&(t.meidaList=e.data.items,t.total=e.data.total)}))},changeMediaStatus:function(t,e){var a=this;this.$confirm("此操作将"+e+"该作品类型, 是否继续?","提示",{confirmButtonText:"确定",cancelButtonText:"取消",type:"warning"}).then((function(){a.$axios.post("/mediaWork/changeMediaWorkStatus",{id:t.id,status:t.status}).then((function(t){200==t.code&&(a.$message.success("操作成功"),a.queryData())}))})).catch((function(){}))},handleSizeChange:function(t){this.queryForm.pageSize=t,this.queryData()},handleCurrentChange:function(t){this.queryForm.page=t,this.queryData()},showDetail:function(t){this.$router.push({path:"/mediaDetail",query:{mediaId:t}})}}}),s=n,o=a("2877"),l=Object(o["a"])(s,r,i,!1,null,"0e150bda",null);e["default"]=l.exports},e8b5:function(t,e,a){var r=a("c6b6");t.exports=Array.isArray||function(t){return"Array"==r(t)}},fb6a:function(t,e,a){"use strict";var r=a("23e7"),i=a("861d"),n=a("e8b5"),s=a("23cb"),o=a("50c4"),l=a("fc6a"),c=a("8418"),u=a("b622"),d=a("1dde"),p=a("ae40"),f=d("slice"),h=p("slice",{ACCESSORS:!0,0:0,1:2}),m=u("species"),y=[].slice,g=Math.max;r({target:"Array",proto:!0,forced:!f||!h},{slice:function(t,e){var a,r,u,d=l(this),p=o(d.length),f=s(t,p),h=s(void 0===e?p:e,p);if(n(d)&&(a=d.constructor,"function"!=typeof a||a!==Array&&!n(a.prototype)?i(a)&&(a=a[m],null===a&&(a=void 0)):a=void 0,a===Array||void 0===a))return y.call(d,f,h);for(r=new(void 0===a?Array:a)(g(h-f,0)),u=0;f<h;f++,u++)f in d&&c(r,u,d[f]);return r.length=u,r}})}}]);
//# sourceMappingURL=chunk-50068340.593ab115.js.map