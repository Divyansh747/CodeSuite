# CodeSuite
(Major Project) Code Suite a Online Coding Platform

![image](https://github.com/Divyansh747/CodeSuite/blob/main/Frontend/codesuite/src/images/logo1.png)

## About Project

> WIP

## Technology Used

    Backend          => Spring Boot(Java)
    Frontend         => React.js, HTML/CSS, BootStrap
    Database         => MySQL
    API              => RestAPI (Java Spring Boot)
    Authentication   => Java Web Token
    Container Engine => Docker
    
## Project System Design

![image]() WIP


## Requirements (For Development and Testing) 

- Java 8 (JDK+JRE)
- React.Js and NPM
- SpringBootToolSuite IDE
- Docker Engine
- Linux Based OS (Fedora/Ubuntu)
- MySQL Database
- Maven 

## Setup for Deployment

- Clone project repository
```
git clone https://github.com/Divyansh747/CodeSuite.git 
```
- Open project workspace
```
cd CodeSuite
```
- First goto Backend/spring_boot_code_suite/
```
cd Backend/spring_boot_code_suite/
```
- Build SpringBoot project using maven
```
mvn package -DskipTests
```
- Build Backend Docker image ( Note* Image name should be compiler-backend )
```
sudo docker build -t codesuite-backend .
```
- Go back to Minor_Project_Online_Compiler/ 
```
cd ../..
```
- Now goto Frontend/codesuite/
```
cd Frontend/codesuite/
```
- Build Frontend Docker image ( Note* Image name should be compiler-frontend )
```
sudo docker build -t codesuite-frontend .
```
- Go back to CodeSuite/ 
```
cd ../..
```
- Final step to deploy project with the help of docker-compose file
```
sudo docker-compose up
```
- Wait for few minutes to complete deployment process
- To verify project is running open below URL in browser
```
http://localhost:8080 (Backend)
http://localhost:3000 (Frontend)
```
(Note* you can replace localhost with your system IP where you deployed project)




