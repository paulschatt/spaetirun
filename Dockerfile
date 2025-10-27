FROM node:lts-alpine AS frontend-builder 
WORKDIR /app 
COPY src/main/frontend/package*.json ./
RUN npm install 
COPY src/main/frontend/ . 
RUN npm run build 

FROM maven:3.9.6-eclipse-temurin-21 AS builder 
WORKDIR /app 
COPY pom.xml . 
RUN mvn -B dependency:go-offline 
COPY src ./src 

COPY --from=frontend-builder /app/dist/ src/main/resources/static/ 

RUN mvn -B package -DskipTests 

FROM eclipse-temurin:21-jre 
WORKDIR /app 
COPY --from=builder /app/target/*.jar app.jar 
EXPOSE 8080 
ENTRYPOINT ["java", "-jar", "app.jar"]