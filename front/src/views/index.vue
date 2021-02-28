<template>
    <el-container style="height: 800px;">
        <el-aside width="15%" style="background-color: #545c64">
            <Navbar/>
        </el-aside>
        <el-container>
            <el-header style="text-align: right; font-size: 12px">
                <span style="font-size: 20px">{{user.userName}}</span>
            </el-header>
            <el-main>
                <router-view></router-view>
            </el-main>
        </el-container>
    </el-container>
</template>

<script>
    import Navbar from "../components/Navbar";
    export default {
        name: "index",
        components: {
            Navbar,
        },
        data(){
            return{
                user:'',
            }
        },
        created(){
          this.getLoginInfo()
        },
        methods:{
            getLoginInfo(){
                this.$axios.post('/user/getLoginInfo',{
                }).then(resp=>{
                    if (resp.code == 200) {
                        this.user = resp.data
                    }else{
                        this.$message.error(resp.message);
                    }
                });
            },

            loginOut(){
                this.$axios.post('/user/loginOut',{
                }).then(
                    this.$router.push({name: 'login'})
                );
            }
        }
    }
</script>

<style scoped>

</style>
