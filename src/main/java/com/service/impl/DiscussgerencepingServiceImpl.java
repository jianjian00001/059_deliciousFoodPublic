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


import com.dao.DiscussgerencepingDao;
import com.entity.DiscussgerencepingEntity;
import com.service.DiscussgerencepingService;
import com.entity.vo.DiscussgerencepingVO;
import com.entity.view.DiscussgerencepingView;

@Service("discussgerencepingService")
public class DiscussgerencepingServiceImpl extends ServiceImpl<DiscussgerencepingDao, DiscussgerencepingEntity> implements DiscussgerencepingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgerencepingEntity> page = this.selectPage(
                new Query<DiscussgerencepingEntity>(params).getPage(),
                new EntityWrapper<DiscussgerencepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgerencepingEntity> wrapper) {
		  Page<DiscussgerencepingView> page =new Query<DiscussgerencepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgerencepingVO> selectListVO(Wrapper<DiscussgerencepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgerencepingVO selectVO(Wrapper<DiscussgerencepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgerencepingView> selectListView(Wrapper<DiscussgerencepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgerencepingView selectView(Wrapper<DiscussgerencepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
