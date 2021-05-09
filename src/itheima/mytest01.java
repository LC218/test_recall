package itheima;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class mytest01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //使用多态的方式创建servletcontext对象
        ServletContext servletContext = getServletContext();
        //用servlettext对象调用getcontextpath();输出web项目的请求路径  也称虚拟路径
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
        //用servletcontext对象在调用getinitparameter(string name); 输出web项目中的初始化参数
        //现在需要在web.xml文件中配置所需的参数
        String username = servletContext.getInitParameter("username");
        System.out.println(username);
        //用servletcontext对象在调用getinitparameternames();
        //返回枚举类型，
        //获取web项目的初始化数据
        Enumeration<String> init = servletContext.getInitParameterNames();
        //在while循环中用枚举对象init调用hasmoreElements();
        //然后再用nextElement()遍历  返回string类型
        while(init.hasMoreElements()){
            String s = init.nextElement();
            System.out.println(s);
        }

    }
}
