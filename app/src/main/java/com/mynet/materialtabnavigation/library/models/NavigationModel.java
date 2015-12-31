package com.mynet.materialtabnavigation.library.models;

import android.support.v4.app.Fragment;

/**
 * Created by sefagurel on 01/12/15.
 */
public class NavigationModel {

    private String						title;
    private Class<? extends Fragment>	fragment;

    public String getTitle() {
        return title;
    }

    public NavigationModel(String title, Class<? extends Fragment> fragment) {
        this.title = title;
        this.fragment = fragment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class<? extends Fragment> getFragment() {
        return fragment;
    }

    public void setFragment(Class<? extends Fragment> fragment) {
        this.fragment = fragment;
    }
}
