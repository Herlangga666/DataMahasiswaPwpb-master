package app.android.datamahasiswapwpb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable(){
            public void run(){
                Intent home=new Intent(Splash_screen.this, DashboardActivity.class);
                startActivity(home);
                finish();
            }
        },4000);
    }
}
