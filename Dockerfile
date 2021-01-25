FROM openjdk:16-ea-alpine3.12
WORKDIR /usr/src/geoip-web-service
COPY target/geoip-web-servise-0.0.1-SNAPSHOT.jar .
COPY wait-for-it.sh .
EXPOSE 8080
ENTRYPOINT ["./wait-for-it.sh", "localhost:3306", "--", "java", "-jar", "geoip-web-servise-0.0.1-SNAPSHOT.jar"]
