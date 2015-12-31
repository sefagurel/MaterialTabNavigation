package com.mynet.materialtabnavigation.library.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;

import com.mynet.materialtabnavigation.library.models.NavigationModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sefagurel on 01/12/15.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private Context					context;
	private List<NavigationModel>	navigationModels;

	public SectionsPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		this.context = context;
		navigationModels = new ArrayList<>();
	}

	public void addFragment(NavigationModel navigationModel) {
		navigationModels.add(navigationModel);
	}

	@Override
	public Fragment getItem(int position) {
		Fragment fragment = Fragment.instantiate(context, navigationModels.get(position).getFragment().getName());
		Bundle args1 = new Bundle();
		args1.putString("param", getPageTitle(position).toString());
		fragment.setArguments(args1);
		return fragment;

	}

	@Override
	public CharSequence getPageTitle(int position) {
		return navigationModels.get(position).getTitle();
	}

	@Override
	public int getCount() {
		return navigationModels.size();
	}

	@Override
	public int getItemPosition(Object object) {
		return POSITION_NONE;
	}
}