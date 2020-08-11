package com.share.jack.customcircleprogressbar;

import android.app.Activity;
import android.os.Bundle;

import com.share.jack.customcircleprogressbar.widget.CircleProgressBar;

public class MainActivity extends Activity {

    private CircleProgressBar progressBarOne;
    private CircleProgressBar progressBarTwo;
    private CircleProgressBar progressBarThree;
    private CircleProgressBar progressBarFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBarOne = (CircleProgressBar) findViewById(R.id.am_progressbar_one);
        progressBarTwo = (CircleProgressBar) findViewById(R.id.am_progressbar_two);
        progressBarThree = (CircleProgressBar) findViewById(R.id.am_progressbar_three);
        progressBarFour = (CircleProgressBar) findViewById(R.id.am_progressbar_four);

        progressBarOne.setProgress(20);
        progressBarTwo.setProgress(40);
        progressBarThree.setProgress(100);
        //progressBarFour.setProgress(80);
        progressBarFour.setProgress2(80);
        progressBarFour.setPause(true);
        //progressBarThree.setPause(true);
        //progressBarThree.setBackgroundColor(Color.TRANSPARENT);

    }
}