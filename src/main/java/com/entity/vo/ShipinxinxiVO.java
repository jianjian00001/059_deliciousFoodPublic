package com.entity.vo;

import com.entity.ShipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 食品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
public class ShipinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食品封面
	 */
	
	private String shipinfengmian;
		
	/**
	 * 饮食分类
	 */
	
	private String yinshifenlei;
		
	/**
	 * 口味
	 */
	
	private String kouwei;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 健康作用
	 */
	
	private String jiankangzuoyong;
		
	/**
	 * 营养成分
	 */
	
	private String yingyangchengfen;
		
	/**
	 * 热量/焦耳
	 */
	
	private Float reliang;
		
	/**
	 * 蛋白质/克
	 */
	
	private Float danbaizhi;
		
	/**
	 * 脂肪/克
	 */
	
	private Float zhifang;
		
	/**
	 * 碳水化合物/克
	 */
	
	private Float tanshuihuahewu;
		
	/**
	 * 产地
	 */
	
	private String chandi;
		
	/**
	 * 有效期
	 */
	
	private String youxiaoqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：食品封面
	 */
	 
	public void setShipinfengmian(String shipinfengmian) {
		this.shipinfengmian = shipinfengmian;
	}
	
	/**
	 * 获取：食品封面
	 */
	public String getShipinfengmian() {
		return shipinfengmian;
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
	 * 设置：口味
	 */
	 
	public void setKouwei(String kouwei) {
		this.kouwei = kouwei;
	}
	
	/**
	 * 获取：口味
	 */
	public String getKouwei() {
		return kouwei;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：健康作用
	 */
	 
	public void setJiankangzuoyong(String jiankangzuoyong) {
		this.jiankangzuoyong = jiankangzuoyong;
	}
	
	/**
	 * 获取：健康作用
	 */
	public String getJiankangzuoyong() {
		return jiankangzuoyong;
	}
				
	
	/**
	 * 设置：营养成分
	 */
	 
	public void setYingyangchengfen(String yingyangchengfen) {
		this.yingyangchengfen = yingyangchengfen;
	}
	
	/**
	 * 获取：营养成分
	 */
	public String getYingyangchengfen() {
		return yingyangchengfen;
	}
				
	
	/**
	 * 设置：热量/焦耳
	 */
	 
	public void setReliang(Float reliang) {
		this.reliang = reliang;
	}
	
	/**
	 * 获取：热量/焦耳
	 */
	public Float getReliang() {
		return reliang;
	}
				
	
	/**
	 * 设置：蛋白质/克
	 */
	 
	public void setDanbaizhi(Float danbaizhi) {
		this.danbaizhi = danbaizhi;
	}
	
	/**
	 * 获取：蛋白质/克
	 */
	public Float getDanbaizhi() {
		return danbaizhi;
	}
				
	
	/**
	 * 设置：脂肪/克
	 */
	 
	public void setZhifang(Float zhifang) {
		this.zhifang = zhifang;
	}
	
	/**
	 * 获取：脂肪/克
	 */
	public Float getZhifang() {
		return zhifang;
	}
				
	
	/**
	 * 设置：碳水化合物/克
	 */
	 
	public void setTanshuihuahewu(Float tanshuihuahewu) {
		this.tanshuihuahewu = tanshuihuahewu;
	}
	
	/**
	 * 获取：碳水化合物/克
	 */
	public Float getTanshuihuahewu() {
		return tanshuihuahewu;
	}
				
	
	/**
	 * 设置：产地
	 */
	 
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	
	/**
	 * 获取：产地
	 */
	public String getChandi() {
		return chandi;
	}
				
	
	/**
	 * 设置：有效期
	 */
	 
	public void setYouxiaoqi(String youxiaoqi) {
		this.youxiaoqi = youxiaoqi;
	}
	
	/**
	 * 获取：有效期
	 */
	public String getYouxiaoqi() {
		return youxiaoqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
