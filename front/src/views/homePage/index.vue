<template>
    <div align="center" style="padding-top: 10%">
        <h3 style="font-size: 30px">欢迎使用 后浪淘金-后台系统</h3>
    </div>
</template>

<script>
    export default {
        name: "home",
    }
</script>

<style lang="css" scoped>
    .el-carousel__item h3 {
        color: #475669;
        font-size: 18px;
        opacity: 0.75;
        line-height: 300px;
        margin: 0;
    }

    .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
    }

    .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
    }
</style>
