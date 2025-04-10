FROM openjdk:21-jdk-slim AS build
LABEL authors="author-name"

WORKDIR /

COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

FROM openjdk:21-jdk-slim
WORKDIR /springboot-template

COPY --from=build /target/springboot-template*.jar springboot-template.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "springboot-template.jar"]