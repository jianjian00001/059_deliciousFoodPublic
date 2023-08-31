package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinshifenleiView;


/**
 * 饮食分类
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
public interface YinshifenleiService extends IService<YinshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinshifenleiVO> selectListVO(Wrapper<YinshifenleiEntity> wrapper);
   	
   	YinshifenleiVO selectVO(@Param("ew") Wrapper<YinshifenleiEntity> wrapper);
   	
   	List<YinshifenleiView> selectListView(Wrapper<YinshifenleiEntity> wrapper);
   	
   	YinshifenleiView selectView(@Param("ew") Wrapper<YinshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinshifenleiEntity> wrapper);
   	

}

