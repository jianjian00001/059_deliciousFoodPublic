package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiankanghuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiankanghuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiankanghuodongView;


/**
 * 健康活动评论表
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussjiankanghuodongService extends IService<DiscussjiankanghuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiankanghuodongVO> selectListVO(Wrapper<DiscussjiankanghuodongEntity> wrapper);
   	
   	DiscussjiankanghuodongVO selectVO(@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);
   	
   	List<DiscussjiankanghuodongView> selectListView(Wrapper<DiscussjiankanghuodongEntity> wrapper);
   	
   	DiscussjiankanghuodongView selectView(@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiankanghuodongEntity> wrapper);
   	

}

