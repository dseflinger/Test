//CS 184, Daniel Seflinger

package com.danielseflinger.dseflingerxmlcolorswap;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class ColorSwapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_swap);
    }

    public void ChangeColor(View v) {
        final TextView tex = (TextView) findViewById(R.id.textView);

        //generates random RGB values between 0 and 255
        Random rand = new Random();
        int red = rand.nextInt(256);
        int green = rand.nextInt(256);
        int blue = rand.nextInt(256);

        tex.setTextColor(Color.rgb(red, green, blue));
        tex.setText("Color: " + red + "r " + green + "g " + blue + "b");
    }

}
