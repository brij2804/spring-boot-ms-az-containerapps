FROM eclipse-temurin:17-jdk-alpine
ENV APPLICATION_NAME="customer-services"
EXPOSE 8081
ADD target/*.jar .
USER root
RUN jar xf customer-services-0.0.1-SNAPSHOT.jar
ENTRYPOINT java -jar customer-services*.jar