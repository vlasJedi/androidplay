package com.example.android_play;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
// Need to declare all activities in AndroidManifest.xml
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R.java is a class (with inner classes, like layout or string) generated during the build process
        // with references to your app's resources. Every resource you create
        // (or which is provided by Android) is referenced by an integer in R, called a resource id.
        // R.layout.* references any layout resource you have created, usually in /res/layout.
        // So if you created an activity layout called activity_main.xml,
        // you can then use the reference in R.layout.activity_main to access it.
        setContentView(R.layout.activity_main);
    }
}
