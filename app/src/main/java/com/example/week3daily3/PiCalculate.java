package com.example.week3daily3;

import android.util.Log;
import java.text.DecimalFormat;

public class PiCalculate {
    public static Runnable piRunnable1() {

        Runnable piRunnable1 = new Runnable() {
            @Override
            public void run() {
                double pi = Math.PI;
                DecimalFormat df = new DecimalFormat("#.############");

                //Log.d("TAG", "Pi to 12th decimal place" + df.format(pi));
                Log.d("TAG" ,"Format to 12th decimal place from Math.PI: " + df.format(pi));
            }

        };
        return piRunnable1;
    }

        public static Runnable piRunnable2() {
            Runnable piRunnable2 = new Runnable() {
                @Override
                public void run() {
                    //
                    double pi2 = 20 * Math.atan(Double.valueOf(1)/Double.valueOf(7)) +
                            8 * Math.atan(Double.valueOf(3)/Double.valueOf(79));
                    DecimalFormat df = new DecimalFormat("#.############");

                    //Log.d("TAG", "Pi to 12th decimal place" + df.format(pi));
                    Log.d("TAG", "Calculate PI using Euler's formula: " + df.format(pi2));
                }

            };
            return piRunnable2;
        }



    public static void main(String[] args) {

        Thread thread1 = new Thread(piRunnable1());
        Thread thread2 = new Thread(piRunnable2());
        thread1.start();
        thread2.start();




    }
}


