package org.agoncal.quarkus.microservices.number;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IsbnThirteen {
    @JsonProperty("isbn_13")
    public String isbn13;
}
