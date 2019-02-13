package com.example.user.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appear,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      int id=item.getItemId();
      if (id==R.id.mes){
          Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
      }
      else if (id==R.id.call){
          Toast.makeText(this, "Call", Toast.LENGTH_SHORT).show();
      }

      else if (id==R.id.what){
          Toast.makeText(this, "WhatsApp", Toast.LENGTH_SHORT).show();
      }

        return super.onOptionsItemSelected(item);
    }
}
