FROM openjdk:8
COPY ./target/devops_calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp","devops_calculator-1.0-SNAPSHOT.jar","Main"]