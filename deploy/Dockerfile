FROM openjdk:11-slim-buster
WORKDIR /hello-world-app
COPY build/libs/helloboot-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "helloboot-0.0.1-SNAPSHOT.jar"]
