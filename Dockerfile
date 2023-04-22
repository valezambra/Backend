FROM amazoncorretto:19
MAINTAINER  valentina-de-los-angeles-zambrano
COPY target/BackEnd-0.0.1-SNAPSHOT.jar BackEnd-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api-0.0.1-SNAPSHOT.jar"]