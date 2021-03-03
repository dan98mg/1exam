package com.example.a1exam;

import android.media.Image;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class blinker extends CountDownTimer {
    /**
     * @param millisInFuture    The number of millis in the future from the call
     *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
     *                          is called.
     * @param countDownInterval The interval along the way to receive
     *                          {@link #onTick(long)} callbacks.
     */
    public blinker(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    @Override
    public void onTick(long millisUntilFinished) {

    }

    public void image(){
        start();
    }

    @Override
    public void onFinish() {

    }
}
