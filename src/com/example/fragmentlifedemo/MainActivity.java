package com.example.fragmentlifedemo;

import java.util.ArrayList;
import java.util.List;
import com.example.fragmentlifedemo.fragment.Fragment1;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends FragmentActivity {
	private Fragment1 f1;
	private ViewPager vp;
	private List<Fragment> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("------Acrivity------", "onCreate");
		initView();
		initData();
	}

	private void initView() {
		vp = (ViewPager) findViewById(R.id.vp);
		vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return list.size();
			}

			@Override
			public Fragment getItem(int arg0) {
				// TODO Auto-generated method stub
				return list.get(arg0);
			}
		});
	}

	private void initData() {
		list = new ArrayList<Fragment>();
		Fragment1 f1 = new Fragment1();
		list.add(f1);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onRestart");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onResume");
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onPause");
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("------Acrivity------", "onDestroy");
		super.onDestroy();
	}
}
