package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** name：Servlet 类名；
 * urlPatterns：Servlet：通过浏览器的访问方式；
 * 浏览器的访问方式为：locahost:8080/web_war_exploded/HelloServlet1
 */
@WebServlet(name = "HelloServlet1", urlPatterns = {"/HelloServlet1"})
public class HelloServlet1 extends HttpServlet {

    private static final long SerialVersionUID = 1L;

    /** 构造方法 */
    public HelloServlet1() {
        super();
    }

    /** 处理 Get 请求，通过浏览器地址访问文件时首先调用 doGet 方法处理 get 请求 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(request, response);
//        System.out.println("welcome");
        response.getWriter().append("Served at:").append(request.getContextPath());
        response.getWriter().append("Served at:").append(request.getContextPath()).append("\nHello!");
    }

    /** 处理 Post 请求，可通过放置 doGet 方法进行一同处理，简化处理方式 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 使用同 get 请求一样的方式处理
        super.doGet(request, response);
    }
}
