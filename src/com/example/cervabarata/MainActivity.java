package com.example.cervabarata;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		actionBar.setDisplayShowTitleEnabled(true);

		/** Creating Latinha Tab */
		Tab tab = actionBar
				.newTab()
				.setText("")
				.setTabListener(
						new CustomTabListener<Piriguete>(this, "",
								Piriguete.class)).setIcon(R.drawable.lata48);

		actionBar.addTab(tab);

		/** Creating Latao Tab */
		tab = actionBar
				.newTab()
				.setText("")
				.setTabListener(
						new CustomTabListener<Latao>(this, "", Latao.class))
				.setIcon(R.drawable.latao48);

		actionBar.addTab(tab);
		
		/** Creating Latao Tab */
		tab = actionBar
				.newTab()
				.setText("")
				.setTabListener(
						new CustomTabListener<Piriguete>(this, "", Piriguete.class))
				.setIcon(R.drawable.piri48);

		actionBar.addTab(tab);
	}
}