FROM tomcat:9.0-jdk21
RUN rm -rf /usr/local/tomcat/webapps/*
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} /usr/local/tomcat/webapps/egowaeyo.war
EXPOSE 8080
CMD ["catalina.sh", "run"]