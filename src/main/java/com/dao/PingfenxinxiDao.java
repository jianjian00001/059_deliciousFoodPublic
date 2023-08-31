package com.dao;

import com.entity.PingfenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingfenxinxiVO;
import com.entity.view.PingfenxinxiView;


/**
 * 评分信息
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface PingfenxinxiDao extends BaseMapper<PingfenxinxiEntity> {
	
	List<PingfenxinxiVO> selectListVO(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	
	PingfenxinxiVO selectVO(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	
	List<PingfenxinxiView> selectListView(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);

	List<PingfenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	
	PingfenxinxiView selectView(@Param("ew") Wrapper<PingfenxinxiEntity> wrapper);
	

}
