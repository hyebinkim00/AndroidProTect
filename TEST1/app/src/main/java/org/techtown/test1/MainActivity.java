package org.techtown.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText  TextInput_pwd,TextInput_email;
    LinearLayout Test_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInput_email = findViewById(R.id.TextInput_email);
        TextInput_pwd = findViewById(R.id.TextInput_pwd);
        Test_login = findViewById(R.id.Test_login);

        String email = TextInput_email.getText().toString();
        String pwd = TextInput_pwd.getText().toString();

        Test_login.setClickable(true);
        Test_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = TextInput_email.getText().toString();
                String pwd = TextInput_pwd.getText().toString();

                Intent intent= new Intent(MainActivity.this,LoginResultActivity.class);
                intent.putExtra("email",email);
                intent.putExtra("pwd",pwd);
                startActivity(intent);

            }
        });
    }
}