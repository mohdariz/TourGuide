package com.example.ariz.projectsample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends Activity {
    private Button but1, but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        but1 = (Button) findViewById(R.id.butFb);
        but2 = (Button) findViewById(R.id.butIn);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mohd.ariz.100"));
                    in.setPackage("com.facebook.katana");
                    startActivity(in);
                }
                catch (Exception e ){
                    Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mohd.ariz.100"));
                    startActivity(in);
                }
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mohd_arizz/"));
                startActivity(in);
            }
        });




    }
}
