package org.library.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ilebedyuk
 */
@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    private String id;
    private String firstname;
    private String lastname;

    // … getters and setters omitted
}