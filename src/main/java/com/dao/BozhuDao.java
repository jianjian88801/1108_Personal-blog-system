package com.dao;

import com.entity.BozhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BozhuVO;
import com.entity.view.BozhuView;


/**
 * 博主
 * 
 * @author 
 * @email 
 * @date 2022-03-29 01:13:41
 */
public interface BozhuDao extends BaseMapper<BozhuEntity> {
	
	List<BozhuVO> selectListVO(@Param("ew") Wrapper<BozhuEntity> wrapper);
	
	BozhuVO selectVO(@Param("ew") Wrapper<BozhuEntity> wrapper);
	
	List<BozhuView> selectListView(@Param("ew") Wrapper<BozhuEntity> wrapper);

	List<BozhuView> selectListView(Pagination page,@Param("ew") Wrapper<BozhuEntity> wrapper);
	
	BozhuView selectView(@Param("ew") Wrapper<BozhuEntity> wrapper);
	

}
