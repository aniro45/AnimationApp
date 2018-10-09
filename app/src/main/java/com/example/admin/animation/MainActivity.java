package com.example.admin.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void FadeClicked(View view) {

        ImageView cat1 = (ImageView) findViewById(R.id.cat1);
        ImageView cat2 = (ImageView) findViewById(R.id.cat2);

        // cat1.animate().alpha(0f).setDuration(2000);    //
        // cat2.animate().alpha(1f).setDuration(2000);   //


       // cat1.animate().translationXBy(1000f).setDuration(2000);    //Can be used reverse if set first in oncreate method

        //  cat1.animate().rotation(1080).setDuration(5000);     //To roatate the image

      //  cat1.animate().scaleX(0.6f).scaleY(0.5f).setDuration(2000);

           cat1.animate()
                   .translationXBy(1000f)
                   .translationYBy(1000f)
                   .rotation(3600)
                   .setDuration(2500)
                   .scaleX(0.5f)
                   .scaleY(0.6f);         //TO many in one line also used break line

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {   //run this block before on click
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView cat1 = (ImageView) findViewById(R.id.cat1);

          cat1.setTranslationX(-1000f);      //
          cat1.setTranslationY(-1000f);     //

       // cat1.setTranslationX(-1000f);

    }
}
