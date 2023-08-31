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


import com.dao.YinshifenleiDao;
import com.entity.YinshifenleiEntity;
import com.service.YinshifenleiService;
import com.entity.vo.YinshifenleiVO;
import com.entity.view.YinshifenleiView;

@Service("yinshifenleiService")
public class YinshifenleiServiceImpl extends ServiceImpl<YinshifenleiDao, YinshifenleiEntity> implements YinshifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinshifenleiEntity> page = this.selectPage(
                new Query<YinshifenleiEntity>(params).getPage(),
                new EntityWrapper<YinshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinshifenleiEntity> wrapper) {
		  Page<YinshifenleiView> page =new Query<YinshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinshifenleiVO> selectListVO(Wrapper<YinshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinshifenleiVO selectVO(Wrapper<YinshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinshifenleiView> selectListView(Wrapper<YinshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinshifenleiView selectView(Wrapper<YinshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
