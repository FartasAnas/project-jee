FROM openjdk:17-alpine
EXPOSE 8761
ADD target/eureka-discovery.jar eureka-discovery.jar
ENTRYPOINT ["java","-jar","/eureka-discovery.jar"]