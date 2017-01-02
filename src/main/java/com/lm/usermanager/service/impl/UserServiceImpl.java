package com.lm.usermanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lm.usermanager.bean.EasyUIResult;
import com.lm.usermanager.mapper.UserMapper;
import com.lm.usermanager.pojo.User;
import com.lm.usermanager.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired  //applicationContext-mybatis.xml中配置的mapper接口的扫描器自动创建的动态代理实现接口类
    private UserMapper userMapper;
    
    @Override
    public EasyUIResult queryUserList(Integer page, Integer rows) {
        //设置分页参数
        PageHelper.startPage(page, rows);
        //查询user数据
        Example example = new Example(User.class);
        //设置排序
        example.setOrderByClause("updated DESC");
        List<User> list = this.userMapper.selectByExample(example);
        //获取分页后数据
        PageInfo<User> info = new PageInfo<User>(list);
        return new EasyUIResult(info.getTotal(), info.getList());
    }

}
