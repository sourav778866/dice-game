package com.example.fs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
//import android.widget.Toast;

import java.util.*;

public class MainActivity2 extends AppCompatActivity {
// final MediaPlayer m=MediaPlayer.create(this,R.raw.win);
 ImageView ip1_1, ip1_2, ip1_3, ip1_4, ip1_5, ip1_6, ip1_7, ip1_8, ip1_9;
 ImageView ip2_1, ip2_2, ip2_3, ip2_4, ip2_5, ip2_6, ip2_7, ip2_8, ip2_9;
 List<ImageView> ip1;
 List<ImageView> ip2;
 Button p1r1, p1r2;
 Button p2r1, p2r2;
 ImageView dice1, dice2;

 TextView point1, point2;
 TextView status;
 ImageView ig1,ig2;
// private Button button;

 int pnt1 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
 int pnt2 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
 int d1,d2,ds;
 List<Integer> combinations;
//    ArrayList<ArrayList<Integer>> l=new ArrayList<>();
//    public void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
//
//        if(sos > tar){
//
//            return;
//        }
//
//        if(idx == arr.length){
//            if(sos == tar){
//                String[] splitArray = set.split(",");
//                ArrayList<Integer> li=new ArrayList<>();
//                // int[] array = new int[splitArray.length];
//
//
//                for (String s : splitArray) {
//                    li.add(Integer.parseInt(s));
//                }
//
//                // System.out.println(set+".");
//                l.add(li);
//                //System.out.println(Arrays.toString(array));
//            }
//            return;
//        }
//
//        printTargetSumSubsets(arr, idx + 1, set+arr[idx]+",", sos + arr[idx], tar);
//        printTargetSumSubsets(arr, idx + 1, set, sos, tar);
//    }
//    ArrayList<Integer> search(ArrayList<ArrayList<Integer>> p,int h)
//    {
//        ArrayList<Integer> b=new ArrayList<>();
//        for(int i=0;i<p.size();i++)
//        {
//            for(int j=0;j<p.get(i).size();j++)
//            {
//                if(p.get(i).get(j)==h)
//                {
//                    b.
//                }
//            }
//
//        }
//    }
//    public int sum;

 //    @SuppressLint({"SetTextI18n", "ClickableViewAccessibility"})
 @SuppressLint("ResourceAsColor")
 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main2);



//
//  button = (Button) findViewById(R.id.button);
//  button.setOnClickListener(view -> {
//   final Dialog dialog = new Dialog(MainActivity2.this);
//
//   //setting custom layout to dialog
//   dialog.setContentView(R.layout.activity_rules);
//   dialog.setTitle("Custom Dialog");
//
//   //adding text dynamically
//   TextView txt = (TextView) dialog.findViewById(R.id.textView99);
//   txt.setText("Put your dialog text here.");
//
//   ImageView image = (ImageView)dialog.findViewById(R.id.image);
//   image.setImageDrawable(getResources().getDrawable(android.R.drawable.ic_dialog_info));
//
//   //adding button click event
//   Button dismissButton = (Button) dialog.findViewById(R.id.button);
//   dismissButton.setOnClickListener(v -> dialog.dismiss());
//   dialog.show();
//  });









  final MediaPlayer mp=MediaPlayer.create(this,R.raw.sample);

   ig1= findViewById(R.id.gifh);
  ig2= findViewById(R.id.gifh1);
  ig1.setVisibility(View.INVISIBLE);
  ig2.setVisibility(View.INVISIBLE);
  ip1_1 = findViewById(R.id.imageView1);
  ip1_2 = findViewById(R.id.imageView2);
  ip1_3 = findViewById(R.id.imageView3);
  ip1_4 = findViewById(R.id.imageView4);
  ip1_5 = findViewById(R.id.imageView5);
  ip1_6 = findViewById(R.id.imageView6);
  ip1_7 = findViewById(R.id.imageView7);
  ip1_8 = findViewById(R.id.imageView8);
  ip1_9 = findViewById(R.id.imageView9);
  ip1_1.setTag("1");
  ip1_2.setTag("2");
  ip1_3.setTag("3");
  ip1_4.setTag("4");
  ip1_5.setTag("5");
  ip1_6.setTag("6");
  ip1_7.setTag("7");
  ip1_8.setTag("8");
  ip1_9.setTag("9");

  ip1 = new ArrayList<>();
  ip1.add(ip1_1);
  ip1.add(ip1_2);
  ip1.add(ip1_3);
  ip1.add(ip1_4);
  ip1.add(ip1_5);
  ip1.add(ip1_6);
  ip1.add(ip1_7);
  ip1.add(ip1_8);
  ip1.add(ip1_9);


  ip2_1 = findViewById(R.id.image2View1);
  ip2_2 = findViewById(R.id.image2View2);
  ip2_3 = findViewById(R.id.image2View3);
  ip2_4 = findViewById(R.id.image2View4);
  ip2_5 = findViewById(R.id.image2View5);
  ip2_6 = findViewById(R.id.image2View6);
  ip2_7 = findViewById(R.id.image2View7);
  ip2_8 = findViewById(R.id.image2View8);
  ip2_9 = findViewById(R.id.image2View9);

  ip2_1.setTag("1");
  ip2_2.setTag("2");
  ip2_3.setTag("3");
  ip2_4.setTag("4");
  ip2_5.setTag("5");
  ip2_6.setTag("6");
  ip2_7.setTag("7");
  ip2_8.setTag("8");
  ip2_9.setTag("9");
  ip2 = new ArrayList<>();
  ip2.add(ip2_1);
  ip2.add(ip2_2);
  ip2.add(ip2_3);
  ip2.add(ip2_4);
  ip2.add(ip2_5);
  ip2.add(ip2_6);
  ip2.add(ip2_7);
  ip2.add(ip2_8);
  ip2.add(ip2_9);
  p1r1 = findViewById(R.id.p1r1);
  p1r2 = findViewById(R.id.p1r2);
  p2r1 = findViewById(R.id.p2r1);
  p2r2 = findViewById(R.id.p2r2);
  dice1 = findViewById(R.id.dice1);
  dice2 = findViewById(R.id.dice2);
  point1 = findViewById(R.id.point1);
  point2 = findViewById(R.id.point2);
  status = findViewById(R.id.status);
  combinations =new ArrayList<>();

  for (ImageView i : ip1) {
   i.setEnabled(false);
   i.setColorFilter(Color.argb(150,200,200,200));
  }
  for (ImageView i : ip2) {
   i.setEnabled(false);
   i.setColorFilter(Color.argb(150,200,200,200));
  }
  p1r1.setEnabled(false);
  p2r1.setEnabled(false);
  p2r2.setEnabled(false);
  p1r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
  p2r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
  p2r2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);

  for (ImageView b : ip1) {
   b.setOnClickListener(view -> {
    view.setVisibility(View.INVISIBLE);
    for (ImageView i : ip1) {
     i.setEnabled(false);
     i.setColorFilter(Color.argb(150,200,200,200));
    }
    ds=ds-Integer.parseInt(view.getTag().toString());
    pnt1=pnt1-Integer.parseInt(view.getTag().toString());
   cal(ds,ip1);
   if(ds==0)
   {
    dice1.setVisibility(View.GONE);
    dice2.setVisibility(View.GONE);
    if(ip1_7.getVisibility()==View.VISIBLE
            ||ip1_8.getVisibility()==View.VISIBLE
            ||ip1_7.getVisibility()==View.VISIBLE) {
     p1r1.setEnabled(false);
     p1r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
    }
    else
    {
     p1r1.setEnabled(true);
     p1r1.getBackground().setColorFilter(null);
    }
    p1r2.setEnabled(true);
    p1r2.getBackground().setColorFilter(null);
    for (ImageView i : ip1) {
     i.setEnabled(false);
     i.setColorFilter(Color.argb(150,200,200,200));
    }
   }
   else
   {
    checkp1();
   }
   });


  }

  for (ImageView b : ip2) {
   b.setOnClickListener(view -> {
    view.setVisibility(View.INVISIBLE);
    for (ImageView i : ip2) {
     i.setEnabled(false);
     i.setColorFilter(Color.argb(150,200,200,200));
    }
    ds=ds-Integer.parseInt(view.getTag().toString());
    pnt2=pnt2-Integer.parseInt(view.getTag().toString());
    cal(ds,ip2);
    if(ds==0)
    {
     dice1.setVisibility(View.GONE);
     dice2.setVisibility(View.GONE);
     if(ip2_7.getVisibility()==View.VISIBLE
             ||ip2_8.getVisibility()==View.VISIBLE
             ||ip1_2.getVisibility()==View.VISIBLE) {
      p2r1.setEnabled(false);
      p2r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
     }
     else
     {
      p2r1.setEnabled(true);
      p2r1.getBackground().setColorFilter(null);
     }
     p2r2.setEnabled(true);
     p2r2.getBackground().setColorFilter(null);
     for (ImageView i : ip2) {
      i.setEnabled(false);
      i.setColorFilter(Color.argb(150,200,200,200));
     }
    }
    else
    {
     checkp2();
    }
   });
  }

  p1r1.setOnClickListener(view -> {
     p1r1.setEnabled(false);
   p1r2.setEnabled(false);
   p1r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   p1r2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);

   Random r=new Random();
   d1 =r.nextInt(6)+1;
   ds=d1;
   ig1.setVisibility(View.VISIBLE);
   mp.start();
   new Handler().postDelayed(() -> {
    // This method will be executed once the timer is over
    ig1.setVisibility(View.INVISIBLE);
    dice1.setVisibility(View.VISIBLE);
    setImage(d1,dice1);
    cal(ds,ip1);
    checkp1();

   }, 1000);

  });
  p1r2.setOnClickListener(view -> {
   p1r1.setEnabled(false);
   p1r2.setEnabled(false);
   p1r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   p1r2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   Random r=new Random();
   d1 =r.nextInt(6)+1;
   d2 =r.nextInt(6)+1;
   ds=d1+d2;
   mp.start();
   ig1.setVisibility(View.VISIBLE);
   ig2.setVisibility(View.VISIBLE);
   new Handler().postDelayed(() -> {
    // This method will be executed once the timer is over
    ig1.setVisibility(View.INVISIBLE);
    ig2.setVisibility(View.INVISIBLE);
    dice1.setVisibility(View.VISIBLE);
    dice2.setVisibility(View.VISIBLE);
    setImage(d1,dice1);
    setImage(d2,dice2);
    cal(ds,ip1);
    checkp1();
   }, 1000);

  });
  p2r1.setOnClickListener(view -> {
   p2r1.setEnabled(false);
   p2r2.setEnabled(false);
   p2r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   p2r2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   Random r=new Random();
   d1 =r.nextInt(6)+1;

   ds=d1;
   mp.start();
   ig1.setVisibility(View.VISIBLE);
   new Handler().postDelayed(() -> {
    // This method will be executed once the timer is over
    ig1.setVisibility(View.INVISIBLE);
    dice1.setVisibility(View.VISIBLE);
    setImage(d1,dice1);

    cal(ds,ip2);
    checkp2();

   }, 1000);

  });
  p2r2.setOnClickListener(view -> {
   p2r1.setEnabled(false);
   p2r2.setEnabled(false);
   p2r1.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   p2r2.getBackground().setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
   Random r=new Random();
   d1 =r.nextInt(6)+1;
   d2 =r.nextInt(6)+1;
   ds=d1+d2;
   mp.start();
   dice1.setVisibility(View.INVISIBLE);
   dice2.setVisibility(View.INVISIBLE);
   ig1.setVisibility(View.VISIBLE);
   ig2.setVisibility(View.VISIBLE);
   new Handler().postDelayed(() -> {
    // This method will be executed once the timer is over
    ig1.setVisibility(View.INVISIBLE);
    ig2.setVisibility(View.INVISIBLE);
    dice1.setVisibility(View.VISIBLE);
    dice2.setVisibility(View.VISIBLE);

    setImage(d1,dice1);
    setImage(d2,dice2);
    cal(ds,ip2);
    checkp2();
   }, 1000);

  });

 }

 private void setImage(int n, ImageView i) {
  switch (n) {
   case 1:
    i.setImageResource(R.drawable.one);
    break;
   case 2:
    i.setImageResource(R.drawable.two);
    break;
   case 3:
    i.setImageResource(R.drawable.three);
    break;
   case 4:
    i.setImageResource(R.drawable.four);
    break;
   case 5:
    i.setImageResource(R.drawable.five);
    break;
   case 6:
    i.setImageResource(R.drawable.six);
    break;

  }
 }

 private void show(ArrayList<Integer> n, int tar, ArrayList<Integer> part) {
  int s = 0;
  for (int x : part) {
   s += x;
  }
  if (s == tar) {
   for (int num : part) {
    if (!combinations.contains(num)) {
     combinations.add(num);
    }
   }
  }
  if (s >= tar) {
   return;
  }
  for (int i = 0; i < n.size(); i++) {
   ArrayList<Integer> rem = new ArrayList<>();
   int k = n.get(i);
   for (int j = i + 1; j < n.size(); j++) {
    rem.add(n.get(j));
   }
   ArrayList<Integer> partr = new ArrayList<>(part);
   partr.add(k);
   show(rem, tar, partr);
  }
 }

 private void shown(ArrayList<Integer> n, int tar) {
  combinations.clear();
  show(n, tar, new ArrayList<>());
 }

 private void cal(int n, List<ImageView> i) {
  ArrayList<Integer> num = new ArrayList<>();
  for (ImageView im : i) {
   if (im.getVisibility() == View.VISIBLE) {
    num.add(Integer.parseInt(im.getTag().toString()));
   }
  }
  shown(num, n);
  for (int nums : combinations) {
   i.get(nums - 1).setEnabled(true);
   i.get(nums-1).setColorFilter(null);
  }

 }
 //final MediaPlayer m=MediaPlayer.create(this,R.raw.win);
 private void checkp1(){
  boolean pt=true;
  for(ImageView i:ip1)
  {
   if(i.isEnabled())
   {
    pt=false;
   }
  }
  if(pt)
  {
   point1.setText(""+pnt1);
   status.setText("Player 2 Roll the Dice");
   p2r2.setEnabled(true);
   p2r2.getBackground().setColorFilter(null);

  }
  boolean checkwin=true;
  for(ImageView i:ip1)
  {
    if(i.getVisibility()==View.VISIBLE)
    {
     checkwin=false;
    }
  }
  if(checkwin)
  {
   status.setText("Player 1 Wins");
   //m.start();
   final MediaPlayer m4=MediaPlayer.create(this,R.raw.win);
   m4.start();
   Intent switchActivityIntent = new Intent(this, win1.class);


   startActivity(switchActivityIntent);
   finish();

  }
 }
 private void checkp2()
 {
  boolean pt=true;
  for(ImageView i:ip2)
  {
   if(i.isEnabled())
   {
    pt=false;
   }
  }
  if(pt)
  {
   point2.setText(""+pnt2);
   if(pnt1<pnt2)
   {
    status.setText("Player 1 Wins");

  //  m.start();
    final MediaPlayer m3=MediaPlayer.create(this,R.raw.win);
    m3.start();
    Intent switchActivityIntent = new Intent(this, win1.class);



    startActivity(switchActivityIntent);
    finish();
   }
  else if(pnt1>pnt2)
   {
    status.setText("Player 2 Wins");
   // m.start();
    final MediaPlayer m2=MediaPlayer.create(this,R.raw.win);
    m2.start();
    Intent switchActivityIntent = new Intent(this, win2.class);


    startActivity(switchActivityIntent);
    finish();
   }
  else
   {
    status.setText("Draw");
   }


  }
  boolean checkwin=true;
  for(ImageView i:ip2)
  {
   if(i.getVisibility()==View.VISIBLE)
   {
    checkwin=false;
   }
  }
  if(checkwin)
  {
   status.setText("Player 2 Wins");
   final MediaPlayer m1=MediaPlayer.create(this,R.raw.win);
   m1.start();
   Intent switchActivityIntent = new Intent(this, win2.class);


   startActivity(switchActivityIntent);
   finish();
  }
 }
}




