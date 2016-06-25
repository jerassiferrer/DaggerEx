package com.mobile.jera.daggerex;

import android.util.Log;

import com.squareup.okhttp.OkHttpClient;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
/**
 * Created by jera on 6/25/16.
 */

@Module(injects = MainActivity.class)
public class ApplicationDIModule {
    @Provides
    @Singleton
    public RestCountriesClient providesRestCountriesClient() {
        return new DefaultRestCountriesClient();
    }
}
