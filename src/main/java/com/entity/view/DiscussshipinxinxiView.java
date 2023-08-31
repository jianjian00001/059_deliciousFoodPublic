package com.entity.view;

import com.entity.DiscussshipinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 食品信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@TableName("discussshipinxinxi")
public class DiscussshipinxinxiView  extends DiscussshipinxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshipinxinxiView(){
	}
 
 	public DiscussshipinxinxiView(DiscussshipinxinxiEntity discussshipinxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshipinxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
