package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FormServlet() {
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

		// 返回枚举集合，相当于迭代器,用于存放参数名称（loginName、password、favors、btlogin）
		Enumeration<String> e = request.getParameterNames();

		// 获取输出流
		PrintWriter out = response.getWriter();

		// 只能把数据写入到缓冲区中，缓冲区不满的话，要输出数据应使用 flush 方法和 close 方法
		out.print("<p>账号：");
		out.print(loginName);
		out.print("<p>密码：");
		out.print(password);

		// 爱好
		out.print("<p>爱好:");
		for(String f : favors) {
			out.print(f);
			out.print(",");
		}
		out.print("</p>");

		// 输出参数名称
		out.print("<p>表单参数有：");
		// 使用迭代器
		while(e.hasMoreElements()) {
			String p = e.nextElement();
			out.print(p);
			out.print("&nbsp;");
		}
		out.print("</p>");

		// 响应输出数据
		out.flush();
		out.close();
    }
}
