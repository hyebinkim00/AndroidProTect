package org.techtown.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText  TextInput_pwd,TextInput_email;
    LinearLayout Test_login;


    String emailCheck="123@gmail.com";
    String pwdCheck="1234";

    String inputEmail = "";
    String inputPwd= "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInput_email = findViewById(R.id.TextInput_email);
        TextInput_pwd = findViewById(R.id.TextInput_pwd);
        Test_login = findViewById(R.id.Test_login);

        Test_login.setClickable(false);


        TextInput_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Log.d("senti",s+","+count);

                if(s!=null){
                    inputEmail=s.toString();
                    if (inputEmail.equals(emailCheck) && inputPwd.equals(pwdCheck)){
                        Test_login.setClickable(true);
                    }else{
                        Toast.makeText(MainActivity.this,"로그인 실패입니다",Toast.LENGTH_LONG).show();
                        Test_login.setClickable(false);}


                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        TextInput_pwd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Log.d("senti",s+","+count);
                if(s!=null){
                    inputPwd=s.toString();
                    Test_login.setEnabled(validation());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        /*Test_login.setClickable(true); //클릭 가능여부*/

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

    public boolean validation(){
        return inputEmail.equals(emailCheck) && inputPwd.equals(pwdCheck);

    }
}