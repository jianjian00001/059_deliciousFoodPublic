package com.dao;

import com.entity.DiscussjiankanghuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiankanghuodongVO;
import com.entity.view.DiscussjiankanghuodongView;


/**
 * 健康活动评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussjiankanghuodongDao extends BaseMapper<DiscussjiankanghuodongEntity> {
	
	List<DiscussjiankanghuodongVO> selectListVO(@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);
	
	DiscussjiankanghuodongVO selectVO(@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);
	
	List<DiscussjiankanghuodongView> selectListView(@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);

	List<DiscussjiankanghuodongView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);
	
	DiscussjiankanghuodongView selectView(@Param("ew") Wrapper<DiscussjiankanghuodongEntity> wrapper);
	

}
