package com.example.week3daily3;

import android.os.AsyncTask;


import java.util.Arrays;
import java.util.Random;

public class Async extends AsyncTask <String, String, String> {
    AsyncCallBack asyncCallBack;

    public Async(AsyncCallBack asyncCallBack){
        this.asyncCallBack = asyncCallBack;
    }


    @Override
    protected String doInBackground(String... strings) {

        Random random = new Random();
        int[] array = new int[0];

        for (int i = 0; i <1000 ; i++) {
           int now = (random.nextInt(100));

           array [i] = now;


        }
        Arrays.sort(array);



        return strings[strings.length - 1];
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }

    interface AsyncCallBack {
        void returnString(String string);
    }
}

