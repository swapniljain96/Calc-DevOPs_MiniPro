FROM openjdk:8
COPY ./target/calc-devops_minipro-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","calc-devops_minipro-1.0-SNAPSHOT.jar","Main"]