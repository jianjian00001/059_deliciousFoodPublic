package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankanghuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankanghuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankanghuodongView;


/**
 * 健康活动
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
public interface JiankanghuodongService extends IService<JiankanghuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankanghuodongVO> selectListVO(Wrapper<JiankanghuodongEntity> wrapper);
   	
   	JiankanghuodongVO selectVO(@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);
   	
   	List<JiankanghuodongView> selectListView(Wrapper<JiankanghuodongEntity> wrapper);
   	
   	JiankanghuodongView selectView(@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankanghuodongEntity> wrapper);
   	

}

