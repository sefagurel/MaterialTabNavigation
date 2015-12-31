package com.mynet.materialtabnavigation.library.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mynet.materialtabnavigation.R;

/**
 * Created by sefagurel on 01/12/15.
 */
public class PlaceholderFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";

	public PlaceholderFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_content, container, false);
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		String title = getArguments().getString("param");

		TextView textView = (TextView) view.findViewById(R.id.section_label);
        textView.setText(title + "   " +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n" +
                "\n\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\nx\nyyyyyyyyyyyyyyyyyyyyyyyyyy\nz\n");
		// textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

	}
}
