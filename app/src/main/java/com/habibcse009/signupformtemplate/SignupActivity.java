package com.habibcse009.signupformtemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {
    private ImageView imageView;
    private Animation smalltobig, btta, btta2;
    private TextView textView, subtitle_header, txtLogin;
    private Button button;
    private EditText editText, editText2, editText3, editText4, editText5;
    String countries[] = {"Select Area", "Dhaka", "Chattogram", "Rajshahi", "Sylhet", "Barisal", "Kumilla", "Khulna", "Jassore", "Rangpur", "Mymonshing", "Tangail", "Cox's Bazar", "Dinajpur"};
    Spinner sCountry;
    String bloodgroup[] = {"Select Blood Group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
    Spinner sbloodgroup;
    private RadioGroup radioGroup;
    private RadioButton rbMale;
    private RadioButton rbFemale;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().setHomeButtonEnabled(true); //for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//for back button
        getSupportActionBar().setTitle("Register Page");

// load this animation
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        btta = AnimationUtils.loadAnimation(this, R.anim.btta);
        btta2 = AnimationUtils.loadAnimation(this, R.anim.btta2);

        imageView = findViewById(R.id.imageView);

        textView = findViewById(R.id.textView);
        subtitle_header = findViewById(R.id.subtitle_header);
        txtLogin = findViewById(R.id.textView3);

        button = findViewById(R.id.button);

        editText = findViewById(R.id.txt_fullname_signup);
        editText2 = findViewById(R.id.txt_password_signup);
        editText3 = findViewById(R.id.txt_mobile_signup);
        //editText4 = findViewById(R.id.txt_area_signup);
        radioGroup = findViewById(R.id.radiogroup);
        rbMale = findViewById(R.id.rb_male);
        rbFemale = findViewById(R.id.rb_female);
        layout = (LinearLayout) findViewById(R.id.radiogrplayout);

        sCountry = findViewById(R.id.txt_area_signup);
        sbloodgroup = findViewById(R.id.txt_bloodgroup_signup);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sCountry.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, bloodgroup);
        adapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sbloodgroup.setAdapter(adapter1);


        // passing animation and start it
        imageView.startAnimation(smalltobig);

        textView.startAnimation(btta);
        subtitle_header.startAnimation(btta);

        button.startAnimation(btta2);

        editText.startAnimation(btta2);
        editText2.startAnimation(btta2);
        editText3.startAnimation(btta2);
        sCountry.startAnimation(btta2);
        sbloodgroup.startAnimation(btta2);
        layout.startAnimation(btta2);
        txtLogin.startAnimation(btta2);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
