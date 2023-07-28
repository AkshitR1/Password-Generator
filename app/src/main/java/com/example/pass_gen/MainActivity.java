package com.example.pass_gen;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView tv_password;
    Button btn_generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_password = (TextView)findViewById(R.id.tv_password);
        btn_generate = (Button)findViewById(R.id.btn_generate);


        btn_generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length = 9;

                tv_password.setText(GetPassword(length));

            }
        });

    }

    public String GetPassword(int length){
        char[] chars = "ABCDEFGHIKLMNOPRSTUVWYabcdefhijkmnoprstuwxy012349@#!*&".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        Random rand = new Random();

        for(int i = 0; i < length; i++){
            char c = chars[rand.nextInt(chars.length)];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}