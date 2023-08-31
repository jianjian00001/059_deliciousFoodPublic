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


import com.dao.GerencepingDao;
import com.entity.GerencepingEntity;
import com.service.GerencepingService;
import com.entity.vo.GerencepingVO;
import com.entity.view.GerencepingView;

@Service("gerencepingService")
public class GerencepingServiceImpl extends ServiceImpl<GerencepingDao, GerencepingEntity> implements GerencepingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerencepingEntity> page = this.selectPage(
                new Query<GerencepingEntity>(params).getPage(),
                new EntityWrapper<GerencepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerencepingEntity> wrapper) {
		  Page<GerencepingView> page =new Query<GerencepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerencepingVO> selectListVO(Wrapper<GerencepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerencepingVO selectVO(Wrapper<GerencepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerencepingView> selectListView(Wrapper<GerencepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerencepingView selectView(Wrapper<GerencepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<GerencepingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<GerencepingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<GerencepingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
