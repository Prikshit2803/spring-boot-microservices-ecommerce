package com.programmingtechie.productservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}

//Also cant expose model to public so we use a dto and separate it from model
//Model (Entity): Represents the core business logic and data structure of the application.
// Models often correspond directly to database tables or other persistent storage mechanisms.
// DTO: Focuses on transferring data between different layers or components of the application,
// such as between the backend and frontend. DTOs should not contain business logic and are tailored for specific use cases.
// By separating models and DTOs, you
// reduce the coupling between the internal representation of data and its external representation.
