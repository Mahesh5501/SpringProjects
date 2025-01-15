# Use the official OpenJDK image as a base image
FROM tomcat:9.0-alpine

ADD build/lib/*.war /usr/local/tomcat/webapps/

EXPOSE 8082

CMD [“catalina.sh”, “run”]        
