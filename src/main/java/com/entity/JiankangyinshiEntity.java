package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康饮食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@TableName("jiankangyinshi")
public class JiankangyinshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangyinshiEntity() {
		
	}
	
	public JiankangyinshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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
