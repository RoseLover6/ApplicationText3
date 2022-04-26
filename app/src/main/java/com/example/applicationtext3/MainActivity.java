package com.example.applicationtext3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText userNumber,pwd;
    private Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userNumber = findViewById(R.id.editText1);
        pwd = findViewById(R.id.editText2);
        login = findViewById(R.id.button1);
        register = findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userNumber.getText().toString().equals("17641241979")&&pwd.getText().toString().equals("521314")){
                    Toast.makeText(MainActivity.this,"登录成功！",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,MyToolAcyivity.class);
                    intent.putExtra("userNumber",userNumber.getText().toString());
                    intent.putExtra("pwd",pwd.getText().toString());
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this,"登录失败，账号或密码错误！",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}