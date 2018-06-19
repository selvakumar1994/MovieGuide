package com.cog.movieguide.details;

import com.cog.movieguide.Movie;
import com.cog.movieguide.Review;
import com.cog.movieguide.Video;

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
