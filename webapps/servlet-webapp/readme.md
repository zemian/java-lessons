## Servlet WebApp

Simple Servlet/JSP Web Application

## How to deploy WebApp to Tomcat Server

### Using IDE (IntelliJ Ultimate Edition)

Add Tomcat plugin and create a Run configuration.

### Using Manual Tomcat Context file

Ensure you compile your project with `mvn package` first.

1. Edit `tomcat/conf/Catalina/localhost/servlet-webapp.xml` to ensure the `docBase` is
   the correct to your project build output.
2. Copy `servlet-webapp.xml` into the server at `$TOMCAT_HOME/conf/Catalina/localhost`
3. Start tomcat server `bin/catalina.sh run`
4. Open http://localhost:8080/servlet-wevapp

Re-run `mvn package` to reload changes.

### Using Manual Tomcat Manager UI

Ensure you compile your project with `mvn package` first.

1. Download and install [Tomcat 9](http://tomcat.apache.org/)
2. Edit `conf/tomcat-users.xml` and add a user with password and roles like this:
    ```
    <role rolename="manager-gui"/>
    <user username="admin" password="test123" roles="manager-gui"/>
    ```
3. Start server with `bin/catalina.sh run`
4. Open http://localhost:8080/manager/html
5. Go to "Deploy directory or WAR file located on server" and deploy current project like this:
    ```
    Context Path: /servlet-wevapp
    Directory: /Users/zedeng/src/zemian/java-lessons/webapps/servlet-webapp/target/servlet-webapp-1.0-SNAPSHOT
    ```
6. Open http://localhost:8080/servlet-wevapp

PROBLEM: Can't reload this app unless we undeploy and redeploy again!