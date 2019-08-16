package com.example.mysimplemessendger;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class ReceiveMessegeActivity extends AppCompatActivity {
    public static final String EXTRA_MESSEGE = "messege";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_messege);

        Intent intent = getIntent();
        String getMessege = intent.getStringExtra(EXTRA_MESSEGE);
        //String getMessege = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView textView = (TextView)findViewById(R.id.messege2);
        textView.setText(getMessege);
    }
}
