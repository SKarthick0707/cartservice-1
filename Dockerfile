FROM --platform=amd64 amd64/openjdk:11
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]