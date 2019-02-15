package com.uangtsui.box.service.impl;

import com.uangtsui.box.mapper.UserMapper;
import com.uangtsui.box.model.entity.User;
import com.uangtsui.box.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务实现类
 *
 * @author UangTsui
 * @since 2018-11-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
