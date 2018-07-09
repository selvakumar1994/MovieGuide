package com.cogzidel.movieguide.details;

import com.cogzidel.movieguide.Movie;
import com.cogzidel.movieguide.Review;
import com.cogzidel.movieguide.Video;

import java.util.List;

/**
 * @author arun
 */
interface MovieDetailsView
{
    void showDetails(Movie movie);
    void showTrailers(List<Video> trailers);
    void showReviews(List<Review> reviews);
    void showFavorited();
    void showUnFavorited();
}
