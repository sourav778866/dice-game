
package com.example.fs;

//import static android.net.sip.SipErrorCode.TIME_OUT;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;

import java.math.*;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

//import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    public int roll(int x) {
        x = (int) (Math.random() * 5) + 1;
        return x;
    }

    int score = 0, score1 = 0,n1=0,n2=0;
    //    int k=0;
//    public int TIME_OUT=1000;
    private Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample);
        ImageView i = findViewById(R.id.imageView);
        ImageView i1 = findViewById(R.id.imageView1);
        TextView t1=findViewById(R.id.textView);
        TextView t2=findViewById(R.id.textView1);
        Button b1 = findViewById(R.id.button);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button4);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        Button b8 = findViewById(R.id.button8);

        ImageView g1 = findViewById(R.id.gifh);
        ImageView g2 = findViewById(R.id.gifh1);
        b7.setEnabled(false);
        b8.setEnabled(false);
        int[] dice = {
                0,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
        };
        while(score>=10||score1>=10) {
            b1.setOnClickListener(view -> {
                b1.setEnabled(false);
                b2.setEnabled(true);
                b3.setEnabled(true);
                n1=1;

            });
            b2.setOnClickListener(view -> {
                b1.setEnabled(true);
                b2.setEnabled(false);
                b3.setEnabled(true);
                n1=1;
            });
            b3.setOnClickListener(view -> {
                b1.setEnabled(true);
                b2.setEnabled(true);
                b3.setEnabled(false);
                n1=1;
            });
            b4.setOnClickListener(view -> {
                b4.setEnabled(false);
                b5.setEnabled(true);
                b6.setEnabled(true);
                n2=1;

            });
            b5.setOnClickListener(view -> {
                b4.setEnabled(true);
                b5.setEnabled(false);
                b6.setEnabled(true);
                n2=1;
            });
            b6.setOnClickListener(view -> {
                b4.setEnabled(true);
                b5.setEnabled(true);
                b6.setEnabled(false);
                n2=1;
            });


            g1.setOnClickListener(view -> {
                if (n1==1&&n2==1) {
                    Random r = new Random();
                    int k = r.nextInt(6) + 1;
                    int p = r.nextInt(6) + 1;
                    int s = k + p;
                    if (!b1.isEnabled() && s < 7) {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        score++;
                        //  Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
                    } else if (!b3.isEnabled() && s > 7) {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        score++;
                        //  Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
                    } else if (!b2.isEnabled() && s == 7) {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        score += 2;
                        //Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
                    } else {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        Toast.makeText(getApplicationContext(), "" + score, Toast.LENGTH_SHORT).show();
                    }

                    if (!b4.isEnabled() && s < 7) {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        score1++;
                        //  Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
                    } else if (!b6.isEnabled() && s > 7) {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        score1++;
                        //  Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
                    } else if (!b5.isEnabled() && s == 7) {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        score1 += 2;
                        //Toast.makeText(getApplicationContext(),""+score,Toast.LENGTH_SHORT).show();
                    } else {
                        mp.start();
                        i.setVisibility(View.INVISIBLE);
                        i1.setVisibility(View.INVISIBLE);
                        g1.setVisibility(View.VISIBLE);
                        g2.setVisibility(View.VISIBLE);
                        new Handler().postDelayed(() -> {
                            // This method will be executed once the timer is over
                            g1.setVisibility(View.INVISIBLE);
                            g2.setVisibility(View.INVISIBLE);
                            i.setVisibility(View.VISIBLE);
                            i1.setVisibility(View.VISIBLE);
                            i.setImageResource(dice[k]);
                            i1.setImageResource(dice[p]);


                        }, 1000);
                        // Toast.makeText(getApplicationContext(), "" + score, Toast.LENGTH_SHORT).show();
                    }
                    t1.setText(score);
                    t2.setText(score1);
                    if (score >= 10 && score1 < 10) {
                        Toast.makeText(getApplicationContext(), "1 win", Toast.LENGTH_SHORT).show();
                    } else if (score1 >= 10 && score < 10) {
                        Toast.makeText(getApplicationContext(), "2 win", Toast.LENGTH_SHORT).show();
                    } else if (score == 10 && score1 == 10) {
                        Toast.makeText(getApplicationContext(), "Draw", Toast.LENGTH_SHORT).show();
                    }

                    b7.setPressed(true);
                } else {
                    b7.setPressed(true);
                    b8.setText("Roll");

                }
                //b.setEnabled(false);
            });

        }





//



//         for(int j=0;j<=5;j++) {
///           @SuppressLint("UseCompatLoadingForDrawables") Drawable d = getResources().getDrawable(dice[k++]);
////             i.setImageDrawable(d);
//             i.setImageResource(dice[j]);
//             @SuppressLint("ResourceType") Animation rotateimage = AnimationUtils.loadAnimation(this, R.animator.cc);
//             i.startAnimation(rotateimage);
//             new Handler().postDelayed(() -> {
//
//             }, TIME_OUT);
        //      }

    }
}