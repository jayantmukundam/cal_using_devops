FROM openjdk:8
COPY ./target/Calculator_using_devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator_using_devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]
