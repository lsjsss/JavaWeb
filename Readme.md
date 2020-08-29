# Java Web 程序设计 课堂笔记

# 1、Java Web 入门
## 1.1 Web应用简介

 - 静态网站和动态网站
 - C/S和B/S架构
 - Web应用运行过程


## 1.2 Eclipse Web应用环境配置
 - JDK配置:环境变量设置
 - Eclipse基本配置
	 - 字体，字号
	 - 加快启动速度
	 -  workspace编码: utf-8
	 - jsp文件编码: utf-8
	 - installed jres设置
	 - Tomcat服务器配置
		 - 默认端口:8080，主机地址: localhost或者127.0.0.1，访问方式：localhost:8080
 - web应用的目录结构
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828232546844.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
 - web应用发布到Tomcat中
	 - 在Eclipse中部署到tomcat中，部署，启动
	 - 在Eclipse之外启动，部署，直接部署到tomcat中，不通过eclipse
		 - web应用可以级war包的形式部署到tomcat中
			 - 步骤1∶在eclipse中将web应用打包成war包形式
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828232917634.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
			 - 步骤2：
			  ![在这里插入图片描述](https://img-blog.csdnimg.cn/202008282331127.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

			 - 步骤3：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828233320230.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
			 - 步骤4∶将test.war复制到tomcat的webapps目录中
			 - 步骤5∶启动tomcat
			 - 步骤6：访问test应用
 - romcat目录结构
	 - bin：包含一些实用工具，主要掌握: startup.bat-启动tomcat服务器，shutdown.bat-关闭tomcat服务器
	 - conf：包含服务器的配置文件，比如端口，用户等信息
	 - lib：包含服务器和Web应用程序使用的类库，jsp-api.jar和servlet-api.jar

---
# 2、Servle基础
## 2.1 Servlet基础

Servlet:运行在服务器端的java代码，运行在Servlet容器中的java类
什么是Servlet容器? Tomcat
Serlvet功能：
 - 接收处理用户的 Http 请求
 - 给用户 HTTP 响应

## 2.1.2 Servlet体系结构
 - javax.servlet 包
	 - **Servlet 接口**:开发人员编写的Servlet必须直接或者间接的实现 **javax.servlet.Servlet** 的接口
	 - 方法:
		 - **init(Servletconfig config)**: Servlet 的初始化方法，在 Servlet 实例化后，**容器调用该方法进行 Servlet 的初始化**； ServletAPI 规定对任何 Servlet 实例 init() 方法**只能被调用一次**。参数为 ServletConfig ，我们初始化过程中可以读取一些配置信息，比如 web.xml 中的信息
		 - **service(ServletRequest req,ServletResponse resp)**：Servlet 的服务方法。
		 - **destroy()**: Servlet 的销毁方法
		 - **getServletConfig()**：获得 ServletConfig 对象，该对象中包含了若干配置信息。
		 - **getservletInfo()**：一个 String 对象，该对象包含 Servlet 的信息。例如：开发者、创建日期、描述信息等。

	 - **GenericServlet抽象类**：与 Servlet 接口基本相同，只是为了是使用方便，做成抽象类的形式。
	 - **Javax.servlet.http.HttpServlet**：抽象类，能够处理 HTTP 请求的 servlet，它在原有 Servlet 接口上添加了对 HTTP 协议的处理，它比Servlet接口的功能更为强大。**用户编写的 Servlet 类多数基于该抽象类**。
	 - 方法：
		 - **service(HttpServletRequest req, HttpServletResponse resp)**：:重写了 **Servlet接口** 的 service() 方法，该方法会自动判断用户的请求方式;若为 **GET** 请求，则调用 HttpServlet的doGet() 方法;若为 **POST** 晴求，则调用 doPost() 方法。
		- **doGet(HttpServletRequest req,HttpServletResponse resp)**：此方法被本类的 service() 方法调用，用来处理一个 HTTP GET 操作。
		- **doPost(HttpServletRequest req,HttpServletResponse resp)**：此方法被本类的 service() 方法调用，用来处理一个 HTTP POST 操作。
 - javax.servlet.http 包
 - Servlet 的生命周期
	 - 参考 ppt 和教材和视频
 - Sevlet的创建过程
	 - 两种方式：传统的通过 web.xml 进行配置；注解方式配置
	 - web.xml 方式配置

		```html
		<!--配置自定义的Servlet,需要2部分内容-->
		<servlet>
			<servlet-name>Hello1</servlet-name>
			<servlet-class>com.jsj.yun1.ch2.HelloServlet1</servlet-class>
		</servlet>
		
		<!-- Servlet访问方式的映射﹔哪个Servlet需要用什么样的方式来访问-->
		<servlet-mapping>
			<servlet-name>Hello1</servlet-name>
			
			<!--用什么样的访问方式来访问上面的servlet，kHe1lo1 -->
			<url-pattern>/hello1</ur1-pattern>
		</servlet-mapping>
		```

	 - 注解方式配置

类型 | 属性名 | 描述
:-- | :-- | :--
name | String | 指定Servlet的名字，可以为任何字符串，一般与Servlet的类名相同，如果没有显式指定，则该Servlet的取值即为类的全限定名
urlPatterns | String[] | 指定一组Servlet的URL匹配模式，可以是匹配地址映射（如：/SimpleServlet）、匹配目录映射（如：/servlet/\*）和匹配扩展名映射（如：\*.action）
value | String[] | 该属性等价于urlPatterns属性。两个属性不能同时使用
loadOnStartup | int | 指定Servlet的加载顺序。当此选项没有指定时，表示容器在该Servlet第一次被请求时才加载；当值为0或者大于0时，表示容器在应用启动时就加载这个Servlet。值越小，启动该servlet的优先级越高。原则上不同的Servlet应该使用不同的启动顺序数字
initParams | WeblnitParam[] | 指定一组Servlet初始化参数，为可选项
asyncSupported | boolean | 声明Servlet是否支持异步操作模式，默认为false
description | String | 指定该Servlet的描述信息
displayName | String | 指定该Servlet的显示名，通常配合工具使用






