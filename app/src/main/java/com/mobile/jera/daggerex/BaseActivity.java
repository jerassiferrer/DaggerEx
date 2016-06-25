package com.mobile.jera.daggerex;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/**
 * Created by jera on 6/25/16.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((App) getApplication()).getObjectGraph().inject(this);
    }
}
