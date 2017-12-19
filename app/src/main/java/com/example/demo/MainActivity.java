package com.example.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.digitalstrawberry.jigsawbug.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = getResources().getDisplayMetrics();

        TextView textView = (TextView) findViewById(R.id.mainText);
        textView.setText(
                "Width: " + metrics.widthPixels + " Height: " + metrics.heightPixels + " dpi: " + metrics.densityDpi + " density: " + metrics.density + " Package: " + getPackageName()
        );
    }
}
