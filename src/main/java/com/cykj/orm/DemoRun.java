package com.cykj.orm;

import com.cykj.bean.Admin;
import com.cykj.mapper.AdminMapper;
import com.cykj.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class DemoRun {
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.setUserId(3);
        admin.setUserName("zhu");
        admin.setPassword("123456");
        SqlSession session= MybatisUtil.getInstance().getSqlsession();
        AdminMapper adminMapper=session.getMapper(AdminMapper.class);
//        分页
        RowBounds rb=new RowBounds(1,4);
        List<Admin> ad=adminMapper.findAll(rb);
        adminMapper.addAdmin(admin);
        session.commit();
        session.close();
//        //把配置文件读取到IO流
//        try {
//            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
//            SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session=sessionFactory.openSession(false);//打开事物，取消自动提交
//            AdminMapper adminMapper=session.getMapper(AdminMapper.class);
//            Admin admin=new Admin();
//            admin.setUserId(2);
//            admin.setUserName("peter");
//            admin.setPassword("123456");
//            adminMapper.addAdmin(admin);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
