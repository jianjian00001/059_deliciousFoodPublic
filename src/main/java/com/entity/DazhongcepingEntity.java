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
 * 大众测评
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@TableName("dazhongceping")
public class DazhongcepingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DazhongcepingEntity() {
		
	}
	
	public DazhongcepingEntity(T t) {
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
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 饮食分类
	 */
					
	private String yinshifenlei;
	
	/**
	 * 分数
	 */
					
	private Integer fenshu;
	
	/**
	 * 评测目的
	 */
					
	private String pingcemude;
	
	/**
	 * 评测内容
	 */
					
	private String pingceneirong;
	
	/**
	 * 发起时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date faqishijian;
	
	
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
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
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
	 * 设置：分数
	 */
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}
	/**
	 * 设置：评测目的
	 */
	public void setPingcemude(String pingcemude) {
		this.pingcemude = pingcemude;
	}
	/**
	 * 获取：评测目的
	 */
	public String getPingcemude() {
		return pingcemude;
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
	 * 设置：发起时间
	 */
	public void setFaqishijian(Date faqishijian) {
		this.faqishijian = faqishijian;
	}
	/**
	 * 获取：发起时间
	 */
	public Date getFaqishijian() {
		return faqishijian;
	}

}
