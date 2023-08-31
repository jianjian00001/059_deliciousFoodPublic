<template>
<div :style='{"border":"1px solid #eee","padding":"20px","boxShadow":"0px 0px 0px #ccc,inset 0px 0px 0px 0px #eee","margin":"20px auto 0","borderRadius":"4px","background":"#fff","width":"1200px","position":"relative"}'>
    <el-form
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
    >
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="标题" prop="title">
            <el-input v-model="ruleForm.title" 
                placeholder="标题" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="副标题" prop="subtitle">
            <el-input v-model="ruleForm.subtitle" 
                placeholder="副标题" clearable ></el-input>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="图片1" prop="picture1">
            <file-upload
            tip="点击上传图片1"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.picture1?ruleForm.picture1:''"
            @change="picture1UploadChange"
            ></file-upload>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="图片2" prop="picture2">
            <file-upload
            tip="点击上传图片2"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.picture2?ruleForm.picture2:''"
            @change="picture2UploadChange"
            ></file-upload>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="图片3" prop="picture3">
            <file-upload
            tip="点击上传图片3"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.picture3?ruleForm.picture3:''"
            @change="picture3UploadChange"
            ></file-upload>
          </el-form-item>
          <el-form-item :style='{"border":"0px solid #dfdfdf","padding":"10px","boxShadow":"0px 0px 0px #eee","margin":"0 0 8px 0","borderRadius":"8px","background":"none"}' label="内容" prop="content">
            <editor 
                :style='{"minHeight":"200px","padding":"0","margin":"0","borderColor":"#ccc","backgroundColor":"#fff","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.content" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"20px 0 20px 0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","boxShadow":"1px 2px 4px #ccc","margin":"0 20px 0 0","color":"#fff","outline":"none","borderRadius":"20px","background":"radial-gradient(circle, rgba(43,224,232,1) 0%, rgba(0,173,181,1) 100%)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #bbb","cursor":"pointer","padding":"0","boxShadow":"4px 4px 8px #eee","margin":"0","color":"#999","outline":"none","borderRadius":"20px","background":"#fff","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
        },
        rules: {
          title: [
            { required: true, message: '标题不能为空', trigger: 'blur' },
          ],
          subtitle: [
          ],
          content: [
            { required: true, message: '内容不能为空', trigger: 'blur' },
          ],
          picture1: [
          ],
          picture2: [
          ],
          picture3: [
          ],
        },
      };
    },
    computed: {



    },
    created() {
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='title'){
              this.ruleForm.title = obj[o];
              continue;
            }
            if(o=='subtitle'){
              this.ruleForm.subtitle = obj[o];
              continue;
            }
            if(o=='content'){
              this.ruleForm.content = obj[o];
              continue;
            }
            if(o=='picture1'){
              this.ruleForm.picture1 = obj[o].split(",")[0];
              continue;
            }
            if(o=='picture2'){
              this.ruleForm.picture2 = obj[o].split(",")[0];
              continue;
            }
            if(o=='picture3'){
              this.ruleForm.picture3 = obj[o].split(",")[0];
              continue;
            }
          }
        }
      },

    // 多级联动参数
      // 多级联动参数
      info(id) {
        this.$http.get('systemintro/detail/${id}', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('systemintro/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post('systemintro/add', this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post('systemintro/add', this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      picture1UploadChange(fileUrls) {
          this.ruleForm.picture1 = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      picture2UploadChange(fileUrls) {
          this.ruleForm.picture2 = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      picture3UploadChange(fileUrls) {
          this.ruleForm.picture3 = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 80px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 80px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #00adb5;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #666;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #00adb5;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #666;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #00adb5;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #666;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px solid #00adb5;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #00adb5;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  height: auto;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #00adb5;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #00adb5;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  height: auto;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #00adb5;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #00adb5;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 200px;
	  font-size: 32px;
	  line-height: 120px;
	  text-align: center;
	  height: auto;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #00adb5;
	  border-radius: 4px;
	  padding: 12px;
	  outline: none;
	  color: #666;
	  background: radial-gradient(circle, rgba(237,250,251,1) 35%, rgba(162,233,236,1) 100%);
	  width: 400px;
	  font-size: 14px;
	  min-height: 120px;
	}
</style>
