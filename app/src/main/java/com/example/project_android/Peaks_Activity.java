package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Peaks_Activity extends AppCompatActivity {

    private TextView tvName,tvMount_reg,tvdescription;
    private ImageView img1,img2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peaks_);

        tvName=(TextView) findViewById(R.id.peak_name);
        tvMount_reg=(TextView) findViewById(R.id.mountain_reg);
        tvdescription=(TextView) findViewById(R.id.desc);
        img1=(ImageView) findViewById(R.id.peak_thumbnail);
        img2=(ImageView) findViewById(R.id.peak_thumbnail2);
        button=(Button) findViewById(R.id.buttonce);

        Intent intent = getIntent();
        String Name = intent.getExtras().getString("Name");
        String Mountain_region = intent.getExtras().getString("Mountain_region");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");
        int image2 = intent.getExtras().getInt("Thumbnail2");


        tvName.setText(Name);
        tvMount_reg.setText(Mountain_region);
        tvdescription.setText(Description);
        img1.setImageResource(image);
        img2.setImageResource(image2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            };
            }
        );
    }
    public void openActivity(){
        Intent intent = new Intent(this,Comment_Activity.class);
        startActivity(intent);
    }
}