package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.MessagesEntity;
import com.entity.view.MessagesView;
import com.entity.vo.MessagesVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 在线留言
 * 
 * @author 
 * @email 
 * @date 2024-02-13 09:34:27
 */
public interface MessagesDao extends BaseMapper<MessagesEntity> {
	
	List<MessagesVO> selectListVO(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	MessagesVO selectVO(@Param("ew") Wrapper<MessagesEntity> wrapper);
	
	List<MessagesView> selectListView(@Param("ew") Wrapper<MessagesEntity> wrapper);

	List<MessagesView> selectListView(Pagination page,@Param("ew") Wrapper<MessagesEntity> wrapper);

	
	MessagesView selectView(@Param("ew") Wrapper<MessagesEntity> wrapper);
	

}
