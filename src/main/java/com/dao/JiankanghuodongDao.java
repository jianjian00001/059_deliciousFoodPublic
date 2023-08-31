package com.dao;

import com.entity.JiankanghuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankanghuodongVO;
import com.entity.view.JiankanghuodongView;


/**
 * 健康活动
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
public interface JiankanghuodongDao extends BaseMapper<JiankanghuodongEntity> {
	
	List<JiankanghuodongVO> selectListVO(@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);
	
	JiankanghuodongVO selectVO(@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);
	
	List<JiankanghuodongView> selectListView(@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);

	List<JiankanghuodongView> selectListView(Pagination page,@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);
	
	JiankanghuodongView selectView(@Param("ew") Wrapper<JiankanghuodongEntity> wrapper);
	

}
