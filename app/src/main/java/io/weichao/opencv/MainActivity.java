package io.weichao.opencv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    // Used to load the 'opencv' library on application startup.
    static {
        if (OpenCVLoader.initDebug()) {
            System.loadLibrary("opencv");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'opencv' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}