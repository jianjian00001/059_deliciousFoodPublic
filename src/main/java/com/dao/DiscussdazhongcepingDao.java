package com.dao;

import com.entity.DiscussdazhongcepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdazhongcepingVO;
import com.entity.view.DiscussdazhongcepingView;


/**
 * 大众测评评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussdazhongcepingDao extends BaseMapper<DiscussdazhongcepingEntity> {
	
	List<DiscussdazhongcepingVO> selectListVO(@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);
	
	DiscussdazhongcepingVO selectVO(@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);
	
	List<DiscussdazhongcepingView> selectListView(@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);

	List<DiscussdazhongcepingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);
	
	DiscussdazhongcepingView selectView(@Param("ew") Wrapper<DiscussdazhongcepingEntity> wrapper);
	

}
