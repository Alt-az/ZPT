package com.zptapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
public class Client {
    @Id
    private String id;

    private String weight;
    private String height;
}