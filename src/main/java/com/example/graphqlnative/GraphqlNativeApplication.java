package com.example.graphqlnative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.NativeDetector;
import org.springframework.core.io.ClassPathResource;
import org.springframework.graphql.boot.GraphQlSourceBuilderCustomizer;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * @author Josh Long
 */
@SpringBootApplication
public class GraphqlNativeApplication {

    @Bean
    GraphQlSourceBuilderCustomizer graphQlSourceBuilderCustomizer() {
        return builder -> {
            if (NativeDetector.inNativeImage())
                builder.schemaResources(new ClassPathResource("graphql/schema.graphqls"));
        };
    }


    public static void main(String[] args) {
        SpringApplication.run(GraphqlNativeApplication.class, args);
    }

}

@Controller
class QueryController {

    @QueryMapping
    String hello() {
        return "hello, world!";
    }
}