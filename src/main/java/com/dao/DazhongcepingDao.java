package com.dao;

import com.entity.DazhongcepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DazhongcepingVO;
import com.entity.view.DazhongcepingView;


/**
 * 大众测评
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DazhongcepingDao extends BaseMapper<DazhongcepingEntity> {
	
	List<DazhongcepingVO> selectListVO(@Param("ew") Wrapper<DazhongcepingEntity> wrapper);
	
	DazhongcepingVO selectVO(@Param("ew") Wrapper<DazhongcepingEntity> wrapper);
	
	List<DazhongcepingView> selectListView(@Param("ew") Wrapper<DazhongcepingEntity> wrapper);

	List<DazhongcepingView> selectListView(Pagination page,@Param("ew") Wrapper<DazhongcepingEntity> wrapper);
	
	DazhongcepingView selectView(@Param("ew") Wrapper<DazhongcepingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DazhongcepingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DazhongcepingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<DazhongcepingEntity> wrapper);



}
