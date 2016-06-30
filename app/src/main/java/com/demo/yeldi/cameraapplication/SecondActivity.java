package com.demo.yeldi.cameraapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by pudumai on 6/28/2016.
 */
public class SecondActivity extends AppCompatActivity {
   SharedPreferences sp;
    String imagepath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_actvity_main);
        ImageView imgGet = (ImageView)findViewById(R.id.img_id);
        sp = getSharedPreferences(Global_values.sPref_value, 0);
        imagepath = sp.getString("profileimage_path", null);
        Bitmap bm = BitmapFactory.decodeFile(imagepath);
        imgGet.setImageBitmap(bm);
       /* Intent intent = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);*/

    }
}
