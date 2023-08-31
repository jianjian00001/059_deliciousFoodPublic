package com.entity.view;

import com.entity.YinshifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 饮食分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
@TableName("yinshifenlei")
public class YinshifenleiView  extends YinshifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinshifenleiView(){
	}
 
 	public YinshifenleiView(YinshifenleiEntity yinshifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yinshifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
