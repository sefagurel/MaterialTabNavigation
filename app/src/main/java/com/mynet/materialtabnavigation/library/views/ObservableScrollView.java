package com.mynet.materialtabnavigation.library.views;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.mynet.materialtabnavigation.R;

/**
 * Created by sefagurel on 31/12/15.
 */
public class ObservableScrollView extends ScrollView {

	Toolbar toolbar;

	public ObservableScrollView(Context context) {
		super(context);
	}

	public ObservableScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public ObservableScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void setToolbar(Toolbar toolbar) {
		this.toolbar = toolbar;
	}

	@Override
	protected void onScrollChanged(int x, int y, int oldx, int oldy) {
		super.onScrollChanged(x, y, oldx, oldy);
        final int headerHeight =  90;
        final float ratio = (float) Math.min(Math.max(y, 0), headerHeight) / headerHeight;
        final int newAlpha = (int) (ratio * 255);
        toolbar.setAlpha(newAlpha);
	}

}
