package com.example.mysimplemessendger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messege_create);
    }

    public void onSendMessege(View w){
        EditText messegeView = (EditText)findViewById(R.id.messege);
        String messegeText = messegeView.getText().toString();
        //Intent intent = new Intent(this, ReceiveMessegeActivity.class);
        //intent.putExtra(ReceiveMessegeActivity.EXTRA_MESSEGE, messegeText);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plane");
        intent.putExtra(Intent.EXTRA_TEXT, messegeText);
        startActivity(intent);

    }
}
