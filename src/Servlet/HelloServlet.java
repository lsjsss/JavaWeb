package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/** name：Servlet 类名；
 * urlPatterns：Servlet：通过浏览器的访问方式；
 * 浏览器的访问方式为：http://localhost:8080/newProject/Servlet
 */
@WebServlet(name = "Servlet01", urlPatterns = { "/Servlet" })
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    /** 构造方法 */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    /** 处理 Get 请求，通过浏览器地址访问文件时首先调用 doGet 方法处理 get 请求 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath()).append("hello");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    /** 处理 Post 请求 */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // 使用同 get 请求一样的方式处理
        doGet(request, response);
    }
}
