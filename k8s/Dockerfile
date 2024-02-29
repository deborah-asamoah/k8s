FROM gradle:8-jdk8 as build
COPY . /build-directory/
WORKDIR /build-directory/
RUN ./gradlew clean build

FROM openjdk:8u102-jre
COPY --from=build /build-directory/build/libs/my-springboot-app-0.0.1-SNAPSHOT.jar ./my-spring-boot-app.jar
CMD ["java", "-jar", "./my-spring-boot-app.jar"]
EXPOSE 8080