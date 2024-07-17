package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BozhuwenzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BozhuwenzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BozhuwenzhangView;


/**
 * 博主文章
 *
 * @author 
 * @email 
 * @date 2022-03-29 01:13:41
 */
public interface BozhuwenzhangService extends IService<BozhuwenzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BozhuwenzhangVO> selectListVO(Wrapper<BozhuwenzhangEntity> wrapper);
   	
   	BozhuwenzhangVO selectVO(@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);
   	
   	List<BozhuwenzhangView> selectListView(Wrapper<BozhuwenzhangEntity> wrapper);
   	
   	BozhuwenzhangView selectView(@Param("ew") Wrapper<BozhuwenzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BozhuwenzhangEntity> wrapper);
   	

}

