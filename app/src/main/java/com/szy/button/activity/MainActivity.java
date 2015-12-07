package com.szy.button.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
	private Button btn1=null;
	private Button btn2=null;
	private Button btn3=null;
	private Button btn4=null;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn1=(Button)findViewById(R.id.btn1);
		btn2=(Button)findViewById(R.id.btn2);
		btn3=(Button)findViewById(R.id.btn3);
		btn4=(Button)findViewById(R.id.btn4);
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(listener);
		btn3.setOnClickListener(listener);
		btn4.setOnClickListener(listener);
	}
	
	private OnClickListener listener=new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			Button btn=(Button)v;
			switch (btn.getId())
			{
			case R.id.btn1:
				Toast.makeText(MainActivity.this, "Button1 is clicked.", Toast.LENGTH_LONG).show();
				break;
			case R.id.btn2:
				System.out.println("Button2 is clicked.");
				Toast.makeText(MainActivity.this, "Button2 is clicked.", Toast.LENGTH_LONG).show();
				break;
			case R.id.btn3:
				Toast.makeText(MainActivity.this, "Button3 is clicked.", Toast.LENGTH_LONG).show();
				break;
			case R.id.btn4:
				System.out.println("Button4 is clicked.");
				Toast.makeText(MainActivity.this, "Button4 is clicked.", Toast.LENGTH_LONG).show();
				break;
			}
		}
	};
}
