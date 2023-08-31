package com.entity.model;

import com.entity.PingfenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 评分信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public class PingfenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 评分编号
	 */
	
	private String pingfenbianhao;
		
	/**
	 * 饮食分类
	 */
	
	private String yinshifenlei;
		
	/**
	 * 评分
	 */
	
	private Integer fenshu;
		
	/**
	 * 评分时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingfenshijian;
		
	/**
	 * 评分备注
	 */
	
	private String pingfenbeizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：评分编号
	 */
	 
	public void setPingfenbianhao(String pingfenbianhao) {
		this.pingfenbianhao = pingfenbianhao;
	}
	
	/**
	 * 获取：评分编号
	 */
	public String getPingfenbianhao() {
		return pingfenbianhao;
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
	 * 设置：评分
	 */
	 
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	
	/**
	 * 获取：评分
	 */
	public Integer getFenshu() {
		return fenshu;
	}
				
	
	/**
	 * 设置：评分时间
	 */
	 
	public void setPingfenshijian(Date pingfenshijian) {
		this.pingfenshijian = pingfenshijian;
	}
	
	/**
	 * 获取：评分时间
	 */
	public Date getPingfenshijian() {
		return pingfenshijian;
	}
				
	
	/**
	 * 设置：评分备注
	 */
	 
	public void setPingfenbeizhu(String pingfenbeizhu) {
		this.pingfenbeizhu = pingfenbeizhu;
	}
	
	/**
	 * 获取：评分备注
	 */
	public String getPingfenbeizhu() {
		return pingfenbeizhu;
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
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
