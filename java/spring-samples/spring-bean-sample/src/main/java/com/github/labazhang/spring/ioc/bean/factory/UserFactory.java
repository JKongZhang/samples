package com.github.labazhang.spring.ioc.bean.factory;

import com.github.labazhang.spring.ioc.overview.domain.User;

/**
 * @author JKong
 * @version v1.0
 * @description 用户工厂
 * @date 2020-03-16 21:03.
 */
public interface UserFactory {

    User createUser();

    void initUserFactory();

    void myDestroy();

}