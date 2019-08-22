package com.example.marii.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reservations extends AppCompatActivity {

    Button sendfriendmoney,invitefriend,topupaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservations);

        sendfriendmoney=(Button)findViewById(R.id.sendfriendmoney);
        invitefriend=(Button)findViewById(R.id.invitefriend);
        topupaccount=(Button)findViewById(R.id.topup);

        sendfriendmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Reservations.this,Send_friend_money.class);
                startActivity(intent);
            }
        });


        invitefriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Reservations.this,Invite_Friends.class);
                startActivity(intent);
            }
        });

        topupaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Reservations.this,Top_up_account.class);
                startActivity(intent);
            }
        });
    }
}
