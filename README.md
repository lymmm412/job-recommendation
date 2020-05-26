# Job Recommendation Website
## Overview
This is a **Single-Page** website written in **Java** for users to find nearby job opportunities. Users should create an account first then log in. Users can save a job they like and apply later. My website can recommend other opportunities to users based on keywords of their saved jobs.

## Demo

## Project Architecture and Tech Stack
![image](https://github.com/lymmm412/job-recommendation/blob/master/images/project-architecture%20.png)

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
* Monkey Learn API to extract keywords from job description

## Github Jobs API
Since it's a free API so I use it to fetch jobs\\

[official guide](https://jobs.github.com/api)

URL template:
```
https://jobs.github.com/positions.json?description=%s&lat=%s&long=%s
```

Front end will pass these 3 parameters to back end.

## Monkey Learn API for Keywords extraction

Java example
```java
import com.monkeylearn.MonkeyLearn;
import com.monkeylearn.MonkeyLearnResponse;
import com.monkeylearn.MonkeyLearnException;
import com.monkeylearn.Tuple;
import com.monkeylearn.ExtraParam;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.ArrayList;

public class App {
    public static void main( String[] args ) throws MonkeyLearnException {

        // Use the API key from your account, similar to MySQLDBConnection
        MonkeyLearn ml = new MonkeyLearn("<YOUR API KEY HERE>");

        // Use the keyword extractor
        String[] textList = {"I love the movie", "I hate the movie"};
        ExtraParam[] extraParams = {new ExtraParam("max_keywords", "3")};
        MonkeyLearnResponse res = ml.extractors.extract("ex_y7BPYzNG", textList, extraParams);// the name of the model recently provided
        System.out.println( res.arrayResult );//print out the results
    }
}
```
## MySQL Tables
![mysql](https://github.com/lymmm412/job-recommendation/blob/master/images/mysql.png)

## Deploy to AWS EC2
you can use my website via this link:

http://3.134.86.173/alpha


## Future Work
* Rewrite front end with React.js
* For now the default job search is **Software Engineer**, i'm still working on the project to allow users to input any job type they like.
