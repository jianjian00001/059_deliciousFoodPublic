package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangyinshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangyinshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangyinshiView;


/**
 * 健康饮食
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface JiankangyinshiService extends IService<JiankangyinshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangyinshiVO> selectListVO(Wrapper<JiankangyinshiEntity> wrapper);
   	
   	JiankangyinshiVO selectVO(@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);
   	
   	List<JiankangyinshiView> selectListView(Wrapper<JiankangyinshiEntity> wrapper);
   	
   	JiankangyinshiView selectView(@Param("ew") Wrapper<JiankangyinshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangyinshiEntity> wrapper);
   	

}

