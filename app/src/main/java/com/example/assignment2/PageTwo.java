package com.example.assignment2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PageTwo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        Intent i = getIntent();
        String s = i.getStringExtra("message");

        TextView txtView = (TextView) findViewById(R.id.page2_text);
        txtView.setText(s);

        Toast toast=Toast.makeText(getApplicationContext(),"Successfully submitted !",Toast.LENGTH_LONG);
        toast.show();

    }
}
