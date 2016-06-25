package com.mobile.jera.daggerex;

import dagger.ObjectGraph;

/**
 * Created by jera on 6/25/16.
 */
public class App extends android.app.Application {
    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(new ApplicationDIModule());
    }

    public ObjectGraph getObjectGraph() {
        return objectGraph;
    }
}
