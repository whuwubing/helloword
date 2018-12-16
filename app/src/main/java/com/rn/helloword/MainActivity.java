package com.rn.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countUp(View view) {
        count++;
        TextView tv = findViewById(R.id.textView2);
        if(tv != null){
            tv.setText(Integer.toString(count));
        }
    }

    public void countDown(View view) {
        count--;
        TextView tv = findViewById(R.id.textView2);
        if(tv != null){
            tv.setText(Integer.toString(count));
        }
        showToast(view);
    }


    public void showToast(View view){
        Toast.makeText(this,R.string.app_name, Toast.LENGTH_LONG).show();
    }
}
