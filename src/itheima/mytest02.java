package itheima;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class mytest02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先得到inputstream对象
        //method();
        //method02();
        InputStream resourceAsStream = getServletContext().getResourceAsStream("WEB-INF/classes/cccc.hello");
        InputStream resourceAsStream1 = getServletContext().getResourceAsStream("WEB-INF/classes/itheima/dddd.hello");
        Properties properties=new Properties();
        Properties properties1=new Properties();
        properties.load(resourceAsStream);
       properties1.load(resourceAsStream1);
        String w = properties.getProperty("w");
        String q = properties1.getProperty("q");
        System.out.println(w);
        System.out.println(q);
    }

    private void method02() throws IOException {
        InputStream resourceAsStream = getServletContext().getResourceAsStream("WEB-INF/bbbb.hello");
        Properties properties=new Properties();
        properties.load(resourceAsStream);
        String w = properties.getProperty("w");
        System.out.println(w);
    }

    private void method() throws IOException {
        InputStream resourceAsStream = getServletContext().getResourceAsStream("aaaa.hello");
        //使用properties集合
        Properties properties=new Properties();
        //再遍历集合
        properties.load(resourceAsStream);
        //再用peopeetise对象调用getproperty(“k值”)；
        //再输出string的键值，再打印其键值
        String w = properties.getProperty("w");
        System.out.println(w);
    }
}
