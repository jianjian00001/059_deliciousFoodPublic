package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussgerencepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussgerencepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussgerencepingView;


/**
 * 个人测评评论表
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussgerencepingService extends IService<DiscussgerencepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussgerencepingVO> selectListVO(Wrapper<DiscussgerencepingEntity> wrapper);
   	
   	DiscussgerencepingVO selectVO(@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);
   	
   	List<DiscussgerencepingView> selectListView(Wrapper<DiscussgerencepingEntity> wrapper);
   	
   	DiscussgerencepingView selectView(@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussgerencepingEntity> wrapper);
   	

}

