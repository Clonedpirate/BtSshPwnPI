package com.cloned.hackdroid;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
 
public class ViewPagerStyle1Activity extends FragmentActivity {
    private ViewPager _mViewPager;
    private ViewPagerAdapter _adapter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        //sets the titlebar and statuts bar translusant
//        Window w = getWindow();
//        w.setFlags(
//                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
//                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//        w.setFlags(
//                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
//                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        
    	// Writing data to SharedPreferences
    	if (preferences == null) {
    		@SuppressWarnings("null")
    		SharedPreferences.Editor editor = preferences.edit();
    		editor.putFloat("Area1", 46);
    		editor.putFloat("Area2", 74);
    		editor.putFloat("Area3", 62);
    		editor.putFloat("Area4", 56);
    		editor.putFloat("Area5", 47);
    		editor.putFloat("Area6", 56);
    		editor.putFloat("Area7", 85);
    		editor.putFloat("Area8", 68);
    		editor.commit();
    	}
        setContentView(R.layout.main);
        setUpView();
        setTab();
    }
    private void setUpView(){
     _mViewPager = (ViewPager) findViewById(R.id.viewPager);
     _adapter = new ViewPagerAdapter(getApplicationContext(),getSupportFragmentManager());
     _mViewPager.setAdapter(_adapter);
     _mViewPager.setCurrentItem(0);
    }
    private void setTab(){
            _mViewPager.setOnPageChangeListener(new OnPageChangeListener(){
 
                        @Override
                        public void onPageScrollStateChanged(int position) {}
                        @Override
                        public void onPageScrolled(int arg0, float arg1, int arg2) {}
                        @Override
                        public void onPageSelected(int position) {
                            // TODO Auto-generated method stub
                            switch(position){
                            case 0:
                                findViewById(R.id.first_tab).setVisibility(View.VISIBLE);
                                findViewById(R.id.second_tab).setVisibility(View.INVISIBLE);
                                findViewById(R.id.third_tab).setVisibility(View.INVISIBLE);
                                break;
 
                            case 1:
                                findViewById(R.id.first_tab).setVisibility(View.INVISIBLE);
                                findViewById(R.id.second_tab).setVisibility(View.VISIBLE);
                                findViewById(R.id.third_tab).setVisibility(View.INVISIBLE);
                                break;
                            case 2:
                            	findViewById(R.id.first_tab).setVisibility(View.INVISIBLE);
                                findViewById(R.id.second_tab).setVisibility(View.INVISIBLE);
                                findViewById(R.id.third_tab).setVisibility(View.VISIBLE);
                                break;
                            }
                        }
 
                    });
 
    }
}