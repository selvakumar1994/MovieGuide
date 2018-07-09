package com.cogzidel.movieguide;

import com.cogzidel.movieguide.details.DetailsComponent;
import com.cogzidel.movieguide.details.DetailsModule;
import com.cogzidel.movieguide.favorites.FavoritesModule;
import com.cogzidel.movieguide.listing.ListingComponent;
import com.cogzidel.movieguide.listing.ListingModule;
import com.cogzidel.movieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author arunsasidharan
 * @author pulkitkumar
 */
@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent
{
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
