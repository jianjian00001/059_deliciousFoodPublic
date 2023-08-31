package com.dao;

import com.entity.GerencepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerencepingVO;
import com.entity.view.GerencepingView;


/**
 * 个人测评
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface GerencepingDao extends BaseMapper<GerencepingEntity> {
	
	List<GerencepingVO> selectListVO(@Param("ew") Wrapper<GerencepingEntity> wrapper);
	
	GerencepingVO selectVO(@Param("ew") Wrapper<GerencepingEntity> wrapper);
	
	List<GerencepingView> selectListView(@Param("ew") Wrapper<GerencepingEntity> wrapper);

	List<GerencepingView> selectListView(Pagination page,@Param("ew") Wrapper<GerencepingEntity> wrapper);
	
	GerencepingView selectView(@Param("ew") Wrapper<GerencepingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GerencepingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GerencepingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<GerencepingEntity> wrapper);



}
