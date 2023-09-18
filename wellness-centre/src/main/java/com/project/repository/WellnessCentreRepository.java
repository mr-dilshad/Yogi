package com.project.repository;

import com.project.model.WellnessCentre;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WellnessCentreRepository extends MongoRepository<WellnessCentre, UUID> {
}
