<template>
    <el-container style="height: 800px;">
        <el-aside width="15%" style="background-color: #545c64">
            <Navbar/>
        </el-aside>
        <el-container>
            <el-header style="text-align: right; font-size: 12px">
                <span>标题</span>
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
                modelName:'HomePage',
            }
        },
        created(){
          this.modelName = this.$route.query.modelName;
        },
        methods:{

        }
    }
</script>

<style scoped>

</style>
