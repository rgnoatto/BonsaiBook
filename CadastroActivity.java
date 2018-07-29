package com.gnoatto.bonsaibook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void salvar(View view){

    }

    public void cancelar(View view){
        finish();
    }
}
