package com.xinfago.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinfago.common.utils.PageUtils;
import com.xinfago.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xinfago
 * @email xinfago@163.com
 * @date 2021-04-18 14:42:39
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

