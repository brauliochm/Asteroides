package com.example.splitx2mb.asteroides;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatCallback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity  {

    Button btnPlay,btnConfig,btnAbout,btnExit;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay=(Button) findViewById(R.id.btnJugar);
        btnConfig=(Button) findViewById(R.id.btnConfigurar);
        btnAbout=(Button) findViewById(R.id.btnAcercaDe);
        btnExit=(Button) findViewById(R.id.btnSalir);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"A jugar",Toast.LENGTH_SHORT).show();
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
              //  Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show(); ;
            }
        });
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Creditos.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.itemJugar:
                Toast.makeText(getApplicationContext(),"A jugar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.itemSalir:
                System.exit(0);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
