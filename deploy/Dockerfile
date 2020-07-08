FROM openjdk:11-slim-buster
WORKDIR /shopping-cart-app
COPY build/libs/shoppingcart-0.0.2-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "shoppingcart-0.0.2-SNAPSHOT.jar"]
