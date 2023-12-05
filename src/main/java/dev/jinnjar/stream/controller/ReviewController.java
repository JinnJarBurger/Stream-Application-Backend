package dev.jinnjar.stream.controller;

import dev.jinnjar.stream.model.Review;
import dev.jinnjar.stream.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author adnan
 * @since 12/6/2023
 */
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> reviewAndImdbId) {
        return new ResponseEntity<>(reviewService.createReview(reviewAndImdbId.get("review"), reviewAndImdbId.get("imdbId")), HttpStatus.OK);
    }
}
