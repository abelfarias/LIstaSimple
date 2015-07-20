package com.farias.listasimple.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.farias.listasimple.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by FARIAS on 01/12/2014.
 */
public class LibroAdapter  extends ArrayAdapter<Libro> {
   public LibroAdapter(Context context, ArrayList<Libro> libros) {
            super(context, 0, libros);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Libro libro = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext())
                        .inflate(R.layout.libro_item, parent, false);
            }
            TextView lblAutor = (TextView) convertView.findViewById(R.id.Autor);
            TextView lblTitulo = (TextView) convertView.findViewById(R.id.Titulo);

            lblAutor.setText(libro.autor);
            lblTitulo.setText(libro.titulo);


            return convertView;

        }
    }
}
