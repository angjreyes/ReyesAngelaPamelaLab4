package com.example.cisco2018.reyesangelapamelalab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button action;
    Button normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action = (Button)findViewById(R.id.action);
        normal = (Button)findViewById(R.id.normal);
        action.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(action,"I am SnackBar",Snackbar.LENGTH_LONG);
                snackbar.setAction("Close", new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Toast.makeText(MainActivity.this,"Action Clicked", Toast.LENGTH_LONG);
                        Log.d("LIFECYCLE", "onCreate() in toast was called");
                    }

                });
                snackbar.show();
            }
        });
        normal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Toast",Toast.LENGTH_LONG).show();
                Log.d("LIFECYCLE", "onCreate() was called");
            }
        });



    }
}
