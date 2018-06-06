package com.example.cdsm.email;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_click(View view)
    {
        new Thread(new Runnable() {
            @Override
            public void run()
            {
                try {
                    GMailSender sender = new GMailSender("fdmecdsm@gmail.com", "fdme91300");
                    sender.sendMail("Test JavaMail",
                            "OK !!!!!!!!!!!!!",
                            "fdmecdsm@gmail.com",
                            "schiccam@hotmail.fr");
                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }
            }
        }).start();

    }
}
