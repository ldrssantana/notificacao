FROM openjdk:20-jdk

WORKDIR /app

COPY build/libs/notificacao-0.0.1-SNAPSHOT.jar /app/notificacao.jar

EXPOSE 8083

CMD ["java" , "-jar", "/app/notificacao.jar"]


