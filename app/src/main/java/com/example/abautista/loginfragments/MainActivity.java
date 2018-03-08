package com.example.abautista.loginfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoginFragment.Cambio {
    LoginFragment loginFragment;
    FormularioFragment formularioFragment;
    BlankFragment blankFragment;
    Button btnLogin;
    public static Data user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginFragment = loginFragment.newInstance();

        blankFragment = BlankFragment.newInstance();
        btnLogin =(Button)findViewById(R.id.btnLogin);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction  =  fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_login,loginFragment);
        fragmentTransaction.commit();



    }

    @Override
    public void cambiarPantalla(boolean b, String name) {

      user = new Data();
        user.setNombre(name);



if(b) {
    formularioFragment = FormularioFragment.newInstance();
  /*  formularioFragment.user.setNombre(name);*/
    FragmentManager fm = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fm.beginTransaction();
    fragmentTransaction.replace(R.id.frame_layout_login, formularioFragment);
    fragmentTransaction.commit();
}

    }
}
