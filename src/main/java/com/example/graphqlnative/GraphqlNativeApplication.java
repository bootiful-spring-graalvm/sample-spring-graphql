package com.example.graphqlnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * @author Josh Long
 */
@SpringBootApplication
public class GraphqlNativeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlNativeApplication.class, args);
    }

}

record Greeting (String message) {

}

@Controller
class QueryController {

    @QueryMapping
    Greeting hello() {
        return new Greeting("Hello World");
    }
}