package com.cloned.hackdroid;



import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class FineTuneFragment extends Fragment {
	
	
	SeekBar seekBar1;
	SeekBar seekBar2;
	SeekBar seekBar3;
	SeekBar seekBar4;
	SeekBar seekBar5;
	SeekBar seekBar6;
	SeekBar seekBar7;
	SeekBar seekBar8;
	
    public static Fragment newInstance(Context context) {
    	FineTuneFragment f = new FineTuneFragment();
 
        return f;
    }
	
	@Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	 
		SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
	 // Writing data to SharedPreferences
	 		if (preferences == null) {
	 			@SuppressWarnings("null")
	 			SharedPreferences.Editor editor = preferences.edit();
	 			editor.putFloat("Area1", 20);
	 			editor.putFloat("Area2", 34);
	 			editor.putFloat("Area3", 22);
	 			editor.putFloat("Area4", 40);
	 			editor.putFloat("Area5", 42);
	 			editor.putFloat("Area6", 26);
	 			editor.putFloat("Area7", 17);
	 			editor.putFloat("Area8", 19);
	 			editor.commit();

	 		}
		 
		 
		 
		 
		 
		    View windows = inflater.inflate(R.layout.ajust, container, false);
		    //Generates seekbars for the UI and sets text
	        seekBar1 = ((SeekBar)windows.findViewById(R.id.seekBar1));
	        seekBar2 = ((SeekBar)windows.findViewById(R.id.seekBar2));
	        seekBar3 = ((SeekBar)windows.findViewById(R.id.seekBar3));
	        seekBar4 = ((SeekBar)windows.findViewById(R.id.seekBar4));
	        seekBar5 = ((SeekBar)windows.findViewById(R.id.seekBar5));
	        seekBar6 = ((SeekBar)windows.findViewById(R.id.seekBar6));
	        seekBar7 = ((SeekBar)windows.findViewById(R.id.seekBar7));
	        seekBar8 = ((SeekBar)windows.findViewById(R.id.seekBar8));
	        
	        
	        final TextView seekBarValue1 = ((TextView)windows.findViewById(R.id.TextView1));   
	        final TextView seekBarValue2 = ((TextView)windows.findViewById(R.id.TextView2));   
	        final TextView seekBarValue3 = ((TextView)windows.findViewById(R.id.TextView3));   
	        final TextView seekBarValue4 = ((TextView)windows.findViewById(R.id.TextView4));   
	        final TextView seekBarValue5 = ((TextView)windows.findViewById(R.id.TextView5));   
	        final TextView seekBarValue6 = ((TextView)windows.findViewById(R.id.TextView6));   
	        final TextView seekBarValue7 = ((TextView)windows.findViewById(R.id.TextView7));   
	        final TextView seekBarValue8 = ((TextView)windows.findViewById(R.id.TextView8));
	        
	        //SEEKBAR 1****
	        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue1.setText(String.valueOf(progress));
	     //editor.putFloat("Area1", 20);
	     //String.valueOf(progress)
	     
	     
	     
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	        
	        //SEEKBAR 2 ****
	        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue2.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	      //SEEKBAR 3 ****
	        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue3.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	      //SEEKBAR 4 ****
	        seekBar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue4.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	      //SEEKBAR 5 ****
	        seekBar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue5.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	      //SEEKBAR 6 ****
	        seekBar6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue6.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	      //SEEKBAR 7 ****
	        seekBar7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue7.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	      //SEEKBAR 8 ****
	        seekBar8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){ 

	    @Override 
	    public void onProgressChanged(SeekBar seekBar, int progress, 
	      boolean fromUser) { 
	     // TODO Auto-generated method stub 
	     seekBarValue8.setText(String.valueOf(progress)); 
	    } 

	    @Override 
	    public void onStartTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 

	    @Override 
	    public void onStopTrackingTouch(SeekBar seekBar) { 
	     // TODO Auto-generated method stub 
	    } 
	        }); 
	        
	    

	        
	        
	        
	        
	        
	        
	        
	        return windows;
}}
