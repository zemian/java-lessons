package zemian.sparkwebapp;

import static spark.Spark.*;

// http://localhost:4567/hello
public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}