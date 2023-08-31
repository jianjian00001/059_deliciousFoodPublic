<template>
  <div :style='{"border":"1px solid #eee","padding":"20px","boxShadow":"0px 0px 0px #ccc,inset 0px 0px 0px 0px #eee","margin":"20px auto 0","borderRadius":"4px","background":"#fff","width":"1200px","position":"relative"}'>
    <div class="section-title" :style='{"padding":"40px 0 30px","margin":"20px auto 20px","borderColor":"#a2e9ec","color":"#00adb5","textAlign":"center","borderRadius":"0 0 4px 4px","background":"url(http://codegen.caihongy.cn/20221123/c9c8672afe48414f86a45016ddd346b4.png) no-repeat center top,radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%)","borderWidth":"1px","width":"100%","fontSize":"30px","lineHeight":"30px","borderStyle":"solid","fontWeight":"600"}'>公告信息</div>
    <div class="section-content">
      <div class="content-title">{{detail.title}}</div>
      <div class="content-sub-title">发布时间：{{detail.addtime}}</div>
      <el-divider></el-divider>
      <div class="content-detail" v-html="detail.content"></div>
    </div>
  </div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        detail: {},
      }
    },
    created() {
      this.detail = Object.assign({}, JSON.parse(this.$route.query.detailObj));
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .section {
    width: 900px;
    margin: 0 auto;
  }

  .section-content {
      margin-top: 30px;
  }
  .content-title {
      text-align: center;
      font-size: 22px;
      font-weight: bold;
  }
  .content-sub-title {
      text-align: center;
      margin-top: 20px;
      color: #888888;
      font-size: 14px;
  }
</style>