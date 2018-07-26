package com.example.thien.project_7;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class my_javaclass_2 extends AppCompatActivity {
    Button buttonSubmit_2;
    TextView result_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout_2);


        buttonSubmit_2 = (Button) findViewById(R.id.buttonSubmit_2);
        result_2 = findViewById(R.id.Textview5);
        // initiate the radio button
        RadioButton maleRadioButton = (RadioButton) findViewById(R.id.rb_male);
        // check current state of the radio button (true or false)
        Boolean RadioButtonState = maleRadioButton.isChecked();

        final CheckBox myCheckbox = (CheckBox) findViewById(R.id.myCheckbox);
        final CheckBox myCheckbox_2 = (CheckBox) findViewById(R.id.myCheckbox_2);
        // check current state of the check box (true or false)


        buttonSubmit_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Boolean CheckBoxState = myCheckbox.isChecked();
                final Boolean CheckBoxState_2 = myCheckbox_2.isChecked();
                    if((CheckBoxState==true) && (CheckBoxState_2==true))
                    {
                        result_2.setText("denied 1");
                    }
                    else if (CheckBoxState == true) {
                    result_2.setText("wellcome team 2");
                    Intent intent_2 = new Intent(my_javaclass_2.this, my_javaclass_3.class);
                    startActivity(intent_2);
                    }
                    else if(CheckBoxState_2==true)
                {
                    result_2.setText("wellcome team 1");
                    Intent intent_3 = new Intent(my_javaclass_2.this, my_javaclass_4.class);
                    startActivity(intent_3);
                }
                    else     result_2.setText("denied 2");
                }
            });
    };
}