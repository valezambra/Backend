FROM amazoncorretto:17
COPY target/BackEnd-0.0.1-SNAPSHOT.jar BackEnd-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/BackEnd-0.0.1-SNAPSHOT.jar"]