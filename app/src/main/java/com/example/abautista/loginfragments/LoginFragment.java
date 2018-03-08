package com.example.abautista.loginfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    Cambio cambio;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         final View view = inflater.inflate(R.layout.fragment_login, container, false);

        Button btnLogin = view.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEt = (EditText)view.findViewById(R.id.etEmail2);
                String name = nameEt.getText().toString();
                cambio.cambiarPantalla(true,name);
            }

        });

        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public LoginFragment() {
        // Required empty public constructor
    }
    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
try
        {
            cambio = (Cambio) context;
        }
        catch (ClassCastException e){
            throw new ClassCastException(context.toString()+
                    "debe implementar interfaceFragmentA");
        }

    }

    public interface Cambio{
        public void cambiarPantalla(boolean b, String name);
    }

}
