package com.example.contextmenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity 
{

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onContextItemSelected(item);
	}

	private TextView m_contextcolor;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		m_contextcolor =(TextView)findViewById(R.id.context_color);
		registerForContextMenu(m_contextcolor);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) 
	{
		switch (v.getId()) 
		{
		case R.id.context_color:
			createMenu(R.menu.color, menu, "Choose a color");
			break;

		default:
			super.onCreateContextMenu(menu, v, menuInfo);
		}
	}
	
	private void createMenu(int menuID, 
			ContextMenu menu, String title)
	{
		getMenuInflater().inflate(menuID, menu);
		menu.setHeaderTitle(title);
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) 
	{
	      switch (item.getItemId()) 
	      {
	         case R.id.menu_red:
	            m_contextcolor.setBackgroundResource
	        	  (R.color.LightRed);
	            return true;
	         case R.id.menu_blue:
	            m_contextcolor.setBackgroundResource(R.color.DullBlue);
	            return true;
	         case R.id.menu_green:
	            m_contextcolor.setBackgroundResource(R.color.LightGreen);
	            return true;
	         default:
	            return super.onContextItemSelected(item);
	      }
	   }
	
	
	}
	


