package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BozhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BozhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BozhuView;


/**
 * 博主
 *
 * @author 
 * @email 
 * @date 2022-03-29 01:13:41
 */
public interface BozhuService extends IService<BozhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BozhuVO> selectListVO(Wrapper<BozhuEntity> wrapper);
   	
   	BozhuVO selectVO(@Param("ew") Wrapper<BozhuEntity> wrapper);
   	
   	List<BozhuView> selectListView(Wrapper<BozhuEntity> wrapper);
   	
   	BozhuView selectView(@Param("ew") Wrapper<BozhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BozhuEntity> wrapper);
   	

}

