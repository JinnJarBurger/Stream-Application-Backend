package dev.jinnjar.stream.repository;

import dev.jinnjar.stream.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author adnan
 * @since 12/5/2023
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
