import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

const routers = new Router({
    routes:[
        {
            path:'/',
            redirect: '/login',
        },
        {
            path:'/login',
            name:'login',
            component:()=>import('@/views/login')
        },
        {
          path:'/register',
          name:'register',
          component:()=>import('@/views/login/register')
        },
        {
            path:'/forgetPass',
            name:'forgetPass',
            component:()=>import('@/views/login/forgetPass')
        },
        {
            path:'/index',
            name:'index',
            component:()=> import('@/views/index'),
            redirect:'/homePage',
            children:[
                {
                    path:'/homePage',
                    name:'homePage',
                    component: () => import('@/views/homePage'),
                },
                {
                    path:'/customerList',
                    name:'customerList',
                    component: () => import('@/views/customer/customerList'),
                },
                {
                    path:'/stockInfoList',
                    name:'stockInfoList',
                    component: () => import('@/views/stockModule/stockInfoList'),
                },
                {
                    path:'/stockConfig',
                    name:'stockConfig',
                    component: () => import('@/views/stockModule/stockConfig'),
                },
                {
                    path:'/stockStrategy',
                    name:'stockStrategy',
                    component: () => import('@/views/stockModule/stockStrategy'),
                },
                {
                    path:'/customerRegister',
                    name:'customerRegister',
                    component: () => import('@/views/stockModule/customerRegister'),
                },
                {
                    path:'/customerSale',
                    name:'customerSale',
                    component: () => import('@/views/stockModule/customerSale'),
                },
                {
                    path:'/fundInfo',
                    name:'fundInfo',
                    component: () => import('@/views/fund/fundInfo'),
                },
            ]
        },
    ]
})

export default routers
