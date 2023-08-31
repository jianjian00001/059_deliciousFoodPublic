export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除"],"menu":"饮食分类","menuJump":"列表","tableName":"yinshifenlei"}],"menu":"饮食分类管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","饮食分类","查看评论","首页总数","首页统计"],"menu":"食品信息","menuJump":"列表","tableName":"shipinxinxi"}],"menu":"食品信息管理"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除","查看评论"],"menu":"健康活动","menuJump":"列表","tableName":"jiankanghuodong"}],"menu":"健康活动管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"分类","menuJump":"列表","tableName":"fenlei"}],"menu":"分类管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","删除","评测统计","查看评论","首页总数","首页统计"],"menu":"个人测评","menuJump":"列表","tableName":"gerenceping"}],"menu":"个人测评管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","评分统计","查看评论","首页总数","首页统计"],"menu":"大众测评","menuJump":"列表","tableName":"dazhongceping"}],"menu":"大众测评管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","删除"],"menu":"评分信息","menuJump":"列表","tableName":"pingfenxinxi"}],"menu":"评分信息管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["删除","查看"],"menu":"健康饮食","menuJump":"列表","tableName":"jiankangyinshi"}],"menu":"健康饮食管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看","删除"],"menu":"话题广场","tableName":"forum"}],"menu":"话题广场"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-link","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-list","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","物流"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"已取消订单","tableName":"orders/已取消"},{"appFrontIcon":"cuIcon-medal","buttons":["查看","物流"],"menu":"已退款订单","tableName":"orders/已退款"},{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","物流"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-vip","buttons":["查看","发货","物流"],"menu":"已支付订单","tableName":"orders/已支付"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论"],"menu":"食品信息列表","menuJump":"列表","tableName":"shipinxinxi"}],"menu":"食品信息模块"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","查看评论"],"menu":"健康活动列表","menuJump":"列表","tableName":"jiankanghuodong"}],"menu":"健康活动模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","查看评论"],"menu":"个人测评列表","menuJump":"列表","tableName":"gerenceping"}],"menu":"个人测评模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看评论","查看","评分"],"menu":"大众测评列表","menuJump":"列表","tableName":"dazhongceping"}],"menu":"大众测评模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["新增","查看","修改","删除","查看评论"],"menu":"个人测评","menuJump":"列表","tableName":"gerenceping"}],"menu":"个人测评管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"评分信息","menuJump":"列表","tableName":"pingfenxinxi"}],"menu":"评分信息管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"健康饮食","menuJump":"列表","tableName":"jiankangyinshi"}],"menu":"健康饮食管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","查看评论"],"menu":"食品信息列表","menuJump":"列表","tableName":"shipinxinxi"}],"menu":"食品信息模块"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","查看评论"],"menu":"健康活动列表","menuJump":"列表","tableName":"jiankanghuodong"}],"menu":"健康活动模块"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","查看评论"],"menu":"个人测评列表","menuJump":"列表","tableName":"gerenceping"}],"menu":"个人测评模块"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看评论","查看","评分"],"menu":"大众测评列表","menuJump":"列表","tableName":"dazhongceping"}],"menu":"大众测评模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
