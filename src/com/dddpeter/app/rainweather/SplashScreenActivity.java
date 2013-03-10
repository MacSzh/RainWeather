package com.dddpeter.app.rainweather;


import java.util.HashMap;

import com.dddpeter.app.rainweather.object.ParamApplication;
import com.dddpeter.app.rainweather.util.FileOperator;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SplashScreenActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
 
		setContentView(R.layout.activity_splash_screen);
	   //������������1����
			  new Handler().postDelayed(new Runnable() {
				   @Override
			  public void run() {
				  Intent intent = new Intent(SplashScreenActivity.this,IndexActivity.class);  //����������ui��ת����ui
			    startActivity(intent);
			    SplashScreenActivity.this.finish();    // ����������������
			   }
			  }, 2000);    //������������2����
			  
		 }
}

