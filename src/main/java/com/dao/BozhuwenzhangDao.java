package com.dao;

import com.entity.BozhuwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BozhuwenzhangVO;
import com.entity.view.BozhuwenzhangView;


/**
 * 博主文章
 * 
 * @author 
 * @email 
 * @date 2022-03-29 01:13:41
 */
public interface BozhuwenzhangDao extends BaseMapper<BozhuwenzhangEntity> {
	
	List<BozhuwenzhangVO> selectListVO(@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);
	
	BozhuwenzhangVO selectVO(@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);
	
	List<BozhuwenzhangView> selectListView(@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);

	List<BozhuwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);
	
	BozhuwenzhangView selectView(@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);
	

}
