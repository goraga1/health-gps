package com.example.healthgps;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.healthgps.listview.ActionSlideExpandableListView;

public class ListActivity extends Activity {
	SimpleListAdapter listAdapter;

	@Override
	public void onCreate(Bundle savedData) {

		super.onCreate(savedData);
		this.setContentView(R.layout.single_expandable_list);
		ActionSlideExpandableListView list = (ActionSlideExpandableListView) this
				.findViewById(R.id.list);
		ArrayList<String> array = new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			array.add(String.valueOf(i));
		}

		listAdapter = new SimpleListAdapter(this, array);
		list.setAdapter(buildDummyData());
		list.setItemActionListener(
				new ActionSlideExpandableListView.OnActionClickListener() {
					@Override
					public void onClick(View listView, View buttonview,
							int position) {
						switch (buttonview.getId()) {
						case R.id.buttonA:

							break;
						case R.id.buttonB:

							break;
						case R.id.buttonC:

							break;
						case R.id.buttonD:

							break;
						}

					}

					// note that we also add 1 or more ids to the
					// setItemActionListener
					// this is needed in order for the listview to discover the
					// buttons
				}, R.id.buttonA, R.id.buttonB, R.id.buttonC, R.id.buttonD);
	}

	/**
	 * Builds dummy data for the test. In a real app this would be an adapter
	 * for your data. For example a CursorAdapter
	 */
	public ArrayAdapter<String> buildDummyData() {
		ArrayList<String> movies = null;

		final int SIZE = 20;
		String[] values = new String[SIZE];
		for (int i = 0; i < SIZE; i++) {
			values[i] = String.valueOf(i);
		}
		return new ArrayAdapter<String>(this, R.layout.expandable_list_item,
				R.id.movieTitle, values);
	}

}
