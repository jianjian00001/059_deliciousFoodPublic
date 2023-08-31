package com.dao;

import com.entity.DiscussshipinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshipinxinxiVO;
import com.entity.view.DiscussshipinxinxiView;


/**
 * 食品信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussshipinxinxiDao extends BaseMapper<DiscussshipinxinxiEntity> {
	
	List<DiscussshipinxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);
	
	DiscussshipinxinxiVO selectVO(@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);
	
	List<DiscussshipinxinxiView> selectListView(@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);

	List<DiscussshipinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);
	
	DiscussshipinxinxiView selectView(@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);
	

}
