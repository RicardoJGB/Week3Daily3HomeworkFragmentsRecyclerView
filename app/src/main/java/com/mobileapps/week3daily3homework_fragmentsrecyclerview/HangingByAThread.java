package com.mobileapps.week3daily3homework_fragmentsrecyclerview;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;

import static com.mobileapps.week3daily3homework_fragmentsrecyclerview.Constants.TAG_ERROR_THREADS;

public class HangingByAThread extends Thread {

    TextView tvPassedTextView;

        Handler threadHandler = new Handler (Looper.getMainLooper());

        public HangingByAThread(TextView tvPassedTextView){
            this.tvPassedTextView=tvPassedTextView;
        }

        @Override
        public void run(){
            super.run();
            for (int secondCounter =0;secondCounter<Constants.DURATION;secondCounter++){
                final int currentSecond=secondCounter+1;
                try {
                    Thread.sleep(Constants.ONE_SECOND_IN_MILISECONDS);
                } catch (Exception e){
                    Log.e(TAG_ERROR_THREADS, "NOT SLEEPY",e);
                }
                threadHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        tvPassedTextView.setText(Constants.THREAD_RUN_STRING+currentSecond);

                    }
                });

            }
        }

    }


