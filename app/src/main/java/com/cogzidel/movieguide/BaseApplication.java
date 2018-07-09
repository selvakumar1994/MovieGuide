package com.cogzidel.movieguide;

import android.app.Application;
import android.os.StrictMode;

import com.cogzidel.movieguide.details.DetailsComponent;
import com.cogzidel.movieguide.details.DetailsModule;
import com.cogzidel.movieguide.favorites.FavoritesModule;
import com.cogzidel.movieguide.listing.ListingComponent;
import com.cogzidel.movieguide.listing.ListingModule;
import com.cogzidel.movieguide.network.NetworkModule;
import com.cogzidel.movieguide.listing.sorting.SortingModule;

/**
 * @author arun
 */
public class BaseApplication extends Application
{
    private AppComponent appComponent;
    private DetailsComponent detailsComponent;
    private ListingComponent listingComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        StrictMode.enableDefaults();
        appComponent = createAppComponent();
    }

    private AppComponent createAppComponent()
    {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .favoritesModule(new FavoritesModule())
                .build();
    }

    public DetailsComponent createDetailsComponent()
    {
        detailsComponent = appComponent.plus(new DetailsModule());
        return detailsComponent;
    }

    public void releaseDetailsComponent()
    {
        detailsComponent = null;
    }

    public ListingComponent createListingComponent()
    {
        listingComponent = appComponent.plus(new ListingModule());
        return listingComponent;
    }

    public void releaseListingComponent()
    {
        listingComponent = null;
    }

    public ListingComponent getListingComponent()
    {
        return listingComponent;
    }
}
