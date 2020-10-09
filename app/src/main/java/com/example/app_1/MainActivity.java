package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    public void GoToNewIntent (View view){
        Log.i( "Info", "Transition" );
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra( "Msg","Act 2" );
        startActivity(intent);
    }
}


