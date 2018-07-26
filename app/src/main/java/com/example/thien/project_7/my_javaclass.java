package com.example.thien.project_7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class my_javaclass extends AppCompatActivity {

    // These are the global variables
    EditText editName, editPassword;
    TextView result;
    Button buttonSubmit, buttonReset;


    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);

        editName  = (EditText) findViewById(R.id.editName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        result = (TextView) findViewById(R.id.tvResult);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Get the Data and Use it
// get text from EditText name view
                String name = editName.getText().toString();
// get text from EditText password view
                String password = editPassword.getText().toString();
                //result.setText("Name:\t" + name + "\nPassword:\t" + password );

                if(name.equals("thien4512")&&password.equals("1111"))
                {
                    a=1;
                    result.setText("Đăng nhập thành công");

                }
                else {
                    result.setText("sai rồi nhé :))");
                    a=0;
                }

                if(a==1)
                {
                    //setContentView(R.layout.my_layout_2);
                    //result.setText("Đăng nhập thành công\nhi thien4512");
                    Intent intent = new Intent(my_javaclass.this, my_javaclass_2.class);
                    startActivity(intent);
                }
            }
        });
    /*
    Using the id of views specified in layout XML
    we can initialize the view using findViewById
*/


// Attaching OnClick listener to the submit button



        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // clearing out all the values
                editName.setText("");
                editPassword.setText("");
                result.setText("");
                editName.requestFocus();
            }
        });
    }
}
