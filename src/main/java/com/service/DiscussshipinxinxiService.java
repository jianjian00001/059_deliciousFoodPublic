package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshipinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshipinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshipinxinxiView;


/**
 * 食品信息评论表
 *
 * @author 
 * @email 
 * @date 2023-01-03 15:13:31
 */
public interface DiscussshipinxinxiService extends IService<DiscussshipinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshipinxinxiVO> selectListVO(Wrapper<DiscussshipinxinxiEntity> wrapper);
   	
   	DiscussshipinxinxiVO selectVO(@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);
   	
   	List<DiscussshipinxinxiView> selectListView(Wrapper<DiscussshipinxinxiEntity> wrapper);
   	
   	DiscussshipinxinxiView selectView(@Param("ew") Wrapper<DiscussshipinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshipinxinxiEntity> wrapper);
   	

}

