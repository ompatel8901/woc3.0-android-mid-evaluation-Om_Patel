package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sendit(View view)
    {
        Toast.makeText(this, "Sending the message...", Toast.LENGTH_SHORT).show();
    }
    public void receiveit(View view)
    {
        Toast.makeText(this, "Receiving the message...", Toast.LENGTH_SHORT).show();
    }
    public void deleteit(View view)
    {
        Toast.makeText(this, "Deleting the message...", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
