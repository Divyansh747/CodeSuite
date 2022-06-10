# CodeSuite
(Major Project) Code Suite a Online Coding Platform

![image](https://github.com/Divyansh747/CodeSuite/blob/main/Frontend/codesuite/src/images/logo1.png)

## About Project

> 
- Supports JWT Authentication integrated on Spring Boot backend with ReactJS frontend.
- Supports multiuser login and signup facilities with MySQL used as storage for credentials. 
- Supports Manually created restAPI which provide compiler facilities in multiple languages 
  like C, C++, Java, Python (easy to integrate new languages as per requirements)
- Compiler provide individual processing of code with the help of Docker Container technology. 
  When code compilation starts new container launched and result will be send back to user as 
  response of API and container deletes itself
- Supports create competition section and create questions according to individual contest  
  with answer checking capabilities.
- Supports Practice section where any user can upload problem with required testcases and 
  anyone could solve it and verify their solutions.
- Ui/UX is beautifully designed with clean and bug free, light weight using ReactJS
- Both frontend and backend deployed in Docker to avoid deployment related problems and 
  provides easy to pod up and pod down according to user load.
>

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




