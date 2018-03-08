package com.example.abautista.loginfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment implements LoginFragment.Cambio {

    View view;
    Data user;



    public FormularioFragment() {
        // Required empty public constructor
    }

    public static FormularioFragment newInstance(){
        FormularioFragment fragment = new FormularioFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view  = inflater.inflate(R.layout.fragment_formulario, container, false);

       this.user=MainActivity.user;

        EditText editText = view.findViewById(R.id.etnombre);
        editText.setText(user.getNombre().toString());
        return view;
    }


    @Override
    public void cambiarPantalla(boolean b, String name) {

    }
}
