FROM openjdk:17-alpine
EXPOSE 8084
ADD target/random-order-generator.jar random-order-generator.jar
ENTRYPOINT ["java","-jar","/random-order-generator.jar"]