package com.lm.usermanager.mapper;

import com.github.abel533.mapper.Mapper;
import com.lm.usermanager.pojo.User;

//继承通用mapper可省mapperxml配置(单表操作)
public interface UserMapper extends Mapper<User> {

}
