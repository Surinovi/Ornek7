package com.ab2016.neval.ornek7;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private GestureDetectorCompat mDetector;
    Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());


    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
        /* Notified when a tap occurs with the down MotionEvent that triggered it. This
        will be triggered immediately for every down event. All other events should
        be preceded by this. */
        @Override
        public boolean onDown(MotionEvent event) {
            //tv.setText("onDown: " + event.toString());
            return true;
        }

        /* Notified when a single-tap occurs. */
        @Override
        public boolean onSingleTapConfirmed(MotionEvent event) {
            intent = new Intent(MainActivity.this,IkinciActivity.class);
            startActivity(intent);
            return true;
        }

        /* Notified when a double-tap occurs. */
        @Override
        public boolean onDoubleTap(MotionEvent event) {
            intent = new Intent(MainActivity.this,UcuncuActivity.class);
            startActivity(intent);
            return true;
        }
    }
}
