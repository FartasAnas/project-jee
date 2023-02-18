FROM openjdk:17-alpine
EXPOSE 8086
ADD target/analytics-service.jar analytics-service.jar
ENTRYPOINT ["java","-jar","/analytics-service.jar"]