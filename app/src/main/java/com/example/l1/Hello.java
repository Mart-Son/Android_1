package com.example.l1;
import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.View;
import java.util.Random;

public class Hello extends Activity {
    private int counter = 0;
    private int counter2 = 0;
    final Random rndm = new Random();

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_hi_layout);

        TextView textView2 = findViewById(R.id.textView2);
        TextView timeView = findViewById(R.id.time);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("Правая кнопка нажата  " + counter + " раз, а левая - " + ++counter2 + " раз");
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("Правая кнопка нажата  " + ++counter + " раз, а левая - " + counter2 + " раз");
            }
        });

        button2.setOnTouchListener(new View.OnTouchListener() {


            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    button2.setBackgroundColor(rndm.nextInt());
                }
                return false;
            }

        });
    }
}
