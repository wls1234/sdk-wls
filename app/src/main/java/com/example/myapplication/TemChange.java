package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemChange extends AppCompatActivity implements View.OnClickListener{
    TextView out;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temchange);
        TextView out1=findViewById(R.id.textView2);
        EditText edit=findViewById(R.id.tem1);
        Button btn=findViewById(R.id.button);
        TextView out=findViewById(R.id.textView3);
        btn.setOnClickListener(this);
    }
    public void onClick(View v) {
        String str=edit.getText().toString();
        float tem1=Float.parseFloat(str);
        float tem=(float)(tem1*(9/5)+32);
        out.setText("结果："+tem);
    }
}
