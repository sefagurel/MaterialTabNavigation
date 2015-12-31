package com.mynet.materialtabnavigation.library.tools;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.mynet.materialtabnavigation.R;

/**
 * Created by sefagurel on 01/12/15.
 */
public class NavigationItemSelected implements NavigationView.OnNavigationItemSelectedListener {

	Context context;

	public NavigationItemSelected(Context context) {
		this.context = context;
	}

	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		// Handle navigation view item clicks here.
		int id = item.getItemId();

		if (id == R.id.nav_camera) {
			// Handle the camera action
		}
		else if (id == R.id.nav_gallery) {

		}
		else if (id == R.id.nav_slideshow) {

		}
		else if (id == R.id.nav_manage) {

		}
		else if (id == R.id.nav_share) {

		}
		else if (id == R.id.nav_send) {

		}

		DrawerLayout drawer = (DrawerLayout) ((AppCompatActivity) context).findViewById(R.id.drawer_layout);
		if (drawer != null) {
			drawer.closeDrawer(GravityCompat.START);
		}
		return true;
	}
}
