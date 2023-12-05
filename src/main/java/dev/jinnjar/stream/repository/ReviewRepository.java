package dev.jinnjar.stream.repository;

import dev.jinnjar.stream.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author adnan
 * @since 12/6/2023
 */
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
