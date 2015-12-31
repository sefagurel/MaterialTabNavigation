package com.mynet.materialtabnavigation.library.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

import java.lang.reflect.Field;

/**
 * Created by sefagurel on 16/12/15.
 */
public class MyViewPager extends ViewPager {

	private boolean isPagingEnabled = true;

	private int		mTouchSlop;
	private float	mPrevX;

	private float xDistance, yDistance, lastX, lastY;

	OnTouchDetect onTouchDetect;

	public interface OnTouchDetect {
		boolean touchEvent(MotionEvent ev);

		boolean interceptTouchEvent(MotionEvent ev);
	}

	public void addOnTouchDetect(OnTouchDetect onTouchDetect) {
		this.onTouchDetect = onTouchDetect;
	}

	public MyViewPager(Context context) {
		super(context);
		init(context, null);
	}

	public MyViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs);
	}

	private void init(Context context, AttributeSet attrs) {
		// mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setMyScroller();
	}

	private void setMyScroller() {
		try {
			Class<?> viewpager = ViewPager.class;
			Field scroller = viewpager.getDeclaredField("mScroller");
			scroller.setAccessible(true);
			scroller.set(this, new MyScroller(getContext()));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public class MyScroller extends Scroller {
		public MyScroller(Context context) {
			super(context, new DecelerateInterpolator());
		}

		@Override
		public void startScroll(int startX, int startY, int dx, int dy, int duration) {
			super.startScroll(startX, startY, dx, dy, 200 /* 1 secs */);
		}
	}

	// @Override
	// public boolean onTouchEvent(MotionEvent ev) {
	//// return onTouchDetect.touchEvent(ev);
	// return super.onTouchEvent(ev);
	// }
	//
	// @Override
	// public boolean onInterceptTouchEvent(MotionEvent ev) {
	//// return onTouchDetect.interceptTouchEvent(ev);
	// return super.onInterceptTouchEvent(ev);
	// }

	// public void setSwipeable(boolean swipeable) {
	// this.isPagingEnabled = swipeable;
	// }
	//
	// @Override
	// public boolean onTouchEvent(MotionEvent event) {
	// return isPagingEnabled && super.onTouchEvent(event);
	// }
	//
	// @Override
	// public boolean onInterceptTouchEvent(MotionEvent event) {
	// return isPagingEnabled && super.onInterceptTouchEvent(event);
	// }

	// @Override
	// public boolean onInterceptTouchEvent(MotionEvent ev) {
	//
	// switch (ev.getAction()) {
	// case MotionEvent.ACTION_DOWN:
	// xDistance = yDistance = 0f;
	// lastX = ev.getX();
	// lastY = ev.getY();
	// break;
	// case MotionEvent.ACTION_MOVE:
	// final float curX = ev.getX();
	// final float curY = ev.getY();
	// xDistance += Math.abs(curX - lastX);
	// yDistance += Math.abs(curY - lastY);
	// lastX = curX;
	// lastY = curY;
	// if (xDistance > yDistance)
	// return true;
	// }
	//
	// return super.onInterceptTouchEvent(ev);
	//// return false;
	// }

}
