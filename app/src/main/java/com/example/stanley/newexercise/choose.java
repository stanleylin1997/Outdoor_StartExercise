package com.example.stanley.newexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class choose extends AppCompatActivity {
    private ImageButton ButtonBad;
    private ImageButton ButtonBase;
    private ImageButton ButtonBasket;
    private ImageButton ButtonJog;
    private ImageButton ButtonTennis;
    private ImageButton ButtonVolley;
    private ImageButton ButtonPing;
    private ImageButton ButtonGym;
    private ImageButton ButtonOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picksport);

        ButtonBad = (ImageButton)findViewById(R.id.ButtonBad);
        ButtonBad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","羽毛球");
                startActivity(intent);

            }
        });

        ButtonBase = (ImageButton)findViewById(R.id.ButtonBase);
        ButtonBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","棒球");
                startActivity(intent);

            }
        });

        ButtonBasket = (ImageButton)findViewById(R.id.ButtonBasket);
        ButtonBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","籃球");
                startActivity(intent);

            }
        });

        ButtonJog = (ImageButton)findViewById(R.id.ButtonJog);
        ButtonJog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","慢跑");
                startActivity(intent);

            }
        });

        ButtonTennis = (ImageButton)findViewById(R.id.ButtonTennis);
        ButtonTennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","網球");
                startActivity(intent);

            }
        });
        ButtonVolley = (ImageButton)findViewById(R.id.ButtonVolley);
        ButtonVolley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","排球");
                startActivity(intent);

            }
        });
        ButtonPing = (ImageButton)findViewById(R.id.ButtonPing);
        ButtonPing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","桌球");
                startActivity(intent);

            }
        });

        ButtonGym = (ImageButton)findViewById(R.id.ButtonExer);
        ButtonGym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(choose.this, MapsActivity.class);
                intent.putExtra("type","健身");
                startActivity(intent);

            }
        });

       ButtonOther = (ImageButton)findViewById(R.id.ButtonOther);
       ButtonOther.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent();
               intent.setClass(choose.this, MapsActivity.class);
               intent.putExtra("type","其他運動");
               startActivity(intent);

           }
       });




    }
}
