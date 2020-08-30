package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** Servlet 创建方法2：使用注解方式配置
 * 添加注解，对文件进行解释，表示 HelloServlet2 类为 Servlet 文件
 * name：定义的 Servlet 名称
 * urlPatterns：访问方式：http://localhost:8080/web_war_exploded/hello2
 */
@WebServlet(name = "hello2", urlPatterns = "/hello2")
public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doGet(req, resp);
        System.out.println("welcome2");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doGet(req, resp);
    }
}
