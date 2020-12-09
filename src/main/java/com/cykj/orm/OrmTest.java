package com.cykj.orm;

import com.cykj.bean.OrmTestBean;
import com.cykj.bean.TestTable;
import org.dom4j.Element;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class OrmTest {

    public static void main(String[] args) {

//        1:使用class类的静态方法
//        try {
//            Class myclass=Class.forName("com.cykj.bean.OrmTestBean");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
////        2：使用类的.class语法
//        Class myclass= OrmTestBean.class;
////        3：使用对象的getclass的方法
//        OrmTestBean orm=new OrmTestBean();
//        orm.getClass();
//        实例化对象有三种方式（new，下面2种）
//        4:在运行当中构造任意一个类的对象
//        Class<OrmTestBean> myclass=OrmTestBean.class;
//
//        try {
//            //通过Class对象的newInstance()
//            OrmTestBean orm=myclass.newInstance();
//
//        //通过Constructor对象，来获取类对象（有传值的时候实用）
////        Constrctor<OrmTestBean> cons=myclass.getConstructor(String.class);
////        OrmTestBean orm=cons.newInstance("peter");
//        //通过反射机制获取方法
////        Method[] methods=myclass.getDeclaredMethods();//获取自己定义的方法
////        Method[] methods1=myclass.getMethods();//获取全部方法包括自带的
////        for (Method method:methods){
////            System.out.println(method.getName());
////                method.invoke(orm);
////        }
////        for (Method method:methods1){
////            System.out.println(method.getName());
////        }
//        //获取到一个指定的方法，然后执行
//            Method m = myclass.getMethod("fetchName",String.class);
//            m.invoke(orm,"peter");
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//         catch (InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

//        OrmTestBean orm=new OrmTestBean();
//        orm.setName("peter");
//        orm.setAge(18);
//        OrmTestBean orm2= (OrmTestBean) ObjectCopy.copy(orm);
//        System.out.println(orm2.getName());
        TestTable tt=new TestTable();
        tt.setUserName("peter");
        tt.setPassword("123456");
        Element root=MappingUtilss.fetchXml();
        Element foo;
        for (Iterator i=root.elementIterator("table");i.hasNext();){
            foo= (Element) i.next();
            System.out.println(root);

            String sql=MappingUtilss.fetchInsertSql(foo.attributeValue("name"));
            System.out.println("sql: "+sql);
        }

    }
}
