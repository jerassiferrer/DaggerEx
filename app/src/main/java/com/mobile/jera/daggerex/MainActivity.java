package com.mobile.jera.daggerex;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
//http://xurxodeveloper.blogspot.com/2014/11/inyeccion-de-dependencias-en-android-con-dagger.html
public class MainActivity extends AppCompatActivity {
   // RestCountriesClient restCountriesClient = new DefaultRestCountriesClient();
   @Inject
   RestCountriesClient restCountriesClient;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        context = getApplicationContext();

        final List<Country> countries= new ArrayList<Country>();

        final CountryItemAdapter adapter = new CountryItemAdapter(this,countries);

        ListView gridView = (ListView) findViewById(R.id.countriesList);
        gridView.setAdapter(adapter);

        restCountriesClient.Get(new ResponseHandler<List<Country>>(){
            @Override
            public void onFailure(String ErrorMessage) {
                Toast.makeText(context,ErrorMessage, Toast.LENGTH_SHORT);
            }

            @Override
            public void onResponse(final List<Country> response) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (Country country:response){
                            countries.add(country);
                        }

                        adapter.notifyDataSetChanged();
                    }
                });

            }
        });
    }


}
