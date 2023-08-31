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


import com.dao.JiankanghuodongDao;
import com.entity.JiankanghuodongEntity;
import com.service.JiankanghuodongService;
import com.entity.vo.JiankanghuodongVO;
import com.entity.view.JiankanghuodongView;

@Service("jiankanghuodongService")
public class JiankanghuodongServiceImpl extends ServiceImpl<JiankanghuodongDao, JiankanghuodongEntity> implements JiankanghuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankanghuodongEntity> page = this.selectPage(
                new Query<JiankanghuodongEntity>(params).getPage(),
                new EntityWrapper<JiankanghuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankanghuodongEntity> wrapper) {
		  Page<JiankanghuodongView> page =new Query<JiankanghuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankanghuodongVO> selectListVO(Wrapper<JiankanghuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankanghuodongVO selectVO(Wrapper<JiankanghuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankanghuodongView> selectListView(Wrapper<JiankanghuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankanghuodongView selectView(Wrapper<JiankanghuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
