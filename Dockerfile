#基于哪个镜像
FROM java:8
#将本地文件夹挂载到当前容器
VOLUME /tmp
#拷贝文件到容器
ADD rabbitmq-demo-1.0.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080