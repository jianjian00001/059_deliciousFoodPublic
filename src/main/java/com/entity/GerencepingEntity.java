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
 * 个人测评
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@TableName("gerenceping")
public class GerencepingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GerencepingEntity() {
		
	}
	
	public GerencepingEntity(T t) {
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
	 * 评测编号
	 */
					
	private String pingcebianhao;
	
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
	 * 设置：评测编号
	 */
	public void setPingcebianhao(String pingcebianhao) {
		this.pingcebianhao = pingcebianhao;
	}
	/**
	 * 获取：评测编号
	 */
	public String getPingcebianhao() {
		return pingcebianhao;
	}
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
