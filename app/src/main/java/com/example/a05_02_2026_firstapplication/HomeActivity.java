package com.example.a05_02_2026_firstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtWelcome,txtAndroidBatch;
    EditText edtUsername, edtPassword;
    Button btnSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        txtWelcome = findViewById(R.id.txtWelcome);
        txtAndroidBatch = findViewById(R.id.txtAndroidBatch);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        btnSubmit = findViewById(R.id.btnSubmit);

        //way 4 -- attaching listener by creating reference of interface

        View.OnClickListener btnSubmitListener = new BtnSubmitClickListener();
        btnSubmit.setOnClickListener(btnSubmitListener);
    }

    public class BtnSubmitClickListener implements  View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (edtUsername.getText().toString().equals("Bitcode") &&
                    (edtPassword.getText().toString().equals("Bitcode"))) {
                txtWelcome.setText("Welcome To " + edtUsername.getText().toString());
            }else{
                Toast.makeText(HomeActivity.this,
                        "credentials are incorrect",
                        Toast.LENGTH_LONG).show();
            }
        }
    }
}
