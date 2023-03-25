### 开发环境

- IDEA专业版（学生可以申请免费用）
- mysql
- DBeaver（一个便捷的开源数据库管理软件）
- Postman（接口测试）

### 部署流程

1. clone项目

2. 导入IDEA，maven导包

3. 配置数据库。在数据库springboot（也可以是其他名字）下建表esg

4. 检查文件src/main/resources/application.yaml中用户名，密码，url是否正确

5. 运行

### 运行流程

1. 默认端口8080，浏览器输入localhost:8080进入登录页面
2. 用户名不为空，密码为1即可登陆
3. 登录后可以点击ESG查询得到平安银行数据。也可以用url查询不同公司数据。url格式为

localhost:8080/esg？code=*number*

number为公司代码
