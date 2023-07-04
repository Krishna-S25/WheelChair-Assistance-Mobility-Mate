package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView) findViewById(R.id.textView);
        tv2=(TextView) findViewById(R.id.textView2);
        tv3=(TextView) findViewById(R.id.textView3);
        tv4=(TextView) findViewById(R.id.textView4);
        tv5=(TextView) findViewById(R.id.textView5);
        tv6=(TextView) findViewById(R.id.textView6);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
//      b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b10=(Button) findViewById(R.id.button10);
        double d_lat=11.0247;
        double d_lon=77.0106;
        double s_lat=11.0654;
        double s_lon=77.0928;

        float result1[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.032866, 76.980727, result1);
        String res1= Float.toString(result1[0]/1000);
        b1.setText("Distance="+res1+"KM");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","162a, 4th St, Kottaram, EB Colony, VG Rao Nagar, Ganapathy, Coimbatore, Tamil Nadu 641006");
                bundle.putString("workhrs","9:30 am–8 pm");
                bundle.putString("status","open");
                bundle.putString("location","Bony's Chairs - Office Chair Repairing");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result2[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.000658, 77.029831, result2);
        String res2= Float.toString(result2[0]/1000);
        b2.setText("Distance= "+res2+" KM");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","Landmark Near Andal Kalayana Mandavam ( Opp to Suryabala Car Service, 1978, Trichy Rd, Singanallur, Tamil Nadu 641005");
                bundle.putString("workhrs","10 am–8:30 pm");
                bundle.putString("status","Open");
                bundle.putString("location","EC GEAR WHEELCHAIR & SURGICAL");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result3[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, d_lat, d_lon, result3);
        String res3= Float.toString(result3[0]/1000);
        b3.setText("Distance= "+res3+" KM");
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","16,Sri Hari Agencies,Nehru St,Gandhi Nagar,Edyarpalayam,Coimbatore");
                bundle.putString("workhrs","8.30 to 6.30");
                bundle.putString("status","okay");
                bundle.putString("location","Sri Hariagencies");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result4[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.025638, 76.961969, result4);
        String res4= Float.toString(result4[0]/1000);
        b4.setText("Distance= "+res4+" KM");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","Veluchamy street, Rathinapuri, Coimbatore, Tamil Nadu 641027");
                bundle.putString("workhrs","10 am–7 pm");
                bundle.putString("status","okay");
                bundle.putString("location","Comfort chairs");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result5[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.006911, 76.963942, result5);
        String res5= Float.toString(result5[0]/1000);
        b5.setText("Distance= "+res5+" KM");
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","276-A, Patel Rd, Ram Nagar, Coimbatore, Tamil Nadu 641009");
                bundle.putString("workhrs","9 am–7 pm");
                bundle.putString("status","okay");
                bundle.putString("location","Bharath Industries");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result6[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.029667, 77.03355, result6);
        String res6= Float.toString(result6[0]/1000);
        b6.setText("Distance= "+res6+" KM");
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","22PQ+MFQ, Street Number 3, TNHB Colony, Madhusudhan Layout, Civil Aerodrome Post, Nehru Nagar West, Coimbatore, Tamil Nadu 641014");
                bundle.putString("workhrs","10 am–7 pm");
                bundle.putString("status","okay");
                bundle.putString("location","Vee Care & Services");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result8[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.013661, 77.063129, result8);
        String res8= Float.toString(result8[0]/1000);
        b8.setText("Distance= "+res8+" KM");
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","15/15b,arul Murugan Nagar, oddarpalayam, ondipudur, po, Coimbatore, Tamil Nadu 641103");
                bundle.putString("workhrs","8.30 to 6.30");
                bundle.putString("status","Open");
                bundle.putString("location","Brothers chair service");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result9[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.044811, 76.943549, result9);
        String res9= Float.toString(result9[0]/1000);
        b9.setText("Distance= "+res9+" KM");
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operation");
                bundle.putString("address","26 samundeshwari, 26, 3rd Cross Rd, samundeshwari nagar, Koundampalayam, Coimbatore, Tamil Nadu 641030");
                bundle.putString("workhrs","9 am–5 pm");
                bundle.putString("status","Open");
                bundle.putString("location","MED AIDE SOLUTIONS");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result10[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.031626, 76.91013, result10);
        String res10= Float.toString(result1[0]/1000);
        b10.setText("Distance= "+res10+" KM");
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","Kalappa Naicken Palayam, Vadavalli, Tamil Nadu 641041");
                bundle.putString("workhrs","\t\n" +
                        "Open 24 hours");
                bundle.putString("status","Open");
                bundle.putString("location","Veenus Furniture for Service");

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}