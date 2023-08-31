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


import com.dao.DiscussjiankanghuodongDao;
import com.entity.DiscussjiankanghuodongEntity;
import com.service.DiscussjiankanghuodongService;
import com.entity.vo.DiscussjiankanghuodongVO;
import com.entity.view.DiscussjiankanghuodongView;

@Service("discussjiankanghuodongService")
public class DiscussjiankanghuodongServiceImpl extends ServiceImpl<DiscussjiankanghuodongDao, DiscussjiankanghuodongEntity> implements DiscussjiankanghuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiankanghuodongEntity> page = this.selectPage(
                new Query<DiscussjiankanghuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussjiankanghuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiankanghuodongEntity> wrapper) {
		  Page<DiscussjiankanghuodongView> page =new Query<DiscussjiankanghuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiankanghuodongVO> selectListVO(Wrapper<DiscussjiankanghuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiankanghuodongVO selectVO(Wrapper<DiscussjiankanghuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiankanghuodongView> selectListView(Wrapper<DiscussjiankanghuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiankanghuodongView selectView(Wrapper<DiscussjiankanghuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
