FROM openjdk:17-jdk-slim
ADD /build/libs/*.jar app.jar
ENTRYPOINT["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
#도커이미지를 실행할 때 어떤 명령어로 실행할 것인가
