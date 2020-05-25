# Job Recommendation Website
## Overview
This is a **Single-Page** website written in **Java** for users to find nearby job opportunities. Users should create an account first then log in. Users can save a job they like and apply later. My website can recommend other opportunities to users based on what they saved.

## Demo

## Project Architecture and Tech Stack
![image](https://github.com/lymmm412/job-recommendation/blob/master/images/project-architecture.jpg)

**Servlets**
* **/login**: user log in
* **/logout**: user log out
* **/register**: user register
* **/search**: fetch nearby jobs from Github Job API
* **/history**: display all saved jobs of the signed in user
* **/recommendation**: recommend similar jobs to user based on the jobs they have saved

**Tomcat Server is running on port 8080 and AWS MySQL is running on port 3306**

**Front End**
* Plain HTML, CSS, Javascipt

**Back End**
* Java
* Tomcat Server
* AWS MySQL to store key data
* Github Job API to fetch jobs
