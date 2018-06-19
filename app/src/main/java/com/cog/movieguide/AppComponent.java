package com.cog.movieguide;

import com.cog.movieguide.details.DetailsComponent;
import com.cog.movieguide.details.DetailsModule;
import com.cog.movieguide.favorites.FavoritesModule;
import com.cog.movieguide.listing.ListingComponent;
import com.cog.movieguide.listing.ListingModule;
import com.cog.movieguide.network.NetworkModule;

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
