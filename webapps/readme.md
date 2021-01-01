## Spark and SpringBoot Development

Both of these comes with standalone Main class that start the web application. It will work with
basic IDE such as IntelliJ community edition.

For plain Servlet Webapp however, you need a separate server to deploy and test. These you need
the commercial version of IntelliJ Ultimate edition. (Or get Free IDE such as Eclipse if you do not want to pay.)

Another option of developing servlet webapp is to manually deploy it into a server and do
manual compile and package steps. See instructions below.

## How to deploy WebApp to Tomcat Server

### Using IDE (IntelliJ Ultimate Edition)

Add Tomcat plugin and create a Run configuration, and then simply pressing the green "Play" button.

### Using Manual Tomcat Context file

Ensure you compile your project with `mvn package` first.

1. Edit `$TOMCAT_HOME/conf/server.xml` and find the `<Host>` element and add the following:
   ```
   <Context 
          docBase="/Users/zedeng/src/zemian/java-lessons/webapps/servlet-webapp/target/servlet-webapp-1.0-SNAPSHOT" 
          path="/servlet-webapp" 
          reloadable="true"
        />
   ```
   (Change the `docBase` path to where your project is)
3. Start tomcat server `bin/catalina.sh run`
4. Open http://localhost:8080/servlet-wevapp

Re-run `mvn package` to reload changes.
