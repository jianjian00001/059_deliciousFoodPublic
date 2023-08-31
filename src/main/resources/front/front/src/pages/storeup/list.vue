<template>
<div :style='{"border":"1px solid #eee","padding":"20px","boxShadow":"0px 0px 0px #ccc,inset 0px 0px 0px 0px #eee","margin":"20px auto 0","borderRadius":"4px","background":"#fff","width":"1200px","position":"relative"}'>
    <el-button :style='{"border":"0px solid #ffc800","cursor":"pointer","padding":"0 10px","margin":"0 5px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#00adb5","width":"auto","lineHeight":"40px","fontSize":"14px","height":"40px"}' type="warning" size="mini" @click="backClick" class="el-icon-back">返回</el-button>
    <div v-if="storeupType==1" class="section-title" :style='{"padding":"40px 0 30px","margin":"20px auto 20px","borderColor":"#a2e9ec","color":"#00adb5","textAlign":"center","borderRadius":"0 0 4px 4px","background":"url(http://codegen.caihongy.cn/20221123/c9c8672afe48414f86a45016ddd346b4.png) no-repeat center top,radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%)","borderWidth":"1px","width":"100%","fontSize":"30px","lineHeight":"30px","borderStyle":"solid","fontWeight":"600"}'>我的收藏</div>
    <el-form :inline="true" :model="formSearch" class="formSearch">
      <el-form-item>
        <el-input v-model="formSearch.name" placeholder="名称"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="getStoreupList(1)">查询</el-button>
      </el-form-item>
    </el-form>
    <el-row :gutter="20">
      <el-col :span="6" v-for="(item, index) in storeupList" :key="index" @click.native="toDetail(item)">
        <el-card :body-style="{ padding: '0px', cursor: 'pointer' }">
          <el-image :src="baseUrl + item.picture" fit="fill" class="image"></el-image>
          <div style="padding: 14px;">
            <span v-if="item.remark">{{item.name}}</span>
            <span v-if="!item.remark">{{item.name}}</span>
          </div>
        </el-card>
      </el-col>
    </el-row>
	
    <el-pagination
      background
      class="pagination"
      :pager-count="7"
      :page-size="pageSize"
      :page-sizes="pageSizes"
	  prev-text="<"
      next-text=">"
      :hide-on-single-page="true"
      :layout='["total","prev","pager","next","sizes","jumper"].join()'
      :total="total"
      :style='{"padding":"0","margin":"20px auto","whiteSpace":"nowrap","color":"#333","width":"1200px","fontWeight":"500","order":"4"}'
      @current-change="curChange"
      @prev-click="prevClick"
      @next-click="nextClick"
    ></el-pagination>
	
</div>
</template>

<script>
  import config from '@/config/config'
  export default {
    data() {
      return {
		  layouts: '',
        baseUrl: config.baseUrl,
        formSearch: {
          name: ''
        },
        storeupType: 1,
        storeupList: [],
        total: 1,
        pageSize: 8,
		pageSizes: [10,20,30,50],
        totalPage: 1
      }
    },
    created() {
      this.storeupType = localStorage.getItem('storeupType');
      this.getStoreupList(1);
    },
    methods: {
      backClick() {
          this.$router.push('/index/center')
      },
      getStoreupList(page) {
        let params = {page, limit: this.pageSize, type: this.storeupType, userid: localStorage.getItem('userid'),sort:"addtime",order:"desc"};
        let searchWhere = {};
        if (this.formSearch.name != '') searchWhere.name = '%' + this.formSearch.name + '%';
        this.$http.get('storeup/list', {params: Object.assign(params, searchWhere)}).then(res => {
          if (res.data.code == 0) {
            this.storeupList = res.data.data.list;
            this.total = res.data.data.total;
            this.pageSize = res.data.data.pageSize;this.pageSizes = [this.pageSize, this.pageSize*2, this.pageSize*3, this.pageSize*5];
            this.totalPage = res.data.data.totalPage;
          }
        });
      },
      curChange(page) {
        this.getStoreupList(page);
      },
      prevClick(page) {
        this.getStoreupList(page);
      },
      nextClick(page) {
        this.getStoreupList(page);
      },
      toDetail(item) {
        this.$router.push({path: `/index/${item.tablename}Detail`, query: {storeupObj: JSON.stringify(item)}});
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.section {
	  width: 900px;
	  margin: 0 auto;
	}

	.formSearch {
	  text-align: right;
	}
	.image {
	  height: 233px;
	  width: 100%;
	  display: block;
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
