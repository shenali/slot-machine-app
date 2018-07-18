package com.example.shenalisamaranayake.myapplication;

import android.content.res.TypedArray;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button spinBtn;
    ImageView iv1,iv2,iv3;
    private List<Integer> myImages;
    private static Image[] array=new Image[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinBtn=(Button)findViewById(R.id.spinBtn);
        iv1=(ImageView)findViewById(R.id.img1);
        iv2=(ImageView)findViewById(R.id.img2);
        iv3=(ImageView)findViewById(R.id.img3);
        final int[] images = {R.drawable.bell,R.drawable.watermelon,R.drawable.lemon,R.drawable.plum};
        spinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Random rand = new Random(System.currentTimeMillis());
                List<Integer> generated = new ArrayList<Integer>();
                for (int i = 0; i < images.length; i++) {

                    int v = images[i];
                    int randImage = rand.nextInt(4) + 0;
                    if ( !generated.contains( randImage ) ) {
                        generated.add( randImage );
                          Log.e("ll", "randomImage:  " + randImage);
                          int cImage = images[randImage];

                          Log.e("asd", "cImage:  " + cImage);

                          iv1.setImageResource(cImage);

                }else{
                        i--;
                    }
                }
        }
        });

        }

        }
