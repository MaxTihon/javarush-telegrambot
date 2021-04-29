FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_maxtihon_bot
ENV BOT_TOKEN=1771211071:AAHI_m1FPxw8e0lYXDsAJ0I1k2Y-zxaD5IE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dbot.username=${BOT_NAME}","-Dbot.token=${BOT_TOKEN}","-jar","/app.jar"]