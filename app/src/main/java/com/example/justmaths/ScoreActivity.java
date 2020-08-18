package com.example.justmaths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreActivity extends AppCompatActivity {

    ImageView btnMathShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView tv = (TextView) findViewById(R.id.score);
        final int score = getIntent().getIntExtra("score", 0);
        tv.setText("Current Score : " + score);
        btnMathShare=findViewById(R.id.btnMathShare);
        btnMathShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"My Score : " + score);
                startActivity(intent);
            }
        });
    }
}
