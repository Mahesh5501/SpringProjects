# Use the official OpenJDK 17 image as a base image
FROM openjdk:17-slim

# Install Tomcat
RUN apt-get update && \
    apt-get install -y wget && \
    wget https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.73/bin/apache-tomcat-9.0.73.tar.gz && \
    tar -xvf apache-tomcat-9.0.73.tar.gz && \
    mv apache-tomcat-9.0.73 /usr/local/tomcat && \
    rm apache-tomcat-9.0.73.tar.gz

# Add the Oracle JDBC driver 
#COPY ojdbc8-21.9.0.0.jar /usr/local/tomcat/lib/

# Add the WAR file to the Tomcat webapps directory
ADD build/libs/*.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8082

# Set the default command to run Tomcat
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
