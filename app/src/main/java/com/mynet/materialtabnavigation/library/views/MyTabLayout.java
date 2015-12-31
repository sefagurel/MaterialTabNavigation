package com.mynet.materialtabnavigation.library.views;

import android.content.Context;
import android.os.Build;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

/**
 * Created by sefagurel on 16/12/15.
 */
public class MyTabLayout extends TabLayout {

	LinearLayout linearLayout;

	public MyTabLayout(Context context) {
		super(context);
		init(context, null, 0);
	}

	public MyTabLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs, 0);
	}

	public MyTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(context, attrs, defStyleAttr);
	}

	public void refreshTabLayout() {
		init(null, null, 0);

	}

	private void init(Context context, AttributeSet attrs, int defStyleAttr) {

		linearLayout = (LinearLayout) getChildAt(0);

		getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
			@Override
			public void onGlobalLayout() {

				int childCount = linearLayout.getChildCount();
				int layoutWidth = getWidth();
				View firstTabView = linearLayout.getChildAt(0);
				View lastTabView = linearLayout.getChildAt(childCount - 1);

				LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
				lp1.leftMargin = (layoutWidth - firstTabView.getMeasuredWidth()) / 2;
				firstTabView.setLayoutParams(lp1);

				LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
				lp.rightMargin = (layoutWidth - lastTabView.getMeasuredWidth()) / 2;
				lastTabView.setLayoutParams(lp);

				if (Build.VERSION.SDK_INT > Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) {
					getViewTreeObserver().removeOnGlobalLayoutListener(this);
				}
				else {
					getViewTreeObserver().removeGlobalOnLayoutListener(this);
				}
			}
		});

	}

}
