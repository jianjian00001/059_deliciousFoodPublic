package com.entity.view;

import com.entity.DazhongcepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 大众测评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
@TableName("dazhongceping")
public class DazhongcepingView  extends DazhongcepingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DazhongcepingView(){
	}
 
 	public DazhongcepingView(DazhongcepingEntity dazhongcepingEntity){
 	try {
			BeanUtils.copyProperties(this, dazhongcepingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
