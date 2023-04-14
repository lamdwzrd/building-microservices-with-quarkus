package org.agoncal.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "Number Microservice",
                description = "The microservice generates book numbers",
                version = "1.0",
                contact = @Contact(name = "@hntlam", url = "https://github.com/lamdwzrd")),
        tags = {
                @Tag(name = "api", description = "Public API"),
                @Tag(name = "numbers", description = "Interested in numbers")
        }
)
@ApplicationPath("/")
public class NumberMicroservice extends Application {
}
