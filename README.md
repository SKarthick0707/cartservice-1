# cartservice

## Endpoint

`/cart`

## Docker env

### Logs

/log/cartservice.log.json

### APM

SET env variable before launching docker
`ELASTIC_APM_SERVER_URL`

For example
`docker run -p8080:8080 -e "ELASTIC_APM_SERVER_URL=http://localhost:5900" cartservice:0.0.1-SNAPSHOT`


## Dependency for development

1. Maven
1. JDK 11

## To build

mvn clean package spring-boot:repackage

## To run the service

mvn spring-boot:run

## Database setup

## External Services

## API endpoints

## Configuration parameters from Environment 
