package com.dao;

import com.entity.YinshifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinshifenleiVO;
import com.entity.view.YinshifenleiView;


/**
 * 饮食分类
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:30
 */
public interface YinshifenleiDao extends BaseMapper<YinshifenleiEntity> {
	
	List<YinshifenleiVO> selectListVO(@Param("ew") Wrapper<YinshifenleiEntity> wrapper);
	
	YinshifenleiVO selectVO(@Param("ew") Wrapper<YinshifenleiEntity> wrapper);
	
	List<YinshifenleiView> selectListView(@Param("ew") Wrapper<YinshifenleiEntity> wrapper);

	List<YinshifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YinshifenleiEntity> wrapper);
	
	YinshifenleiView selectView(@Param("ew") Wrapper<YinshifenleiEntity> wrapper);
	

}
