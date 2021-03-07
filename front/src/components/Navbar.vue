<template>
  <div>
      <div style="background-color:#545c64;">
          <el-row>
              <div style="height: 50px;padding-left:11%;margin-top: 10%"  @click="jump('homePage')">
                  <p style="font-size: 22px;color: #edf5d0">后浪淘金-后台系统</p>
              </div>
          </el-row>
          <el-row class="tac">
              <el-col >
                  <el-menu
                          default-active="1"
                          class="el-menu-vertical-demo"
                          @open="handleOpen"
                          @close="handleClose"
                          background-color="#545c64"
                          text-color="#fff"
                          active-text-color="#ffd04b">
                      <el-menu-item  index="1" @click="jump('customerList')">
                          <i class="el-icon-location"></i>
                          <span slot="title" style="font-size: 18px">用户列表</span>
                      </el-menu-item >
                      <el-submenu index="2">
                          <template slot="title">
                              <i class="el-icon-menu"></i>
                              <span slot="title" style="font-size: 18px">打新模块</span>
                          </template>
                          <el-menu-item index="2-1" style="font-size: 18px" @click="jump('stockInfoList')">新股数据上传</el-menu-item>
                          <el-menu-item index="2-2" style="font-size: 18px" @click="jump('stockConfig')">打新统计配置</el-menu-item>
                          <el-menu-item index="2-3" style="font-size: 18px" @click="jump('stockStrategy')">新股申购策略</el-menu-item>
                          <el-menu-item index="2-4" style="font-size: 18px" @click="jump('customerRegister')">用户中签登记</el-menu-item>
                          <el-menu-item index="2-5" style="font-size: 18px" @click="jump('customerSale')">用户卖出</el-menu-item>
                      </el-submenu>
                      <el-menu-item index="3" @click="jump('fundInfo')">
                          <i class="el-icon-document"></i>
                          <span slot="title" style="font-size: 18px">明星基金跟踪</span>
                      </el-menu-item>
                  </el-menu>
              </el-col>
          </el-row>
      </div>
  </div>
</template>

<script>
    export default {
        name: 'Navbar',
        data() {

        },
        methods: {
            handleOpen(key, keyPath) {
                window.console.info(key, keyPath)
            },
            handleClose(key, keyPath) {
                window.console.info(key, keyPath)
            },
            jump(path){
                this.$router.push({path:path})
            },
        }
    }
</script>

<style scoped>
</style>
