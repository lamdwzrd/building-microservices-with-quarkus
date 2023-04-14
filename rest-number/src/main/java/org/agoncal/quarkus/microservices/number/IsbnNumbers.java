package org.agoncal.quarkus.microservices.number;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "Several ISBN numbers for books")
public class IsbnNumbers {
    @Schema(required = true)
    @JsonbProperty("isbn_10")
    private String isbn10;

    @Schema(required = true)
    @JsonbProperty("isbn_13")
    private String isbn13;

    @JsonbTransient
    private Instant generationDate;
}
