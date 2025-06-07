# 🌌 苍穹外卖 Sky Take-Out 🍱

> 黑马程序员 JavaWeb 高级项目实战 🚀 | SpringBoot + MyBatis + Redis + Docker 一体化实战！

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.7.5-brightgreen.svg" />
  <img src="https://img.shields.io/badge/MyBatis-3.5.1-blue" />
  <img src="https://img.shields.io/badge/MySQL-8.0.28-yellowgreen.svg" />
  <img src="https://img.shields.io/badge/Redis-6.2.6-red" />
  <img src="https://img.shields.io/badge/JWT-0.11.5-blue" />
  <img src="https://img.shields.io/badge/Swagger-3.0.0-orange" />
  <img src="https://img.shields.io/badge/PageHelper-5.3.2-green" />
  <img src="https://img.shields.io/badge/Lombok-1.18.24-red" />
</p>

---

## ✨ 项目简介

苍穹外卖是一款模拟真实线上外卖平台的全栈项目，涵盖了从 **后台管理** 到 **用户点餐** 的完整流程。  
本项目根据黑马程序员视频编写，采用主流框架搭建，旨在全面锻炼 Java 后端开发技能！

---

## 🧱 技术栈

| 技术分类 | 技术详情 |
|----------|-----------|
| 后端框架 | Spring Boot、MyBatis、SpringMVC |
| 缓存方案 | Redis |
| 接口文档 | Swagger |
| 数据库 | MySQL 8.x |
| 消息中间件 | RabbitMQ（可选） |
| 容器化部署 | Docker、Nginx |
| 工具类 | Hutool、Lombok |
| 前端 | Vue.js、Element UI、Axios |

---

## 📸 项目展示

### 🚀 管理端界面
| 登录页 | 数据统计 | 菜品管理 |
|--------|-----------|-----------|
| ![image](https://github.com/user-attachments/assets/4ef28fa6-1581-48a8-9e66-370cec4be025) | ![image](https://github.com/user-attachments/assets/eabf15e3-679f-430c-be37-6a2ca53d6a62)| ![image](https://github.com/user-attachments/assets/d5a49888-2b7e-4764-bf83-6d68cb136b94)
|

### 📱 用户端界面
| 首页 | 购物车 | 提交订单 |
|------|--------|-----------|
|![image](https://github.com/user-attachments/assets/8349b23a-05bb-4606-b71d-f284834ee758) |![image](https://github.com/user-attachments/assets/4c6a225a-73d2-40ac-80e4-5f44b589fdb8)|![image](https://github.com/user-attachments/assets/a3e3e793-0336-4f61-bdcc-7fc593e85112)|

---

## ⚙️ 快速启动

### ✅ 环境准备

- JDK 8+
- MySQL 8
- Redis
- Docker（推荐）
- IDEA（开发工具）
- Maven 3.6+

### 🧩 克隆项目

```bash
git clone https://github.com/05Huang/sky-take-out.git
```

## 🗄️ 数据库准备

1. 创建数据库 sky_take_out


2. 执行 sql/init.sql 脚本初始化表结构和数据



## 🔧 配置文件修改

根据本地环境修改：
```java
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/sky_take_out
    username: root
    password: 123456
  redis:
    host: localhost
    port: 6379
```

# 🚀 启动项目

## 启动后端服务
mvn spring-boot:run

访问地址：

管理端：http://localhost/#/login

用户端：微信开发者工具运行微信小程序



---

🧠 项目亮点

✅ 缓存优化：使用 Redis 缓存热门数据，解决缓存穿透/击穿/雪崩问题

✅ 并发控制：支持分布式锁机制，防止库存超卖

✅ 自动化部署：Docker 一键部署，容器化生产环境支持

✅ 移动端适配：用户端支持移动设备浏览和操作



---

📚 学习路径推荐

📌 本项目非常适合作为 Java 后端工程师简历中的入门项目，建议掌握以下内容：

1. 理解 MVC 三层架构设计思想


2. 熟练使用 MyBatis-Plus 进行复杂业务开发


3. 理解 Redis 缓存策略及高并发处理


4. 能使用 Docker 编写生产级部署脚本


---


📣 致谢

感谢 黑马程序员 提供的优质课程资源，本项目基于官方讲解构建，结合个人理解优化实现！


---

⭐ Star 一下，让更多人看到！

如果你觉得这个项目对你有帮助，欢迎点个 Star ⭐ 鼓励一下！

---
