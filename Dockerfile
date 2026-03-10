FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY *.jar app.jar

EXPOSE 7860

CMD ["java","-jar","app.jar"]
