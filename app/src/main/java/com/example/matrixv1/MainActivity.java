package com.example.matrixv1;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.View;

import androidx.core.view.WindowCompat;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    //define buttons
    Button alarmButton;
    Button timerButton;
    Button lightButton;
    Switch lightSwitch;
    Button textButton;
    Button resetButton;
    Button alarmCancelButton;
    Button alarmSaveButton;
    Button textCancelButton;
    Button textSaveButton;
    Button timerCancelButton;
    Button timerSaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //initialize buttons
        //main activity buttons
        alarmButton = findViewById(R.id.alarm_button);
        timerButton = findViewById(R.id.timer_button);
        lightButton = findViewById(R.id.light_button);
        lightSwitch = findViewById(R.id.light_switch);
        textButton = findViewById(R.id.text_button);
        resetButton = findViewById(R.id.reset_button);


        //disable lightswitch until lightButton is clicked
        lightSwitch.setEnabled(false);

        //on click alarmButton, open alarm popup window
        alarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the color of the button to green
                alarmButton.setBackgroundColor(Color.GREEN);

                // Disable other buttons
                timerButton.setEnabled(false);
                textButton.setEnabled(false);
                lightButton.setEnabled(false);
                lightSwitch.setEnabled(false);

                // Create a new instance of the PopupWindow class
                PopupWindow popupWindow = new PopupWindow(MainActivity.this);

                // Set the content view of the popup window to the layout you created
                View popupView = getLayoutInflater().inflate(R.layout.alarm_popup, null);
                popupWindow.setContentView(popupView);

                // Set the width and height of the popup window
                popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

                // Show the popup window at the center of the screen
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);

                //initialize cancel button
                alarmCancelButton = popupView.findViewById(R.id.cancel_button_alarm);
                //initialize save button
                alarmSaveButton = popupView.findViewById(R.id.save_button_alarm);

                //set cancel button listener
                alarmCancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss(); // dismiss the popup window
                    }
                });

                //set save button listener
                alarmSaveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                         // dismiss the popup window
                    }
                });
            }
        });

        //on click textButton, open text popup window
        textButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the color of the button to green
                textButton.setBackgroundColor(Color.GREEN);

                // Disable other buttons
                lightButton.setEnabled(false);
                lightSwitch.setEnabled(false);

                // Create a new instance of the PopupWindow class
                PopupWindow popupWindow = new PopupWindow(MainActivity.this);

                // Set the content view of the popup window to the layout you created
                View popupView = getLayoutInflater().inflate(R.layout.text_popup, null);
                popupWindow.setContentView(popupView);

                // Set the width and height of the popup window
                popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

                // Show the popup window at the center of the screen
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);

                //initialize cancel button
                textCancelButton = popupView.findViewById(R.id.cancel_button_text);
                //initialize save button
                textSaveButton = popupView.findViewById(R.id.save_button_text);

                //set cancel button listener
                textCancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss(); // dismiss the popup window
                    }
                });

                //set save button listener
                textSaveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // dismiss the popup window
                    }
                });
            }
        });

        //on click timerButton, open timer popup window
        timerButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingInflatedId")
            @Override
            public void onClick(View v) {
                //change the color of the button to green
                timerButton.setBackgroundColor(Color.GREEN);

                // Disable other buttons
                alarmButton.setEnabled(false);
                lightButton.setEnabled(false);
                lightSwitch.setEnabled(false);

                // Create a new instance of the PopupWindow class
                PopupWindow popupWindow = new PopupWindow(MainActivity.this);

                // Set the content view of the popup window to the layout you created
                View popupView = getLayoutInflater().inflate(R.layout.timer_popup, null);
                popupWindow.setContentView(popupView);

                // Set the width and height of the popup window
                popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);

                // Show the popup window at the center of the screen
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);

                //initialize cancel button
                timerCancelButton = popupView.findViewById(R.id.cancel_button_timer);
                //initialize save button
                timerSaveButton = popupView.findViewById(R.id.save_button_timer);

                //set cancel button listener
                timerCancelButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popupWindow.dismiss(); // dismiss the popup window
                    }
                });

                //set save button listener
                timerSaveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // dismiss the popup window
                    }
                });
            }
        });

        //on click lightButton, open timer popup window
        lightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the color of the button to green
                lightButton.setBackgroundColor(Color.GREEN);

                //enable lightswitch
                lightSwitch.setEnabled(true);

                // Disable other buttons
                alarmButton.setEnabled(false);
                textButton.setEnabled(false);
                timerButton.setEnabled(false);
            }
        });
    }
}
