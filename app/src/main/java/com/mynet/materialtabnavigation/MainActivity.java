package com.mynet.materialtabnavigation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mynet.materialtabnavigation.library.adapters.SectionsPagerAdapter;
import com.mynet.materialtabnavigation.library.fragments.PlaceholderFragment;
import com.mynet.materialtabnavigation.library.models.NavigationModel;
import com.mynet.materialtabnavigation.library.tools.NavigationItemSelected;
import com.mynet.materialtabnavigation.library.views.MyTabLayout;
import com.mynet.materialtabnavigation.library.views.MyViewPager;
import com.mynet.materialtabnavigation.library.views.ObservableScrollView;

public class MainActivity extends AppCompatActivity {

	private FragmentManager			fragmentManager;
	private Toolbar					toolbar;
	private MyTabLayout				tabLayout;
	private MyViewPager				viewPager;
	private ObservableScrollView	myScrollView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		// toolbar.setBackgroundColor(0x99ff0000);
		setSupportActionBar(toolbar);

		View child = getLayoutInflater().inflate(R.layout.fragment_content, null);
		myScrollView = (ObservableScrollView) child.findViewById(R.id.nested_scroll);

		myScrollView.setToolbar(toolbar);

		viewPager = (MyViewPager) findViewById(R.id.viewpager);

		tabLayout = (MyTabLayout) findViewById(R.id.tabs);

		viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

			}

			@Override
			public void onPageSelected(int position) {

			}

			@Override
			public void onPageScrollStateChanged(int state) {

			}
		});

		fragmentManager = getSupportFragmentManager();
		// fragmentManager.beginTransaction().replace(R.id.fragment_container, new NavigationFragment()).commit();

		SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(this, fragmentManager);

		mSectionsPagerAdapter.addFragment(new NavigationModel("Günün Özeti", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Son Dakika", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Magazin", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Spor", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Yemek", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Kadın", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Politika", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Dünya", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Finans", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Yaşam", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Teknoloji", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Galeri", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Video", PlaceholderFragment.class));
		mSectionsPagerAdapter.addFragment(new NavigationModel("Sinema", PlaceholderFragment.class));

		viewPager.setAdapter(mSectionsPagerAdapter);
		tabLayout.setupWithViewPager(viewPager);

		// viewPager.setOnTouchListener(new View.OnTouchListener() {
		//
		// int dragthreshold = 30;
		// int downX;
		// int downY;
		//
		// @Override
		// public boolean onTouch(View v, MotionEvent event) {
		//
		// switch (event.getAction()) {
		// case MotionEvent.ACTION_DOWN:
		// downX = (int) event.getRawX();
		// downY = (int) event.getRawY();
		// break;
		// case MotionEvent.ACTION_MOVE:
		// int distanceX = Math.abs((int) event.getRawX() - downX);
		// int distanceY = Math.abs((int) event.getRawY() - downY);
		//
		// if (distanceY > distanceX && distanceY > dragthreshold) {
		// viewPager.requestDisallowInterceptTouchEvent(false);
		// myScrollView.requestDisallowInterceptTouchEvent(true);
		// }
		// else if (distanceX > distanceY && distanceX > dragthreshold) {
		// viewPager.requestDisallowInterceptTouchEvent(true);
		// myScrollView.requestDisallowInterceptTouchEvent(false);
		// }
		// break;
		// case MotionEvent.ACTION_UP:
		// myScrollView.requestDisallowInterceptTouchEvent(false);
		// viewPager.requestDisallowInterceptTouchEvent(false);
		// break;
		// }
		// return false;
		// }
		// });

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.setDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(new NavigationItemSelected(MainActivity.this));

		// viewPager.addOnTouchDetect(new MyViewPager.OnTouchDetect() {
		// @Override
		// public boolean touchEvent(MotionEvent ev) {
		// System.out.println("");
		// return true;
		// }
		//
		// @Override
		// public boolean interceptTouchEvent(MotionEvent ev) {
		// System.out.println("");
		// return true;
		// }
		// });

		// myScrollView.addOnTouchDetect(new MyScrollView.OnTouchDetect() {
		// @Override
		// public boolean touchEvent(MotionEvent ev) {
		// System.out.println("");
		// return true;
		// }
		//
		// @Override
		// public boolean interceptTouchEvent(MotionEvent ev) {
		// System.out.println("");
		// return true;
		// }
		// });

	}

	@Override
	public void onBackPressed() {
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);

		tabLayout.refreshTabLayout();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void onScrollChanged(ObservableScrollView scrollView, int x, int y, int oldx, int oldy) {
		final int headerHeight = findViewById(R.id.toolbar).getHeight() - getSupportActionBar().getHeight();
		final float ratio = (float) Math.min(Math.max(y, 0), headerHeight) / headerHeight;
		final int newAlpha = (int) (ratio * 255);
		toolbar.setAlpha(newAlpha);
	}
}
