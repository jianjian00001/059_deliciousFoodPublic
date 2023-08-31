package com.entity.vo;

import com.entity.GerencepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 个人测评
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public class GerencepingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 评测标题
	 */
	
	private String pingcebiaoti;
		
	/**
	 * 评测封面
	 */
	
	private String pingcefengmian;
		
	/**
	 * 饮食分类
	 */
	
	private String yinshifenlei;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 评测时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingceshijian;
		
	/**
	 * 评测内容
	 */
	
	private String pingceneirong;
		
	/**
	 * 评测结果
	 */
	
	private String pingcejieguo;
				
	
	/**
	 * 设置：评测标题
	 */
	 
	public void setPingcebiaoti(String pingcebiaoti) {
		this.pingcebiaoti = pingcebiaoti;
	}
	
	/**
	 * 获取：评测标题
	 */
	public String getPingcebiaoti() {
		return pingcebiaoti;
	}
				
	
	/**
	 * 设置：评测封面
	 */
	 
	public void setPingcefengmian(String pingcefengmian) {
		this.pingcefengmian = pingcefengmian;
	}
	
	/**
	 * 获取：评测封面
	 */
	public String getPingcefengmian() {
		return pingcefengmian;
	}
				
	
	/**
	 * 设置：饮食分类
	 */
	 
	public void setYinshifenlei(String yinshifenlei) {
		this.yinshifenlei = yinshifenlei;
	}
	
	/**
	 * 获取：饮食分类
	 */
	public String getYinshifenlei() {
		return yinshifenlei;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：评测时间
	 */
	 
	public void setPingceshijian(Date pingceshijian) {
		this.pingceshijian = pingceshijian;
	}
	
	/**
	 * 获取：评测时间
	 */
	public Date getPingceshijian() {
		return pingceshijian;
	}
				
	
	/**
	 * 设置：评测内容
	 */
	 
	public void setPingceneirong(String pingceneirong) {
		this.pingceneirong = pingceneirong;
	}
	
	/**
	 * 获取：评测内容
	 */
	public String getPingceneirong() {
		return pingceneirong;
	}
				
	
	/**
	 * 设置：评测结果
	 */
	 
	public void setPingcejieguo(String pingcejieguo) {
		this.pingcejieguo = pingcejieguo;
	}
	
	/**
	 * 获取：评测结果
	 */
	public String getPingcejieguo() {
		return pingcejieguo;
	}
			
}
