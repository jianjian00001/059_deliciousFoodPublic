import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import aboutus from '@/views/modules/aboutus/list'
    import dazhongceping from '@/views/modules/dazhongceping/list'
    import discussshipinxinxi from '@/views/modules/discussshipinxinxi/list'
    import discussjiankanghuodong from '@/views/modules/discussjiankanghuodong/list'
    import discussgerenceping from '@/views/modules/discussgerenceping/list'
    import fenlei from '@/views/modules/fenlei/list'
    import forum from '@/views/modules/forum/list'
    import jiankangyinshi from '@/views/modules/jiankangyinshi/list'
    import systemintro from '@/views/modules/systemintro/list'
    import discussdazhongceping from '@/views/modules/discussdazhongceping/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shipinxinxi from '@/views/modules/shipinxinxi/list'
    import jiankanghuodong from '@/views/modules/jiankanghuodong/list'
    import pingfenxinxi from '@/views/modules/pingfenxinxi/list'
    import orders from '@/views/modules/orders/list'
    import yinshifenlei from '@/views/modules/yinshifenlei/list'
    import config from '@/views/modules/config/list'
    import gerenceping from '@/views/modules/gerenceping/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/aboutus',
        name: '关于我们',
        component: aboutus
      }
      ,{
	path: '/dazhongceping',
        name: '大众测评',
        component: dazhongceping
      }
      ,{
	path: '/discussshipinxinxi',
        name: '食品信息评论',
        component: discussshipinxinxi
      }
      ,{
	path: '/discussjiankanghuodong',
        name: '健康活动评论',
        component: discussjiankanghuodong
      }
      ,{
	path: '/discussgerenceping',
        name: '个人测评评论',
        component: discussgerenceping
      }
      ,{
	path: '/fenlei',
        name: '分类',
        component: fenlei
      }
      ,{
	path: '/forum',
        name: '话题广场',
        component: forum
      }
      ,{
	path: '/jiankangyinshi',
        name: '健康饮食',
        component: jiankangyinshi
      }
      ,{
	path: '/systemintro',
        name: '系统简介',
        component: systemintro
      }
      ,{
	path: '/discussdazhongceping',
        name: '大众测评评论',
        component: discussdazhongceping
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shipinxinxi',
        name: '食品信息',
        component: shipinxinxi
      }
      ,{
	path: '/jiankanghuodong',
        name: '健康活动',
        component: jiankanghuodong
      }
      ,{
	path: '/pingfenxinxi',
        name: '评分信息',
        component: pingfenxinxi
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/yinshifenlei',
        name: '饮食分类',
        component: yinshifenlei
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/gerenceping',
        name: '个人测评',
        component: gerenceping
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
   return originalPush.call(this, location).catch(err => err)
}
export default router;
