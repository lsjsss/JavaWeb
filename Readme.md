# Java Web 程序设计 课堂笔记 | Java Web

---
# 1、Java Web 入门
## 1.1 Web应用简介

 - 静态网站和动态网站
 - C/S和B/S架构
 - Web应用运行过程


## 1.2 Eclipse Web应用环境配置
### 1.2.1 JDK配置:环境变量设置
### 1.2.2 Eclipse基本配置
 - 字体，字号
 - 加快启动速度
 -  workspace编码: utf-8
 - jsp文件编码: utf-8
 - installed jres设置
 - Tomcat服务器配置
	 - 默认端口:8080，主机地址: localhost或者127.0.0.1，访问方式：localhost:8080


### 1.2.3 Web应用的目录结构
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828232546844.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
### 1.2.4 Web 应用发布到 Tomcat 中
#### 1.2.4.1 在Eclipse内部署到 tomcat 中，部署，启动（通常在开发中使用）
##### 步骤1：项目的部署（Add）与移除（Remove）
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200829153034363.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020082915312883.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

##### 步骤2：项目的清除（彻底清理，清空 ..\apache-tomcat-9.0.37\wtpwebapps 目录）
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200829153233767.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

##### 步骤3：自定义项目文件部署路径
	双击下方 Tomcat v9.0 Server at localhost ，Server Locations 中的选项配置：
**use workspace metadata (does not modify Tomcat installation)**：使用项目所在的 Workspace 位置，由系统自动选择
**use Tomcat installation (takes control of Tomcat installation)**：使用 Tomcat 安装所在位置
**use custom location (does not modify Tomcat installation)**：
**Deploy path**：部署路径（发布到所在文件夹 **..\apache-tomcat-9.0.37\wtpwebapps** ）

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200829154114779.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70#pic_center)
##### 步骤4：添加并访问项目
	在 Eclipse 中添加项目至 Tomcat 后发布并访问，网页访问方式：**127.0.0.1:8080/test/index.jsp** 或 **127.0.0.1:8080/test/**
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020082915312883.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

#### 1.2.4.2 在 Eclipse 外部启动，部署，直接部署到 Tomcat 中，不通过 Eclipse （通常于开发完成后上线、脱离开发环境时使用）
	web 应用可以将 war 包的形式部署到 Tomcat 中

##### 步骤1：在 eclipse 中将 web 应用打包成 war 包形式
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828232917634.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
##### 步骤2：选择 Web -> WAR file
  ![在这里插入图片描述](https://img-blog.csdnimg.cn/202008282331127.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

##### 步骤3：设置项目导出 war 包路径
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200828233320230.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
##### 步骤4：将项目导出的 war 包（test.war） 复制到 Tomcat 安装目录下的 webapps 目录（..\apache-tomcat-9.0.37\webapps）中
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200830000508387.png)

##### 步骤5∶启动 Tomcat
 - 通过 **..\apache-tomcat-9.0.37\bin** 目录中的 **startup.bat** 和 **shutdown.bat** 文件来对 Tomcat 服务器进行启动和关闭



##### 步骤6：访问项目（test）应用


### 1.2.5 Tomcat 的目录结构
 - \bin：包含一些实用工具，主要掌握：**startup.bat** 脚本 - 启动 Tomcat 服务器，**shutdown.bat** 脚本 - 关闭 Tomcat 服务器
 - \conf：包含服务器的配置文件，比如端口，用户等信息
 - \lib：包含服务器和 Web 应用程序使用的类库，**jsp-api.jar** 和 **servlet-api.jar**
 - \webapps：Web应用的发布目录，Eclipse 外部部署 **.war** 文件存放路径
 - \wtpwebapps：Eclipse 中在 Tomcat 服务器安装路径下发布项目的默认路径（内部部署）
 - \work：Web 应用程序的临时工作目录
 - \temp：存放 Tomcat 运行时的临时文件目录


### 1.2.6 Tomcat 项目的部署与移除
 - 项目的部署（Add）与移除（Remove）
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200829153034363.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020082915312883.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

 - 项目的清除（彻底清理，清空 **..\apache-tomcat-9.0.37\wtpwebapps** 目录）
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200829153233767.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

### 1.2.7 Tomcat 的图形化管理（管理员登陆）
#### 步骤1：配置管理员账号信息
 - 打开 Tomcat 安装所在路径下 **..\apache-tomcat-9.0.37\conf** 中的 **tomcat-users.xml** 文件
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200830002804973.png)
 - 在 **tomcat-users.xml** 文件 `</tomcat-users>` 标签中添加账户信息（用户名：**tomcat**；密码：**123**）
	```html
	<role rolename="manager-gui"/>
	<user username="tomcat" password="123" roles="manager-gui"/>
	  ```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200830003649230.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
#### 步骤2：管理员登陆
1. 通过 Tomcat 页面进入管理员登陆入口（或直接输入网址 **http://localhost:8080/manager/html**），选择 Host Manager
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200830002420999.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)
2. 在弹出窗口中填写已配置的用户名和密码

3. 进入管理页面 ![在这里插入图片描述](https://img-blog.csdnimg.cn/20200830004021218.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

---
# 2、Servle基础
## 2.1 Servlet基础

	Servlet：运行在服务器端的 java 代码，运行在 Servlet 容器中的 java 类
	什么是 Servlet 容器?  Tomcat
Serlvet 功能：
 - 接收处理用户的 Http 请求
 - 给用户 HTTP 响应

## 2.1.2 Servlet体系结构
![在这里插入图片描述](https://img-blog.csdnimg.cn/2020083000581765.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NDM0MDEyOQ==,size_16,color_FFFFFF,t_70)

 - javax.servlet 包
	 - **Servlet 接口**：开发人员编写的 Servlet 必须直接或者间接的实现 **javax.servlet.Servlet** 的接口
	 - 方法:
		 - **init(Servletconfig config)**：Servlet 的初始化方法，在 Servlet 实例化后，**容器调用该方法进行 Servlet 的初始化**； ServletAPI 规定对任何 Servlet 实例 init() 方法**只能被调用一次**。参数为 ServletConfig ，我们初始化过程中可以读取一些配置信息，比如 web.xml 中的信息
		 - **service(ServletRequest req,ServletResponse resp)**：Servlet 的服务方法。
		 - **destroy()**: Servlet 的销毁方法
		 - **getServletConfig()**：获得 ServletConfig 对象，该对象中包含了若干配置信息。
		 - **getServletInfo()**：一个 String 对象，该对象包含 Servlet 的信息。例如：开发者、创建日期、描述信息等。

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

