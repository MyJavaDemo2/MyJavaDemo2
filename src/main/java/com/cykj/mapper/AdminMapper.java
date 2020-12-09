package com.cykj.mapper;

import com.cykj.bean.Admin;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface AdminMapper {

    void addAdmin(Admin admin);
    void deleteAdminById(Admin admin);
    void updateAdmin(Admin admin);
    List<Admin> findAll(RowBounds rb);
    List<Admin> findIn(List list);
}
