package com.lm.usermanager.service;

import com.lm.usermanager.bean.EasyUIResult;

public interface UserService {

    EasyUIResult queryUserList(Integer page, Integer rows);

}
