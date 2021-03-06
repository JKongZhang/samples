package com.xinfago.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xinfago.common.utils.PageUtils;
import com.xinfago.mall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xinfago
 * @email xinfago@163.com
 * @date 2021-04-18 14:42:39
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

