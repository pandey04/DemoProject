FROM tomcat:jdk8

MAINTAINER me

ENV MYSQL_DATABASE=demoapp \
    MYSQL_ROOT_PASSWORD=root@123

COPY target/DemoProject*.war /usr/local/tomcat/webapps/
DemoProject-0.0.1-SNAPSHOT.war

EXPOSE 8080
