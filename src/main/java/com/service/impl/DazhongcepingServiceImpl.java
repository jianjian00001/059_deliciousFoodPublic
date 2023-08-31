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


import com.dao.DazhongcepingDao;
import com.entity.DazhongcepingEntity;
import com.service.DazhongcepingService;
import com.entity.vo.DazhongcepingVO;
import com.entity.view.DazhongcepingView;

@Service("dazhongcepingService")
public class DazhongcepingServiceImpl extends ServiceImpl<DazhongcepingDao, DazhongcepingEntity> implements DazhongcepingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DazhongcepingEntity> page = this.selectPage(
                new Query<DazhongcepingEntity>(params).getPage(),
                new EntityWrapper<DazhongcepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DazhongcepingEntity> wrapper) {
		  Page<DazhongcepingView> page =new Query<DazhongcepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DazhongcepingVO> selectListVO(Wrapper<DazhongcepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DazhongcepingVO selectVO(Wrapper<DazhongcepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DazhongcepingView> selectListView(Wrapper<DazhongcepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DazhongcepingView selectView(Wrapper<DazhongcepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DazhongcepingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DazhongcepingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DazhongcepingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
