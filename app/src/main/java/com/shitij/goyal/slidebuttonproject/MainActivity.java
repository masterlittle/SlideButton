package com.shitij.goyal.slidebuttonproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.shitij.goyal.slidebutton.SwipeButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwipeButton swipeButton = (SwipeButton)findViewById(R.id.slide);
        swipeButton.addOnSwipeCallback(new SwipeButton.Swipe() {
            @Override
            public void onButtonPress() {
                Toast.makeText(MainActivity.this, "Pressed!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSwipeCancel() {

            }

            @Override
            public void onSwipeConfirm() {
                Toast.makeText(MainActivity.this, "confirmd!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
