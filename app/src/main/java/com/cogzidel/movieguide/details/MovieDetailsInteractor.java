package com.cogzidel.movieguide.details;

import com.cogzidel.movieguide.Review;
import com.cogzidel.movieguide.Video;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author arun
 */
public interface MovieDetailsInteractor
{
    Observable<List<Video>> getTrailers(String id);
    Observable<List<Review>> getReviews(String id);
}
