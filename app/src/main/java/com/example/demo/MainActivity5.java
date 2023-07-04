package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        //b6 = (Button) findViewById(R.id.button6);
        //b7 = (Button) findViewById(R.id.button7);
        //b8 = (Button) findViewById(R.id.button8);
        //b9 = (Button) findViewById(R.id.button9);
        //b10 = (Button) findViewById(R.id.button10);


        float result1[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.004488, 76.970147, result1);
        String res1= Float.toString(result1[0]/1000);
        b1.setText("Distance="+res1+"KM");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","XXX8+695, Goods Shed Rd, Gopalapuram, Coimbatore, Tamil Nadu 641001");
                bundle.putString("workhrs","24/7");
                bundle.putString("status","open");
                bundle.putString("location","pay and use toilet, Goods Shed Rd");

                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        float result2[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 10.997768, 76.962161, result2);
        String res2= Float.toString(result2[0]/1000);
        b2.setText("Distance="+res2+"KM");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","XXX6+29Q, Variety Hall Rd, Town Hall, Coimbatore, Tamil Nadu 641001");
                bundle.putString("workhrs","24/7");
                bundle.putString("status","open");
                bundle.putString("location","Coimbatore Corporation Toilet");

                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        float result3[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.015336, 76.984476, result3);
        String res3= Float.toString(result3[0]/1000);
        b3.setText("Distance="+res3+"KM");
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","2X7J+PV4, New Scheme Rd, Pappanaickenpalayam, Tamil Nadu 641037");
                bundle.putString("workhrs","24/7");
                bundle.putString("status","open");
                bundle.putString("location","Public Toilets,Coimbatore");

                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        float result4[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.008305, 76.972918, result4);
        String res4= Float.toString(result4[0]/1000);
        b4.setText("Distance="+res4+"KM");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","Coimbatore City Municipal Corporation, Big Bazaar St, Shanmuga Nagar, Selvapuram North, Coimbatore, Tamil Nadu 641001");
                bundle.putString("workhrs","24/7");
                bundle.putString("status","open");
                bundle.putString("location","sbm toilet, shanmuga nagar, coimbatore");

                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


        float result5[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.011944, 76.943336, result5);
        String res5= Float.toString(result5[0]/1000);
        b5.setText("Distance="+res5+"KM");
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","Corporation Municipal Colony, Town Hall, Coimbatore, Tamil Nadu 641001");
                bundle.putString("workhrs","24/7");
                bundle.putString("status","open");
                bundle.putString("location","sbm toilet, town hall, coimbatore");

                Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}