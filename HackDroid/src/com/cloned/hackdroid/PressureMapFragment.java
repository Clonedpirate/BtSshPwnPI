package com.cloned.hackdroid;

import junit.framework.Assert;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class PressureMapFragment extends Fragment {

	Button StartCrackingBtn;
	EditText usr_nm;
	Context context;
	Assert myAssert;
    Session session;
    Channel channel;

	public static Fragment newInstance(Context context) {
		PressureMapFragment f = new PressureMapFragment();

		return f;
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		
		 new Thread(new Runnable()
		    {
		        public void run()
		        {
		            connectSSH();
		        }
		    }).start();
		 
		 
		 
		 
		 
		// donno if working yet
		// SharedPreferences preferences =
		// this.getActivity().getSharedPreferences("pref",0);

		// Writing data to SharedPreferences
		// if (preferences == null) {
		// @SuppressWarnings("null")
		// SharedPreferences.Editor editor = preferences.edit();
		// editor.putFloat("Area1", 46);
		// editor.putFloat("Area2", 74);
		// editor.putFloat("Area3", 62);
		// editor.putFloat("Area4", 56);
		// editor.putFloat("Area5", 47);
		// editor.putFloat("Area6", 56);
		// editor.putFloat("Area7", 85);
		// editor.putFloat("Area8", 68);
		// editor.commit();
		// }

		View android = inflater.inflate(R.layout.pressuremap, container, false);
		System.out.println("working");
		StartCrackingBtn = ((Button) android.findViewById(R.id.button1));
		usr_nm = ((EditText) android.findViewById(R.id.usrtxt));

		// Generating UI elements
		// imageResult = ((ImageView)android.findViewById(R.id.PressureMap1));
		// pressureBar = ((SeekBar)android.findViewById(R.id.pressurebar));
		// PressureLink = ((CheckBox)android.findViewById(R.id.checkBox1));
		// PressureLink.setChecked(true);
		// //Gets the first image, Random pressure
		// bitmapMaster = BitmapFactory.decodeResource(this.getResources(),
		// R.drawable.cushionareas);
		// //puts the image into the ImageResult frame
		// imageResult.setImageBitmap(bitmapMaster);
		
		
		StartCrackingBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			    ((ChannelExec)channel).setCommand("ls");
			    try {
			        channel.connect();
			    } catch (JSchException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			    }
			    channel.disconnect();
			}
			
		 });

		return android;
	}
	
	
	
	
	
	
	private void connectSSH() 
	{
	    JSch jsch = new JSch();
	    try {
	        session = jsch.getSession("root", "192.168.42.15",22);

	    } catch (JSchException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    session.setPassword("toor");
	    session.setConfig("StrictHostKeyChecking", "no");
	    try {
	        session.connect(40000);
	        channel = session.openChannel("exec");
	    } catch (JSchException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }

	}
	
	
	 public void unlock(View view) {
		    ((ChannelExec)channel).setCommand("python /home/door/doorUnlocker.py unlock");
		    try {
		        channel.connect();
		    } catch (JSchException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    channel.disconnect();
		}

		public void lock(View view) {
		    ((ChannelExec)channel).setCommand("python /home/door/doorUnlocker.py lock");
		    try {
		        channel.connect();
		    } catch (JSchException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		    channel.disconnect();
		}

}