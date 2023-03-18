package cakar.cs.springgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * QueryResolver: https://www.baeldung.com/graphql-java
 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver} // Datayı sorgulayan işe queryResolver denir.
 * {@link com.coxautodev.graphql.tools.GraphQLMutationResolver} // Sunucuda ki kayıtları değiştirir veya yeni kayıt ekler.
 */
@SpringBootApplication
public class SpringGraphQlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGraphQlApplication.class, args);
    }

}
