package com.example.registerform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView txtName;
    private TextView txtPhone;
    private TextView txtAge;
    private TextView txtFavorite;
    private  TextView txtSex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtName = findViewById(R.id.txt_name);
        txtPhone = findViewById(R.id.txt_phone);
        txtAge = findViewById(R.id.txt_age);
        txtFavorite = findViewById(R.id.txt_favorite);
        txtSex = findViewById(R.id.txt_sex);

        txtName.setText(User.name);
        txtAge.setText(User.age);
        txtPhone.setText(User.phone);
        txtFavorite.setText(User.favorite);
        txtSex.setText(User.sex);



    }
}