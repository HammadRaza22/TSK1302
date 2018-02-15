package com.example.ghummanjeee.tsk1302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    EditText mUser,mPass;
    Button mbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUser=(EditText) findViewById(R.id.Muser);
        mPass=(EditText) findViewById(R.id.Mpass);
        mbtn=(Button)findViewById(R.id.btn);
        mbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "CLick Here", Toast.LENGTH_SHORT).show();
    }

}
