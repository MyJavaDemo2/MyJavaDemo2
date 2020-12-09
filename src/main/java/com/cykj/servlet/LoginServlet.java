package com.cykj.servlet;


import com.cykj.bean.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


@WebServlet("/login")
public class LoginServlet extends BaseServlet {


    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");//过滤请求
        response.setCharacterEncoding("UTF-8");
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        System.out.println(userName+"==="+password);
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/myjavademo2";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,"root","123456");
            PreparedStatement pstm = null;
            ResultSet rs = null;
            Admin admin = null;
            String sql = "select a.* from admin a where a.userName = ? and a.password = ?" ;
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,userName);
            pstm.setString(2,password);
            rs = pstm.executeQuery();
            while (rs.next()){
                admin = new Admin();
                System.out.println(rs.getString("userName"));
                String userName1 = rs.getString("userName");
                String password1 = rs.getString("password");
                admin.setUserName(userName1);
                admin.setPassword(password1);
            }
            if (admin != null) {
                request.getSession().setAttribute("admin", admin);//对session对象属性赋值
                response.getWriter().write("登录成功");
            } else {
                response.getWriter().write("登录失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
