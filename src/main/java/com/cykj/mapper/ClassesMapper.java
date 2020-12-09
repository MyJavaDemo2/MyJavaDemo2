package com.cykj.mapper;

import com.cykj.bean.Admin;
import com.cykj.bean.Classes;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ClassesMapper {

    List<Classes> findAllClasses();

    List<UserInfo> findAllUser;

    List<Classes> findUserByJoin();

    List<UserInfo> findUser();

}
