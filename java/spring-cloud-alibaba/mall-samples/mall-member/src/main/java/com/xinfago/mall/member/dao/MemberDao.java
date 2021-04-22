package com.xinfago.mall.member.dao;

import com.xinfago.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xinfago
 * @email xinfago@163.com
 * @date 2021-04-18 14:42:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
