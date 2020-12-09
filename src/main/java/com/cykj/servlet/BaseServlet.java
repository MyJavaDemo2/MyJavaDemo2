package com.cykj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@WebServlet(name = "BaseServlet")
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String methodName=req.getParameter("methodName");
        Class clazz=this.getClass();
        try {
            if (methodName != null && !methodName.trim().equals("")) {
                //Method getMethod返回一个 Method 对象，它反映此 Class 对象所表示的类或接口的指定公共成员方法。方法后面接收的就是Class类的对象
                Method method = clazz.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
                // 用来执行某个的对象的目标方法
                String path = (String) method.invoke(this, req, resp);
                if (path != null && !path.trim().equals("")) {
                    req.getRequestDispatcher(path).forward(req, resp);
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
