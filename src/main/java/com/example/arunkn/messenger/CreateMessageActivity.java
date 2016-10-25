package com.example.arunkn.messenger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void sendMessage(View view){

        /*Intent intent = new Intent(this,ReceiveMessageActivity.class);
        EditText edittxt = (EditText) findViewById(R.id.editText);
        String sndmsg = edittxt.getText().toString();
        intent.putExtra("message",sndmsg);
        startActivity(intent);*/

        Intent intent = new Intent(Intent.ACTION_SEND);
        EditText edittxt = (EditText) findViewById(R.id.editText);
        String sndmsg = edittxt.getText().toString();
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,sndmsg);
        String chooseString = getString(R.string.chooseIntent_choose);
        Intent chooseIntent = Intent.createChooser(intent,chooseString);
        startActivity(chooseIntent);
    }
}
