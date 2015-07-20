package com.farias.listasimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.farias.listasimple.model.Libro;
import com.farias.listasimple.model.LibroAdapter;

import java.util.ArrayList;


public class MainActivity extends Activity {
    private ListView lstNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

        String[] nombres=new String[]{"casa","silla","Manco","Barco"};

        ArrayList<Libro> libros=new ArrayList<Libro>()

        libros.add(new Libro("Android I","mario"));
        libros.add(new Libro("PHP I","JUAN"));
        libros.add(new Libro("Nodejs","JKD"));
        libros.add(new Libro("JAVA","JOSE"));


        LibroAdapter adapter = new LibroAdapter(this, libros);

        //lstNombres=(ListView) findViewById(R.id.lstNombres);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombres);
        lstNombres.setAdapter(adapter);





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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
