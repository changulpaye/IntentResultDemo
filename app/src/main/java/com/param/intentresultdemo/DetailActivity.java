package com.param.intentresultdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        processAndSendResultBack();
        //cancelAndSendBack();
    }

    private void cancelAndSendBack() {
        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);
        finish();
    }

    private void processAndSendResultBack() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result", "Hi! How are you !");
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }


}
