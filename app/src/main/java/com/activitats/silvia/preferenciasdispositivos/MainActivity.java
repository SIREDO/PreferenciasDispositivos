package com.activitats.silvia.preferenciasdispositivos;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
    private Button mostrar;
    private TextView correo, email, letra, fondo;
    ActivityPreferencies pref = new ActivityPreferencies();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar= (Button) findViewById(R.id.bMostrar);
        correo= (TextView)findViewById(R.id.tvCorreo);
        email= (TextView)findViewById(R.id.tvEmail);
        fondo= (TextView)findViewById(R.id.tvFondo);
        letra= (TextView) findViewById(R.id.tvFuente);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(
                        ActivityPreferencies.this);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(MainActivity.this,ActivityPreferencies.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
