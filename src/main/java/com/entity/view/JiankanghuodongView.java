package com.entity.view;

import com.entity.JiankanghuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
@TableName("jiankanghuodong")
public class JiankanghuodongView  extends JiankanghuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankanghuodongView(){
	}
 
 	public JiankanghuodongView(JiankanghuodongEntity jiankanghuodongEntity){
 	try {
			BeanUtils.copyProperties(this, jiankanghuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
