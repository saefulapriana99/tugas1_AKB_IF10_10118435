package com.example.tugas1_akb_if10_10118435;

        import android.content.Intent;
        import android.os.Build;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.content.ContextCompat;

public class SplashScreen extends AppCompatActivity {
    //IF10-10118435-SAEFUL APRIANA
    //7:00 PM 04/07/2021
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}