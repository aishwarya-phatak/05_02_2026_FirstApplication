package com.example.a05_02_2026_firstapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout container;
    TextView welcomeTextView,messageTextView;
    EditText nameEditText,cityEditText;
    Button btnSubmit;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        container = new LinearLayout(this);

        ViewGroup.LayoutParams containerLayoutParams = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
        );

        container.setLayoutParams(containerLayoutParams);
        container.setPadding(10,10,10,10);
        container.setOrientation(LinearLayout.VERTICAL);
        container.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);

        welcomeTextView = new TextView(this);
        welcomeTextView.setText("Welcome to Bitcode!");
        welcomeTextView.setPadding(5,5,5,5);
        welcomeTextView.setLeft(10);
        welcomeTextView.setRight(10);
        welcomeTextView.setTextSize(20);
        welcomeTextView.setBackgroundColor(R.color.light_yellow);

        ViewGroup.LayoutParams layoutParamsForViews = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );

        welcomeTextView.setLayoutParams(layoutParamsForViews);

        messageTextView = new TextView(this);
        messageTextView.setText("Android Feb 2026");
        messageTextView.setPadding(5,5,5,5);
        messageTextView.setLayoutParams(layoutParamsForViews);
        messageTextView.setTop(10);
        messageTextView.setLeft(10);
        messageTextView.setRight(10);
        messageTextView.setTextSize(20);
        messageTextView.setBackgroundColor(R.color.light_yellow);

        nameEditText = new EditText(this);
        nameEditText.setHint("Enter the name");
        nameEditText.setPadding(5,5,5,5);
        nameEditText.setLayoutParams(layoutParamsForViews);
        nameEditText.setTop(10);
        nameEditText.setLeft(10);
        nameEditText.setRight(10);
        nameEditText.setTextSize(20);

        cityEditText = new EditText(this);
        cityEditText.setHint("Enter the city");
        cityEditText.setPadding(5,5,5,5);
        cityEditText.setLayoutParams(layoutParamsForViews);
        cityEditText.setTop(10);
        cityEditText.setLeft(10);
        cityEditText.setRight(10);

        cityEditText.setTextSize(20);

        btnSubmit = new Button(this);
        btnSubmit.setText("Submit");
        btnSubmit.setPadding(5,5,5,5);
        btnSubmit.setLayoutParams(layoutParamsForViews);
        btnSubmit.setTop(10);
        btnSubmit.setLeft(10);
        btnSubmit.setRight(10);
        btnSubmit.setTextSize(20);

        container.addView(welcomeTextView);
        container.addView(messageTextView);
        container.addView(nameEditText);
        container.addView(cityEditText);
        container.addView(btnSubmit);

        setContentView(container);

        //way 1 - passing object of inner class as an argument
//        btnSubmit.setOnClickListener(new BtnSubmitClickListener());

        //way 2 = passing the object of anonymous class
//          btnSubmit.setOnClickListener(new View.OnClickListener() {
//              @Override
//              public void onClick(View v) {
//                    welcomeTextView.setText("Welcome " + nameEditText.getText().toString());
//              }
//          });

        //way 3 - implementing interface at Activity class level
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            if (v == btnSubmit){
                welcomeTextView.setText("Welcome " + nameEditText.getText().toString());
            }
    }

    public class BtnSubmitClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (v == btnSubmit){
                welcomeTextView.setText("Welcome  " + cityEditText.getText().toString());
            }
        }
    }
}