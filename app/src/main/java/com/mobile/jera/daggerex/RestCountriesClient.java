package com.mobile.jera.daggerex;
import java.util.List;
/**
 * Created by jera on 6/25/16.
 */
public interface RestCountriesClient {
    public void Get(ResponseHandler<List<Country>> handler);
}
