FROM openjdk:17-jdk-slim as builder
COPY target/*.jar application.jar
RUN java -Djarmode=layertools -jar application.jar extract

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder dependencies/ ./
COPY --from=builder snapshot-dependencies/ ./
COPY --from=builder spring-boot-loader/ ./
COPY --from=builder application/ ./
EXPOSE 8080
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]