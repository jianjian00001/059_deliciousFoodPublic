package com.dao;

import com.entity.DiscussgerencepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussgerencepingVO;
import com.entity.view.DiscussgerencepingView;


/**
 * 个人测评评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussgerencepingDao extends BaseMapper<DiscussgerencepingEntity> {
	
	List<DiscussgerencepingVO> selectListVO(@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);
	
	DiscussgerencepingVO selectVO(@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);
	
	List<DiscussgerencepingView> selectListView(@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);

	List<DiscussgerencepingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);
	
	DiscussgerencepingView selectView(@Param("ew") Wrapper<DiscussgerencepingEntity> wrapper);
	

}
