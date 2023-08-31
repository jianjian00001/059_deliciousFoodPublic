package com.entity.view;

import com.entity.DiscussgerencepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个人测评评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@TableName("discussgerenceping")
public class DiscussgerencepingView  extends DiscussgerencepingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgerencepingView(){
	}
 
 	public DiscussgerencepingView(DiscussgerencepingEntity discussgerencepingEntity){
 	try {
			BeanUtils.copyProperties(this, discussgerencepingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
