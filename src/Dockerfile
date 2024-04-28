#基础镜像，如果本地没有，会从远程仓库拉取。
FROM openjdk:8

# 将jar包添加到容器中并更名为#app.jar
ADD target/*.jar app.jar

#指定容器启动时要执行的命令，但如果存在CMD指令，CMD中的参数会被附加到ENTRYPOINT指令的后面
ENTRYPOINT ["java","-Duser.timezone=GMT+8","-Xmx1344M","-Xms1344M","-Xmn448M","-XX:MaxMetaspaceSize=192M","-XX:MetaspaceSize=192M","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
