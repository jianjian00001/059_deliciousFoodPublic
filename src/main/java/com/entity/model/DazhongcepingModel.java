package com.entity.model;

import com.entity.DazhongcepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 大众测评
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public class DazhongcepingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
