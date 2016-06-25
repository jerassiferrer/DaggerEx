package com.mobile.jera.daggerex;

/**
 * Created by jera on 6/25/16.
 */
public interface ResponseHandler<T> {
    public void onFailure(String ErrorMessage);
    public void onResponse(T response);
}
