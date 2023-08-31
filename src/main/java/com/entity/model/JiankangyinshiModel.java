package com.entity.model;

import com.entity.JiankangyinshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康饮食
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public class JiankangyinshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 摄入热量/焦耳
	 */
	
	private Float reliang;
		
	/**
	 * 摄入蛋白质/克
	 */
	
	private Float danbaizhi;
		
	/**
	 * 摄入脂肪/克
	 */
	
	private Float zhifang;
		
	/**
	 * 摄入碳水/克
	 */
	
	private Float tanshuihuahewu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 登记内容
	 */
	
	private String dengjineirong;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
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
	 * 设置：摄入热量/焦耳
	 */
	 
	public void setReliang(Float reliang) {
		this.reliang = reliang;
	}
	
	/**
	 * 获取：摄入热量/焦耳
	 */
	public Float getReliang() {
		return reliang;
	}
				
	
	/**
	 * 设置：摄入蛋白质/克
	 */
	 
	public void setDanbaizhi(Float danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	
	/**
	 * 获取：摄入蛋白质/克
	 */
	public Float getDanbaizhi() {
		return danbaizhi;
	}
				
	
	/**
	 * 设置：摄入脂肪/克
	 */
	 
	public void setZhifang(Float zhifang) {
		this.zhifang = zhifang;
	}
	
	/**
	 * 获取：摄入脂肪/克
	 */
	public Float getZhifang() {
		return zhifang;
	}
				
	
	/**
	 * 设置：摄入碳水/克
	 */
	 
	public void setTanshuihuahewu(Float tanshuihuahewu) {
		this.tanshuihuahewu = tanshuihuahewu;
	}
	
	/**
	 * 获取：摄入碳水/克
	 */
	public Float getTanshuihuahewu() {
		return tanshuihuahewu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：登记内容
	 */
	 
	public void setDengjineirong(String dengjineirong) {
		this.dengjineirong = dengjineirong;
	}
	
	/**
	 * 获取：登记内容
	 */
	public String getDengjineirong() {
		return dengjineirong;
	}
			
}
