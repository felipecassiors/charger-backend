package dev.felipesantos.charger.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import dev.felipesantos.charger.model.Record;

/**
 * RecordRepository
 */
@RepositoryRestResource
public interface RecordRepository extends MongoRepository<Record, String> {

}