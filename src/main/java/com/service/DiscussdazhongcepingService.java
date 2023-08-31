package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdazhongcepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdazhongcepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdazhongcepingView;


/**
 * 大众测评评论表
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussdazhongcepingService extends IService<DiscussdazhongcepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdazhongcepingVO> selectListVO(Wrapper<DiscussdazhongcepingEntity> wrapper);
   	
   	DiscussdazhongcepingVO selectVO(@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);
   	
   	List<DiscussdazhongcepingView> selectListView(Wrapper<DiscussdazhongcepingEntity> wrapper);
   	
   	DiscussdazhongcepingView selectView(@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdazhongcepingEntity> wrapper);
   	

}

