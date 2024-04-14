package com.example.arithmatic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText fnum,snum;
    Button btnadd,btnsub,btnmul,btndiv;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        fnum=(EditText)findViewById(R.id.fnum);
        snum=(EditText)findViewById(R.id.snum);
        btnadd=(Button) findViewById(R.id.btnadd);
        btnsub=(Button) findViewById(R.id.btnsub);
        btndiv=(Button) findViewById(R.id.btndiv);
        btnmul=(Button)findViewById(R.id.btnmul);
        res=(TextView)findViewById(R.id.res);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=new Integer(fnum.getText().toString());
                int n2=new Integer(snum.getText().toString());

                int result=n1+n2;
                res.setText("Result is: "+result);

            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=new Integer(fnum.getText().toString());
                int n2=new Integer(snum.getText().toString());

                int result=(n1-n2);
                res.setText("Result is: "+result);

            }

        });



        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=new Integer(fnum.getText().toString());
                int n2=new Integer(snum.getText().toString());

             int result=n1*n2;
               res.setText("Result is:"+result);

        }

        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=new Integer(fnum.getText().toString());
                int n2=new Integer(snum.getText().toString());
                int result=n1/n2;
                res.setText("Result is:"+result);
            }
        });

    }
}