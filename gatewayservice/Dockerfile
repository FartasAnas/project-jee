FROM openjdk:17-alpine
EXPOSE 8888
ADD target/gateway-service.jar gateway-service.jar
ENTRYPOINT ["java","-jar","/gateway-service.jar"]