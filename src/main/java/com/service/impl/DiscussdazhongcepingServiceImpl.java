package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussdazhongcepingDao;
import com.entity.DiscussdazhongcepingEntity;
import com.service.DiscussdazhongcepingService;
import com.entity.vo.DiscussdazhongcepingVO;
import com.entity.view.DiscussdazhongcepingView;

@Service("discussdazhongcepingService")
public class DiscussdazhongcepingServiceImpl extends ServiceImpl<DiscussdazhongcepingDao, DiscussdazhongcepingEntity> implements DiscussdazhongcepingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdazhongcepingEntity> page = this.selectPage(
                new Query<DiscussdazhongcepingEntity>(params).getPage(),
                new EntityWrapper<DiscussdazhongcepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdazhongcepingEntity> wrapper) {
		  Page<DiscussdazhongcepingView> page =new Query<DiscussdazhongcepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdazhongcepingVO> selectListVO(Wrapper<DiscussdazhongcepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdazhongcepingVO selectVO(Wrapper<DiscussdazhongcepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdazhongcepingView> selectListView(Wrapper<DiscussdazhongcepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdazhongcepingView selectView(Wrapper<DiscussdazhongcepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
