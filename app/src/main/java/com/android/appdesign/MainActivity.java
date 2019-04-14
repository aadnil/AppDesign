package com.android.appdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText make,year,color,price,engine;
    TextView set_result;
    Button create_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void initializeViews(){
        make=(EditText)findViewById(R.id.make);
        year=(EditText)findViewById(R.id.year);
        color=(EditText)findViewById(R.id.color);
        price=(EditText)findViewById(R.id.price);
        engine=(EditText)findViewById(R.id.engine);


        set_result=(TextView)findViewById(R.id.setresult);

        create_btn=(Button)findViewById(R.id.create_btn);
        create_btn.setOnClickListener(this);

    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.create_btn:
                Model m =new Model(make.getText().toString(),
                year.getText().toString(),color.getText().toString(),price.getText().toString(),engine.getText().toString());

                set_result.setText(set_result.getText() +"\r\n"+m.toString()+"\r\n");
        }
    }
}
