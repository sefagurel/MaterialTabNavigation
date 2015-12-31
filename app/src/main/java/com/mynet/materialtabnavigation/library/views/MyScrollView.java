package com.mynet.materialtabnavigation.library.views;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ScrollView;

/**
 * Created by sefagurel on 16/12/15.
 */
public class MyScrollView extends ScrollView{

	private int		mTouchSlop;
	private float	mPrevX;

    private float xDistance, yDistance, lastX, lastY;


    OnTouchDetect onTouchDetect;

    public interface OnScrollChangedListener {
        void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt);
    }

    private OnScrollChangedListener mOnScrollChangedListener;


    public void setOnScrollChangedListener(OnScrollChangedListener listener) {
        mOnScrollChangedListener = listener;
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mOnScrollChangedListener != null) {
            mOnScrollChangedListener.onScrollChanged(this, l, t, oldl, oldt);
        }

    }



    public interface OnTouchDetect {
        boolean touchEvent(MotionEvent ev);

        boolean interceptTouchEvent(MotionEvent ev);
    }

    public void  addOnTouchDetect(OnTouchDetect onTouchDetect){
        this.onTouchDetect=onTouchDetect;
    }

	public MyScrollView(Context context) {
		super(context);
		init(context, null, 0);
	}

	public MyScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context, attrs, 0);
	}

	public MyScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context, attrs, defStyle);
	}

	private void init(Context context, AttributeSet attrs, int defStyleAttr) {
//        setOnScrollChangeListener(this);
	}

//    @Override
//    public boolean onTouchEvent(MotionEvent ev) {
//        return onTouchDetect.touchEvent(ev);
////        return super.onTouchEvent(ev);
//    }
//
//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        return onTouchDetect.interceptTouchEvent(ev);
////        return super.onInterceptTouchEvent(ev);
//    }


//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//
//        switch (ev.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                xDistance = yDistance = 0f;
//                lastX = ev.getX();
//                lastY = ev.getY();
//                break;
//            case MotionEvent.ACTION_MOVE:
//                final float curX = ev.getX();
//                final float curY = ev.getY();
//                xDistance += Math.abs(curX - lastX);
//                yDistance += Math.abs(curY - lastY);
//                lastX = curX;
//                lastY = curY;
//                if (xDistance < yDistance)
//                    return true;
//        }
//
//         return super.onInterceptTouchEvent(ev);
////        return false;
//    }


}
