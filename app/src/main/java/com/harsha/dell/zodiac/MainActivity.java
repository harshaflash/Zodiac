package com.harsha.dell.zodiac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText t1;
    String st1,st,st2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = (Spinner)findViewById(R.id.sp1);
        sp2 = (Spinner)findViewById(R.id.sp2);
        t1 = (EditText)findViewById(R.id.et1);
    }

    public  void click(View v)
    {
        st = sp1.getSelectedItem().toString();
        st2 = sp2.getSelectedItem().toString();
        st1  = t1.getText().toString();
        Intent i = new Intent(MainActivity.this,Main2Activity.class);
        i.putExtra("name", st1);
        i.putExtra("date",st);
        i.putExtra("month",st2);
        startActivity(i);
    }

}
