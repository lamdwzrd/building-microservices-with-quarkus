package org.agoncal.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
class BookResourceTest {
    @Test
    void testCreateABook_shouldCreateABook() {
        given()
                .formParam("title", "Harry Potter and the Philosopher's Stone")
                .formParam("author", "J.K.Rowling")
                .formParam("year", 1997)
                .formParam("genre", "Fantasy")
                .when()
                .post("/api/books")
                .then()
                .statusCode(201)
                .body("isbn_13", startsWith("13-"))
                .body("title", is("Harry Potter and the Philosopher's Stone"))
                .body("author", is("J.K.Rowling"))
                .body("year_of_publication", is(1997))
                .body("creation_date", startsWith("20"));
    }
}