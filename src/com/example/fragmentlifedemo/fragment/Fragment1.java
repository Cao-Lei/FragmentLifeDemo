package com.example.fragmentlifedemo.fragment;

import com.example.fragmentlifedemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {


	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub

		Log.i("------Fragment------", "onAttach");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment------", "onCreate");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment------", "onCreateView");
		View view = inflater.inflate(R.layout.fragment1, null);

		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("------Fragment------", "onActivityCreated");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		Log.i("------Fragment------", "onStart");
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.i("------Fragment------", "onResume");
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public void onPause() {
		Log.i("------Fragment------", "onPause");
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i("------Fragment------", "onStop");
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.i("------Fragment------", "onDestroyView");
		// TODO Auto-generated method stub
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.i("------Fragment------", "onDestroy");
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.i("------Fragment------", "onDetach");
		// TODO Auto-generated method stub
		super.onDetach();
	}

}
