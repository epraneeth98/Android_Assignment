package com.example.assignment2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PageTwo.class);

                intent.putExtra("message", sendToast());
                startActivity(intent);
            }
        });
    }


    public String sendToast() {
        EditText edtTxtName = findViewById(R.id.name);
        String name = "Name:  "+edtTxtName.getText().toString();

        EditText dob = findViewById(R.id.dob);
        String dateOfBirth = "Date of Birth:  "+dob.getText().toString();

        EditText addr = findViewById(R.id.address);
        String address ="Address:  "+addr.getText().toString();

        EditText cityText = findViewById(R.id.city);
        String city = "City:  "+cityText.getText().toString();

        EditText Pin = findViewById(R.id.pincode);
        String pincode ="PinCode:  "+ Pin.getText().toString();

        EditText mob = findViewById(R.id.mobile);
        String mobile ="Mobile:  "+ mob.getText().toString();

        EditText mail = findViewById(R.id.email);
        String email ="Mail id:  "+ mail.getText().toString();

        EditText inter = findViewById(R.id.interests);
        String interests ="Interests:\n"+ inter.getText().toString();

        EditText exp = findViewById(R.id.experience);
        String experience = "Experience:\n"+exp.getText().toString();

        boolean is_sde = false;
        RadioButton rd1 = findViewById(R.id.sde);
        if(rd1.isChecked()==true){
            is_sde = true;
        }

        String message = name + "\n" + dateOfBirth+ "\n" +address+ "\n" +city+ "\n" +pincode+ "\n" +mobile
                + "\n" +email+ "\n" +interests+ "\n" + experience + "\nProfession: "+ ((is_sde==true)?"SDE" : "Analyst");

//        Toast toast=Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
//        toast.show();
        return message;
    }
}