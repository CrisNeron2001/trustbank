FROM maven:latest-eclipse-temurin-25 as builder
WORKDIR ./app
COPY pom.xml
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:25-jdk
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8282

ENTRYPOINT [ "java", "-jar", "app.jar" ]