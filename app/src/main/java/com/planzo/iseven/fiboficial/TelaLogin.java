package com.planzo.iseven.fiboficial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.planzo.iseven.example.R;

/**
 * Created by Rodrigo on 07/06/2016.
 */
public class TelaLogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);





    }

    public void  Entrar(View view){
        setContentView(R.layout.tela_seleciona);
    }


    }