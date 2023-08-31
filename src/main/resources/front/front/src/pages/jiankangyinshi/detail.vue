<template>
<div>
	<div :style='{"padding":"12px","boxShadow":"0 0px 6px #ccc","margin":"0px auto","borderColor":"#fff","borderRadius":"0px","background":"linear-gradient(180deg, #eee 0%,  #eee 100%)","borderWidth":"1px 0 1px 0","width":"100%","borderStyle":"solid"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'Ξ'" :style='{"width":"1200px","margin":"0 auto","fontSize":"14px","lineHeight":"1"}'>
			<el-breadcrumb-item>首页</el-breadcrumb-item>
			<el-breadcrumb-item v-for="(item, index) in breadcrumbItem" :key="index">{{item.name}}</el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	
	<div class="detail-preview" :style='{"padding":"0 0 24px","margin":"0px auto","flexWrap":"wrap","display":"flex","width":"1200px","position":"relative","justifyContent":"space-between"}'>
		<div class="attr" :style='{"border":"1px solid #eee","padding":"12px 0px 20px 0px","boxShadow":"0px 0px 0px #ddd,inset 0px 0px 0px 0px #e0f8e8","margin":"20px 0 20px 0","display":"flex","justifyContent":"space-between","minHeight":"600px","overflow":"hidden","borderRadius":"4px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20221123/02b65dd190a741a1ae9c37c17624c5aa.jpg) fixed center top no-repeat,#d4f2f3","width":"1200px","position":"relative"}'>
			<el-carousel :style='{"width":"575px","margin":"20px 0px 0 0","float":"left","height":"320px"}' trigger="click" indicator-position="inside" arrow="always" type="card" direction="horizontal" height="320px" autoplay="true" interval="3000" loop="true">
				<el-carousel-item :style='{"borderRadius":"0","width":"100%","height":"100%"}' v-for="item in detailBanner" :key="item.id">
					<el-image :style='{"objectFit":"cover","width":"50%","height":"100%"}' v-if="item.substr(0,4)=='http'" :src="item" fit="cover" class="image"></el-image>
					<el-image :style='{"objectFit":"cover","width":"50%","height":"100%"}' v-else :src="baseUrl + item" fit="cover" class="image"></el-image>
				</el-carousel-item>
			</el-carousel>
	
			
			<div class="info" :style='{"width":"575px","padding":"0px 0 20px","margin":"20px auto 0 auto","background":"none","height":"auto","order":"2"}'>
				<div class="item" :style='{"border":"0px solid #b0d2f2","padding":"6px 10px","boxShadow":"2px 2px 4px #87bfc2","margin":"0 0 16px 0","alignItems":"center","borderRadius":"0px","background":"radial-gradient(circle, rgba(43,224,232,1) 0%, rgba(0,173,181,1) 100%)","display":"flex","justifyContent":"space-between"}'>
					<div :style='{"color":"#fff","fontSize":"16px"}'>
                    </div>
				</div>

				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>标题</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.biaoti}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>分类</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.fenlei}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>账号</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.zhanghao}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>姓名</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.xingming}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>摄入热量/焦耳</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.reliang}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>摄入蛋白质/克</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.danbaizhi}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>摄入脂肪/克</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.zhifang}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>摄入碳水/克</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.tanshuihuahewu}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>登记时间</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.dengjishijian}}</div>
				</div>
				<div class="item" :style='{"padding":"0px 10px","boxShadow":"0px 0px 0px #ddd","margin":"0 0 6px 0","borderColor":"#ddd","borderRadius":"0px","background":"rgba(255,255,255,.6)","borderWidth":"1px 1px 1px 1px","display":"flex","borderStyle":"dashed","justifyContent":"spaceBetween"}'>
					<div class="lable" :style='{"padding":"0 10px","color":"#333","textAlign":"right","width":"130px","fontSize":"14px","lineHeight":"40px","minWidth":"130px"}'>登记内容</div>
					<div  :style='{"width":"498px","padding":"8px 10px 0","fontSize":"14px","lineHeight":"24px","color":"#666","height":"auto"}'>{{detail.dengjineirong}}</div>
				</div>
				<div class="btn" :style='{"padding":"10px 0","flexWrap":"wrap","display":"flex"}'>
				</div>
			</div>
			
		</div>
		
		
		<el-tabs class="detail" :style='{"border":"1px solid #eee","minHeight":"350px","boxShadow":"0px 0px 0px #ddd,inset 0px 0px 0px 0px #e0f8e8","padding":"20px","margin":"20px 0 0","borderRadius":"4px","background":"#FFF","width":"1200px"}' v-model="activeName" type="border-card">
		</el-tabs>
	</div>
</div>
</template>

<script>
  import CountDown from '@/components/CountDown';
  export default {
    //数据集合
    data() {
      return {
        tablename: 'jiankangyinshi',
        baseUrl: '',
        breadcrumbItem: [
          {
            name: '详情信息'
          }
        ],
        title: '',
        detailBanner: [],
        endTime: 0,
        detail: {},
        activeName: 'first',
        total: 1,
        pageSize: 5,
		pageSizes: [10,20,30,50],
        totalPage: 1,
        rules: {
          content: [
            { required: true, message: '请输入内容', trigger: 'blur' }
          ]
        },
        buynumber: 1,
      }
    },
    created() {
        this.init();
    },
    //方法集合
    methods: {
        init() {
          this.baseUrl = this.$config.baseUrl;
          if(this.$route.query.detailObj) {
            this.detail = JSON.parse(this.$route.query.detailObj);
          }
          if(this.$route.query.discussObj) {
            this.detail.id = JSON.parse(this.$route.query.discussObj).goodid;
          }
          this.$http.get(this.tablename + '/detail/'  + this.detail.id, {}).then(res => {
            if (res.data.code == 0) {
              this.detail = res.data.data;
              this.$forceUpdate();
            }
          });


        },
      curChange(page) {
        this.getInfo(page);
      },
      prevClick(page) {
        this.getInfo(page);
      },
      nextClick(page) {
        this.getInfo(page);
      },
      // 下载
      download(file){
        if(!file) {
            this.$message({
              type: 'error',
              message: '文件不存在',
              duration: 1500,
            });
            return;
        }
        window.open(this.baseUrl+file)
      },


    },
    components: {
      CountDown
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.detail-preview {
	
	  .attr {
	    .el-carousel /deep/ .el-carousel__indicator button {
	      width: 0;
	      height: 0;
	      display: none;
	    }
	
	    .el-input-number__decrease:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled), .el-input-number__increase:hover:not(.is-disabled)~.el-input .el-input__inner:not(.is-disabled) {
	      border-color: none;
	    }
	  }
	
	  .detail {
	    & /deep/ .el-tabs__header .el-tabs__nav-wrap {
	      margin-bottom: 0;
	    }
	
	    & .add .el-textarea {
	      width: auto;
	    }
	  }
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--left:hover {
		background: #70b3f1;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right {
		width: 36px;
		font-size: 12px;
		height: 36px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__container .el-carousel__arrow--right:hover {
		background: #70b3f1;
	}

	.attr .el-carousel /deep/ .el-carousel__indicators {
		padding: 0;
		margin: 0 0 0 0;
		z-index: 2;
		position: absolute;
		list-style: none;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li {
		border-radius: 50%;
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.4;
		transition: 0.3s;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li:hover {
		border-radius: 50%;
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 0.7;
		height: 12px;
	}
	
	.attr .el-carousel /deep/ .el-carousel__indicators li.is-active {
		border-radius: 50%;
		padding: 0;
		margin: 0 4px;
		background: #fff;
		display: inline-block;
		width: 12px;
		opacity: 1;
		height: 12px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		border-radius: 4px 0 0 4px;
		top: 1px;
		left: 1px;
		background: #f5f5f5;
		width: 40px;
		justify-content: center;
		border-width: 0 1px 0 0;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__decrease i {
		color: #666;
		font-size: 14px;
	}

	.attr .el-input-number /deep/ .el-input-number__increase {
		cursor: pointer;
		z-index: 1;
		display: flex;
		border-color: #DCDFE6;
		right: 1px;
		border-radius: 0 4px 4px 0;
		top: 1px;
		background: #f5f5f5;
		width: 40px;
		justify-content: center;
		border-width: 0 0 0 1px;
		align-items: center;
		position: absolute;
		border-style: solid;
		text-align: center;
		height: 38px;
	}
	
	.attr .el-input-number /deep/ .el-input-number__increase i {
		color: #666;
		font-size: 14px;
	}
	
	.attr .el-input-number /deep/ .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		border-radius: 4px;
		padding: 0 40px;
		outline: none;
		color: #666;
		background: #FFF;
		display: inline-block;
		width: 100%;
		font-size: 14px;
		line-height: 40px;
		text-align: center;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header {
		border-radius: 8px;
		padding: 0;
		margin: 0;
		background: #fff;
		width: 100%;
		border-color: #e4e7ed;
		border-width: 0;
		border-style: solid;
		text-align: center;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item {
		border: 0;
		padding: 0 24px;
		margin: 0 0px 0 0px;
		color: #333;
		font-weight: 500;
		display: inline-block;
		font-size: 14px;
		line-height: 40px;
		border-radius: 4px;
		background: url(http://codegen.caihongy.cn/20221121/105dda983a8641cdb4b2e19309374203.png) no-repeat left top,url(http://codegen.caihongy.cn/20221121/2399c20d2b1642e7befa8c2a7aa12de3.png) no-repeat right bottom,linear-gradient(180deg, rgba(225,240,240,1) 0%, rgba(225,240,240,1) 50%, rgba(0,173,181,1) 50%, rgba(0,173,181,1) 100%);
		width: 140px;
		position: relative;
		list-style: none;
		text-align: center;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
		border: 0;
		border-radius: 4px;
		padding: 0 24px;
		margin: 0 0px 0 0px;
		color: #333;
		background: url(http://codegen.caihongy.cn/20221121/105dda983a8641cdb4b2e19309374203.png) no-repeat left top,url(http://codegen.caihongy.cn/20221121/2399c20d2b1642e7befa8c2a7aa12de3.png) no-repeat right bottom,linear-gradient(0deg, rgba(225,240,240,1) 0%, rgba(225,240,240,1) 50%, rgba(0,173,181,1) 50%, rgba(0,173,181,1) 100%);
		width: 140px;
		line-height: 40px;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
		border: 0;
		border-radius: 4px;
		padding: 0 24px;
		margin: 0 0px 0 0px;
		color: #333;
		background: url(http://codegen.caihongy.cn/20221121/105dda983a8641cdb4b2e19309374203.png) no-repeat left top,url(http://codegen.caihongy.cn/20221121/2399c20d2b1642e7befa8c2a7aa12de3.png) no-repeat right bottom,linear-gradient(0deg, rgba(225,240,240,1) 0%, rgba(225,240,240,1) 50%, rgba(0,173,181,1) 50%, rgba(0,173,181,1) 100%);
		width: 140px;
		line-height: 40px;
		text-align: center;
		height: 40px;
	}
	
	.detail-preview .detail.el-tabs /deep/ .el-tabs__content {
		padding: 15px;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-form-item__label {
		padding: 0 10px 0 0;
		color: #666;
		width: 80px;
		font-size: 14px;
		line-height: 40px;
		text-align: right;
	}
	
	.detail-preview .detail.el-tabs .add /deep/ .el-textarea__inner {
		border: 0;
		border-radius: 4px;
		padding: 4px 12px;
		box-shadow: 0 0 0px rgba(64, 158, 255, .5);
		outline: none;
		color: #333;
		background: none;
		width: 1058px;
		font-size: 14px;
		min-height: 180px;
		line-height: 32px;
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 9px;
		color: #ccc;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__inner a {
		color: #333;
		display: inline-block;
	}

	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__inner {
		color: #999;
		display: inline-block;
	}
	
	.el-pagination /deep/ .el-pagination__total {
		margin: 0 10px 0 0;
		color: #666;
		font-weight: 400;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-prev {
		border: none;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-next {
		border: none;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-prev:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-next:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager {
		padding: 0;
		margin: 0;
		display: inline-block;
		vertical-align: top;
	}
	
	.el-pagination /deep/ .el-pager .number {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #666;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #f4f4f5;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager .number:hover {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #fff;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #00adb5;
		text-align: center;
		min-width: 30px;
		height: 28px;
}

.el-pagination /deep/ .el-pager .number.active {
		cursor: default;
		padding: 0 4px;
		margin: 0 5px;
		color: #FFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #00adb5;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes {
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input {
		margin: 0 5px;
		width: 100px;
		position: relative;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 25px 0 8px;
		color: #606266;
		display: inline-block;
		font-size: 13px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
		top: 0;
		position: absolute;
		right: 0;
		height: 100%;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
		cursor: pointer;
		color: #C0C4CC;
		width: 25px;
		font-size: 14px;
		line-height: 28px;
		text-align: center;
	}

	.el-pagination /deep/ .el-pagination__jump {
		margin: 0 0 0 24px;
		color: #606266;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__jump .el-input {
		border-radius: 3px;
		padding: 0 2px;
		margin: 0 2px;
		display: inline-block;
		width: 50px;
		font-size: 14px;
		line-height: 18px;
		position: relative;
		text-align: center;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 3px;
		color: #606266;
		display: inline-block;
		font-size: 14px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
</style>
