package com.example.lab1;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textNF;
    private TextView textGroup;
    private ImageView imageView2;
    private Button buttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNF = textNF.findViewById(R.id.textNF);
        textGroup = findViewById(R.id.textGroup);
        imageView2 = findViewById(R.id.imageView2);

    }


    public void btn1Click(View view) {
        if (textNF.getVisibility()==View.INVISIBLE){
            textNF.setVisibility(View.VISIBLE);
            textGroup.setVisibility(View.VISIBLE);
        }
        else{
            textNF.setVisibility(View.INVISIBLE);
            textGroup.setVisibility(View.INVISIBLE);
        }

    }

    public void clickIMG(View view) {
        if (imageView2.getVisibility()==View.INVISIBLE){
            imageView2.setVisibility(View.VISIBLE);
        }
        else{
            imageView2.setVisibility(View.INVISIBLE);
        }
    }
}