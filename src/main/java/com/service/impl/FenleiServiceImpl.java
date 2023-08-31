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


import com.dao.FenleiDao;
import com.entity.FenleiEntity;
import com.service.FenleiService;
import com.entity.vo.FenleiVO;
import com.entity.view.FenleiView;

@Service("fenleiService")
public class FenleiServiceImpl extends ServiceImpl<FenleiDao, FenleiEntity> implements FenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenleiEntity> page = this.selectPage(
                new Query<FenleiEntity>(params).getPage(),
                new EntityWrapper<FenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenleiEntity> wrapper) {
		  Page<FenleiView> page =new Query<FenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenleiVO> selectListVO(Wrapper<FenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenleiVO selectVO(Wrapper<FenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenleiView> selectListView(Wrapper<FenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenleiView selectView(Wrapper<FenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
