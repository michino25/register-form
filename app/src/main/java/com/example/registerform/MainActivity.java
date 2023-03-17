package com.example.registerform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtPhone;
    private EditText edtAge;
    private CheckBox cbxSport;
    private CheckBox cbxSport2;
    private CheckBox cbxSport3;
    private RadioGroup radGr;
    private RadioButton rad_btn;
    private Button btnRegister;
    String radioValue;
    String[] checkValue = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edt_name);
        edtPhone = findViewById(R.id.edt_phone);
        edtAge = findViewById(R.id.edt_age);
        cbxSport = (CheckBox) findViewById(R.id.cbx_sport);
        cbxSport2 = (CheckBox) findViewById(R.id.cbx_sport2);
        cbxSport3 = (CheckBox) findViewById(R.id.cbx_sport3);
        radGr = (RadioGroup) findViewById(R.id.rad_gr);
        btnRegister = (Button) findViewById(R.id.btn_register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerText();
            }
        });

    }

    private void registerText() {
        User.name = edtName.getText().toString().trim();
        User.phone = edtPhone.getText().toString().trim();
        User.age = edtAge.getText().toString().trim();

        int checkRadioId = radGr.getCheckedRadioButtonId();
        rad_btn = (RadioButton) findViewById(checkRadioId);
        radioValue = String.valueOf(rad_btn.getText());
        User.sex = radioValue;

        User.favorite = "";
        checkValue[0] = cbxSport.isChecked() ? "Đá bóng" : null;
        checkValue[1] = cbxSport2.isChecked() ? "Bơi lội" : null;
        checkValue[2] = cbxSport3.isChecked() ? "Bóng chuyền" : null;

        for (int i = 0; i < 3; i++) {
            if (checkValue[i] != null) {
                if (User.favorite.equals(""))
                    User.favorite += checkValue[i];
                else User.favorite += "; " + checkValue[i];
            }
        }

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
}