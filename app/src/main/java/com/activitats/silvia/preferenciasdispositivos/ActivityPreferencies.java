package com.activitats.silvia.preferenciasdispositivos;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityPreferencies extends PreferenceActivity  implements SharedPreferences.OnSharedPreferenceChangeListener{
    private String correo, fondo, fuente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencescreen);


        SharedPreferences prefs = getSharedPreferences("preferencescreen", Context.MODE_PRIVATE);
        //SharedPreferences.Editor editor = prefs.edit();
       // correo = prefs.getString("mail", "por_defecto@email.com");
       // fuente= prefs.getString("opColorFondo","Color.WHITE");
        //fondo = prefs.getString("opColorFuente","Color.RED");



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_preferencies, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    }
}
