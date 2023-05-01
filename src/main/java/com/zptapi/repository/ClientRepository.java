package com.zptapi.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.zptapi.model.Client;

public interface ClientRepository extends MongoRepository<Client, String> {

    List<Client> findByHeight(String title);

    List<Client> findByWeight(boolean published);
}