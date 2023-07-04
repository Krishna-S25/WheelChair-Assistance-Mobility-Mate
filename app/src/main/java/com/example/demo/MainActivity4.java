package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    Button b1, b2,b3,b4,b5,b6,b7,b8,b9,b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button8);
        b8 = (Button) findViewById(R.id.button9);
        b9 = (Button) findViewById(R.id.button10);

        float result1[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.0592,77.0894, result1);
        String res1= Float.toString(result1[0]/1000);
        b1.setText("Distance="+res1+"KM");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","Royal Care Hospital, Coimbatore Bypass, Sulur, Coimbatore District, Tamil Nadu,641062");
                bundle.putString("workhrs","9:30 am–8 pm");
                bundle.putString("status","open");
                bundle.putString("location","Royal Care Hospital, Coimbatore");
                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result2[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.291387, 76.940760, result2);
        String res2= Float.toString(result2[0]/1000);
        b2.setText("Distance=13 KM");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","No 474, Avinashi Rd, Periyar Nagar, Sowri Palayam, Tamil Nadu 641004");
                bundle.putString("workhrs","10 am–8:30 pm");
                bundle.putString("status","Open");
                bundle.putString("location","Sri Badmavathi clinic, coimbatore");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result3[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928,11.003650,77.065280, result3);
        String res3= Float.toString(result3[0]/1000);
        b3.setText("Distance="+res3+"KM");
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","RV HOSPITAL : 1/289, Ramasamy Gounder St, Chinniyampalayam, Coimbatore, Tamil Nadu 641062");
                bundle.putString("workhrs","8.30 to 6.30");
                bundle.putString("status","okay");
                bundle.putString("location","RV hospital, Chinniyampalayam");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result4[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.013200 , 77.086098, result4);
        String res4= Float.toString(result4[0]/1000);
        b4.setText("Distance= "+res4+" KM");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","242b, Trichy Rd, near KMCH, Mathiyalagan Nagar, PKT Nagar, Sulur, TamilNadu641402");
                bundle.putString("workhrs","10 am–7 pm");
                bundle.putString("status","okay");
                bundle.putString("location","kmch sulur");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result5[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.032470, 77.037990, result5);
        String res5= Float.toString(result5[0]/1000);
        b5.setText("Distance= "+res5+" KM");
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","99, Avinashi Road, Peelamedu - Pudur Main Rd, Civil Aerodrome Post, Coimbatore, Tamil Nadu 641014");
                bundle.putString("workhrs","9 am–7 pm");
                bundle.putString("status","okay");
                bundle.putString("location","kmch, peelamedu");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result6[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.053810,77.034890, result6);
        String res6= Float.toString(result6[0]/1000);
        b6.setText("Distance= "+res6+" KM");
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","5 B, Kalapatti Main Rd, Nehru Nagar West, Coimbatore, Tamil Nadu 641014");
                bundle.putString("workhrs","10 am–7 pm");
                bundle.putString("status","okay");
                bundle.putString("location","united apoolo , coimbatore");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result8[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.042068, 77.044838, result8);
        String res8= Float.toString(result8[0]/1000);
        b7.setText("Distance= "+res8+" KM");
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","GD Naidu Nagar Behind Hotel Gowtham, near Maruthi True Value, Civil Aerodrome Post, Coimbatore, Tamil Nadu 641014");
                bundle.putString("workhrs","8.30 to 6.30");
                bundle.putString("status","Open");
                bundle.putString("location","natural health");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result9[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.005101, 76.950849, result9);
        String res9= Float.toString(result9[0]/1000);
        b8.setText("Distance= "+res9+" KM");
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operation");
                bundle.putString("address","322Q+XGC, Ramachandra Road, Ramachandra Road, Near Velmurugan Paper Mart, R.S. Puram, Coimbatore, TamilNadu, 641002");
                bundle.putString("workhrs","9 am–5 pm");
                bundle.putString("status","Open");
                bundle.putString("location","sruthi hospital");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        float result10[] = new float[10];
        Location.distanceBetween(11.0654, 77.0928, 11.045487, 77.051274, result10);
        String res10= Float.toString(result1[0]/1000);
        b9.setText("Distance=13.77 KM");
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("businessStatus","Operational");
                bundle.putString("address","12 Ashok Layout, Peelamedu, Civil Aerodrome Post, TamilNadu, 641014");
                bundle.putString("workhrs","\t\n" +
                        "Open 24 hours");
                bundle.putString("status","Open");
                bundle.putString("location","Veenus Furniture for Service");

                Intent intent = new Intent(MainActivity4.this, MainActivity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        
    }
}