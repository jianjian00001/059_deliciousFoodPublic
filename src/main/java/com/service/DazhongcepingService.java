package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DazhongcepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DazhongcepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DazhongcepingView;


/**
 * 大众测评
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DazhongcepingService extends IService<DazhongcepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DazhongcepingVO> selectListVO(Wrapper<DazhongcepingEntity> wrapper);
   	
   	DazhongcepingVO selectVO(@Param("ew") Wrapper<DazhongcepingEntity> wrapper);
   	
   	List<DazhongcepingView> selectListView(Wrapper<DazhongcepingEntity> wrapper);
   	
   	DazhongcepingView selectView(@Param("ew") Wrapper<DazhongcepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DazhongcepingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<DazhongcepingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<DazhongcepingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<DazhongcepingEntity> wrapper);



}

