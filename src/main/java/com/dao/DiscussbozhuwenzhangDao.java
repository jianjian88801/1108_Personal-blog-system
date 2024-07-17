package com.dao;

import com.entity.DiscussbozhuwenzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbozhuwenzhangVO;
import com.entity.view.DiscussbozhuwenzhangView;


/**
 * 博主文章评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-29 01:13:41
 */
public interface DiscussbozhuwenzhangDao extends BaseMapper<DiscussbozhuwenzhangEntity> {
	
	List<DiscussbozhuwenzhangVO> selectListVO(@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);
	
	DiscussbozhuwenzhangVO selectVO(@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);
	
	List<DiscussbozhuwenzhangView> selectListView(@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);

	List<DiscussbozhuwenzhangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);
	
	DiscussbozhuwenzhangView selectView(@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);
	

}
