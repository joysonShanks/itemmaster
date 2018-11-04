# itemmaster

**1. Create database** <br/>
Update username / password and other information relevant to database in [application.properties](https://github.com/joysonShanks/itemmaster/blob/master/hackathon/src/main/resources/application.properties#L1). If you are using different database such as MySQL please add relevant driver name and update [pom.xml](https://github.com/joysonShanks/itemmaster/blob/master/hackathon/pom.xml) with correct database connector !

**2. Update property** <br/>
`spring.jpa.hibernate.ddl-auto` to `create` in [application.properties](https://github.com/joysonShanks/itemmaster/blob/master/hackathon/src/main/resources/application.properties#L12) <br/>
Note: This will create database tables automatically !! So once tables are created (ie after inital run) change property to **validate** to void re creating the tables

**3. How to run**<br/>
`cd ${project-directory}`<br/>
`mvn spring-boot:run` <br/>

OR <br/>

`mvn clean install` <br/>
`java -jar target/hackathon-0.0.1-SNAPSHOT.jar` <br/>
Note: Make sure port 8080 is free

**4. Create users and roles**<br/>
Take a look at [this](https://github.com/joysonShanks/itemmaster/blob/master/hackathon/resources/itemmaster-insert.sql) SQL file and create users and roles as per the queries<br/>
To create password for a user you can use [QuickPasswordEncodingGenerator.java](https://github.com/joysonShanks/itemmaster/blob/master/hackathon/src/main/java/com/itemmaster/QuickPasswordEncodingGenerator.java) class for generating passwords<br/>
Passwords are stored in encripted format !!


**5. Login using client app credentials and user credentials**<br/>
`curl trusted-app:secret@localhost:8080/oauth/token -d "grant_type=password&username=user_name&password=password"`

**6. Call API's using generated JWT Token**<br/>
Set request header `Authorization : Bearer <JWT Token>`<br/>

**7. Create product basic api**<br/>
`curl -X POST -H 'Authorization: Bearer <TOKEN>' -H 'Content-Type: application/json' -i http://localhost:8080/itemmaster/product-basic --data '{"sku" : "1234", "productName" : "DummyDemp", "producuctIdentifier" : "1234", "productIdType" : "UPC", "productId" : "dummyId", "shortDescription" : "dummyDescription", "keyFeatures" : "dummyFeatures", "unitsPerConsumerUnit" : "dummy", "brand" : "dummy", "manufacturer" : "dummy", "manufacturePartName" : "dummy", "modelNumber" : "dummy", "productStatus" : 0}'`

NOTE: You can find request body for all requests [here](https://github.com/joysonShanks/itemmaster/blob/master/hackathon/resources/itemmaster-json-body.txt)

**8. Log out**<br/>
`curl -X DELETE -H 'Authorization: Bearer <TOKEN>' -i http://localhost:8080/itemmaster/oauth/token`
