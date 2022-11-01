# Cloud Service Portfolio

**A repository for exploring CI/CD with cloud services. The end goal is to create a pipline from code commit to deployment where everything from building and testing is taken into account.**

## The application

For this task I will be using a spring boot application as an API. The idea is that whenever a change is made to the API, the api should be automatically build, tested and re-deployed to the cloud service of choice.

At the beginning the API will use an "in memory" database. As I progress I will replace this with a postgreSQL database in "production" and only use the "in memory" database for the testing to make sure I will have consitant results.

## Structure

```
├───.github/workflows                 # CI/CD configuration files
│
├───documentation                     # Documentation
│
├───portfolio-api                     # Spring-boot application
│   ├───src/main/.../portfolioapi     # Source code
│   │   │   └───resources             # Resources (e.g. application properties)
│   │   └───test/.../portfolioapi     # Unit tests
│
└───screenshots                       # Screenshots of the process
```
