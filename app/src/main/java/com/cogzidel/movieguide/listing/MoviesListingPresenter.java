package com.cogzidel.movieguide.listing;

/**
 * @author arun
 */
public interface MoviesListingPresenter
{
    void firstPage();

    void nextPage();

    void setView(MoviesListingView view);

    void destroy();
}
