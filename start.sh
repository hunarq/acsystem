./mvnw package && java -jar target/acsystem-0.1.0.jar
docker build -t acsystem .
docker run -p 5000:8080 acsystem

# java -jar -Dserver.port=5000 .jar target/acsystem-0.1.0.jar

