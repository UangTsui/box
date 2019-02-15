package com.uangtsui.box.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uangtsui.box.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表 Mapper 接口
 *
 * @author UangTsui
 * @since 2018-11-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
