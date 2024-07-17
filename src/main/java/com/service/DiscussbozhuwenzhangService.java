package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbozhuwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbozhuwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbozhuwenzhangView;


/**
 * 博主文章评论表
 *
 * @author 
 * @email 
 * @date 2022-03-29 01:13:41
 */
public interface DiscussbozhuwenzhangService extends IService<DiscussbozhuwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbozhuwenzhangVO> selectListVO(Wrapper<DiscussbozhuwenzhangEntity> wrapper);
   	
   	DiscussbozhuwenzhangVO selectVO(@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);
   	
   	List<DiscussbozhuwenzhangView> selectListView(Wrapper<DiscussbozhuwenzhangEntity> wrapper);
   	
   	DiscussbozhuwenzhangView selectView(@Param("ew") Wrapper<DiscussbozhuwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbozhuwenzhangEntity> wrapper);
   	

}

