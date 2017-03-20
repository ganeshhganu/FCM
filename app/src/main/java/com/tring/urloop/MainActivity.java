package com.tring.urloop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.token).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String refreshedToken = FirebaseInstanceId.getInstance().getToken();
                Log.e("TAG", "onClick: New Token" );
            }
        });
    }
}
