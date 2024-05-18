# DevOps Certification Training
## Certification Project – FinanceMe

## Project Overview

FinanceMe is a global leading banking and financial services provider based in Germany. The company offers products and services including banking, funds management, loans, debit cards, credit cards, investment banking, etc. Initially, the company used a monolithic application architecture. As the company grew, it started facing difficulties in managing the application infrastructure, application deployments, and scaling the application when the traffic load increased.

FinanceMe has decided to transition to a microservice architecture for its applications and adopt DevOps by implementing necessary automation using CI/CD. AWS has been chosen as the primary cloud services provider to create servers, databases, and manage application deployments.

The company's goals are to deliver product updates frequently to production automatically with high quality and reliability. They also aim to accelerate software delivery speed, improve quality, and reduce feedback time between developers and testers.

## Current Challenges

FinanceMe is currently facing the following challenges due to the various technologies involved in the project:

- Building a complex monolithic application is difficult.
- Manual efforts are required to test various components/modules of the project.
- Incremental builds are difficult to manage, test, and deploy.
- It is not possible to scale up individual modules independently.
- Creating and configuring infrastructure manually is very time-consuming.
- Continuous manual monitoring of the application is quite challenging.

## Proof of Concept (POC)

To address these challenges, you are requested to develop a Mavenized microservice using Spring Boot and an in-memory H2 database.

### Requirements

1. Develop a microservice that exposes the following endpoints as APIs and uses a pre-configured AWS RDS MySQL database to store the data:
    - `/createAccount` (HTTP Method: POST, Request Body: JSON)
    - `/updateAccount/{accountNo}` (HTTP Method: PUT, Request Body: JSON)
    - `/viewPolicy/{accountNo}` (HTTP Method: GET, No Request Body)
    - `/deletePolicy/{accountNo}` (HTTP Method: DELETE, No Request Body)
2. Write necessary JUnit test cases.
3. Generate an HTML report using TestNG.
4. Push your code into your GitHub repository.
5. Preload some data into the database.

## Continuous Integration & Continuous Deployment (CI/CD)

Implement CI/CD using the following tools:

- **Git**: For version control and tracking changes in the code files.
- **Maven**: For continuous build.
- **Jenkins**: For continuous integration and continuous deployment.
- **Docker**: For deploying containerized applications.
- **Ansible**: Configuration management tool.
- **Selenium**: For automating tests on the deployed web application.
- **Terraform**: For creating infrastructure.
- **Prometheus and Grafana**: For automated monitoring and report visualization.

### Business Challenge/Requirement

As soon as the developer pushes the updated code to the Git master branch, the code should be checked out, compiled, tested, packaged, and containerized. A new test server should be provisioned using Terraform and automatically configured using Ansible with all the required software. Once the server is available, the application must be deployed to the test server automatically.

The deployment should then be tested using a test automation tool. If the build is successful, the production server must be configured with all the software, and the application should be pushed to the production server. All this should happen automatically and should be triggered from a push to the GitHub master branch.

Continuous monitoring should be configured to monitor both the test and production servers using Prometheus, and Grafana should be configured to display a dashboard with the following metrics:

1. CPU utilization
2. Disk space utilization
3. Total available memory

## How to submit the project the project : 

1. Create a document with detailed step by step tasks along with the screenshot. 
2. Please mention your github repository containing all the codes includeing application code, pipeline code, Dockerfile, Ansible scripts, Terraform scripts, kubernetes scripts etc.
3. Upload the project in your Designated Google Drive Folder.


[www.mentorbabaa.com](https://www.mentorbabaa.com)
