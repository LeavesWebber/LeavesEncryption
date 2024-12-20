![image.png](https://leaves520-1326362500.cos.ap-nanjing.myqcloud.com/20241016165843.png)

--- 
# 🍃LeavesEncryption🍃
## 🙌这个项目是干嘛的？
- 你有时或许需要把某些**明文**，变成摩斯电码那样的**密文**，无论是生活中还是你写的项目里。
- 我的这个项目提供了几种十分简单易懂，也十分易用的字符流加密方法，能囊括在你的项目里为你所用。
- 尽管我这个项目初衷是**做一块帮助大家盖大楼的砖**，但我还是为此写了个小工具，能让你轻松的按自定义密钥把明文转成密文，亦或是拿着密钥解密，就像下图这样：  

<div style="text-align: center;">
    <img src="https://leaves520-1326362500.cos.ap-nanjing.myqcloud.com/20241016171815.png"
         alt="小工具的Demo">
</div><br>

--- 
## 该咋用这个项目嘞？
这个项目基于Maven搭建，并全程严格按照**MVC架构**开发，充分保证了后期的可扩展性和可移植性（该死，我甚至还为此开发了语言选择模块）  你可以这样做：
### 😍为己所用
把`target`文件夹中的`LeavesEncryption-x.x.x.jar`文件囊括在你自己的项目依赖中，然后简单调用`EncryptionStrategy`中的加解密接口即可

### 👻浅浅体验一下
在`target`文件夹中使用`java -jar`命令运行封装好的jar文件，它会启动一个终端，然后你能简单的做一下加解密

---
## 为啥子做这个项目嘞？？？
### 情形1
> 把各种小视频小电影🎬存在网盘或者服务器上，多是一件美食！！  > 然而，，，，，如果别人看到了这些东西，不就尴尬了吗！！！！！

### 情形2
> 手机存不下我几百G的照片了！！于是我存网盘或者服务器上，但是有朋友来借你的网盘会员，这可咋办！！！

### 我的设想
传统的加密方式无非是把视频和各种文件压缩成压缩文件，然后设一个解压密码，但是这样做网盘上的视频就不能在线播放预览了，这一点也不优雅  
为了解决这个问题，我策划开发一款图片视频的动态加解密工具，基于应用密码学中的原理对视频文件的每一个字节进行数学变换，播放的时候实时解密再变回来。  
市面上已经有一些成熟的方案比如很多音乐播放器的私有媒体格式，但是这种一次性加密的格式，不能为普通人所用，而我设想中的app可以设定密钥（如[凯撒密码](https://zh.wikipedia.org/wiki/%E5%87%B1%E6%92%92%E5%AF%86%E7%A2%BC)默认的偏移量是3）

### 开发进度
刚起步，这个项目本身就是其中一个模块

--- 
## 来自作者的邀请
如果有朋友对刚才的项目感兴趣，欢迎联系我共同参与开发！！！   
作者邮箱：  LeavesWebber@outlook.com
