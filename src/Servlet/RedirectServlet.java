package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RedirectServlet() {
        super();
    }

    /** request 请求对象，response：响应对象 */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /** 中文乱码问题
         *  1 乱码可能出现的位置，请求时 request 中，或者相应时出现在 response 中
         *  2 解决办法：在 request 或 response 中解决，设置编码方式
         */
        request.setCharacterEncoding("utf-8");
        // 设置响应文本类型为 HTML，字符编码为 UTF-8
        response.setContentType("text/html; charset=utf-8");
        response.setCharacterEncoding("utf-8");

        // 获取请求数据
        String loginName = request.getParameter("loginName");
        String password = request.getParameter("password");
        String[] favors = request.getParameterValues("favors");

        // 如果用户是 tom，密码是 1234，者跳转到首页上
        if(loginName.equals("tom") && password.equals("1234")) {
            // 重定向方式；"/" 代表应用的根目录；两次请求，两次响应
            response.sendRedirect("index.jsp");
            // 或
//			// 请求转发的方式；一次请求，一次响应
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
//			dispatcher.forward(request, response);
        }
    }
}
