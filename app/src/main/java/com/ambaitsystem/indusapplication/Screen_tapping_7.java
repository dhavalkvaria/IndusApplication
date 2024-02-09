package com.ambaitsystem.indusapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class Screen_tapping_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7_screen_tapping);

        final TextView txtview_touch = (TextView) findViewById(R.id.txtview_touch);
        txtview_touch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent e) {
                switch (e.getAction()) {
                    case MotionEvent.ACTION_MOVE: {
                        flag = false;//on move
                        txtview_touch.setText("MOVE");
                        break;
                    }

                    case MotionEvent.ACTION_UP: {
                        txtview_touch.setText("UP");
                        break;
                    }
                    case MotionEvent.ACTION_DOWN: {
                        if (flag == true) {
                            txtview_touch.setText("Down");
                        }
                        flag = true;//first tap
                        break;
                    }
                }
                return true;
            }
        });
    }

    boolean flag = false;


}
