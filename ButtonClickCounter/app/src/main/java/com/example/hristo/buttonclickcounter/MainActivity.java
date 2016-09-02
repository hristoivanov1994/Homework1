package com.example.hristo.buttonclickcounter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;

public class MainActivity extends Activity {
    int button1Count=0;
    int button2Count=0;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = (Button) findViewById(R.id.button2);
        button1= (Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                button2Count++;
                button2.setText(String.valueOf(button2Count));
            }
        });

    }

    public void onClickButton(View view) {
        if(view.getId()==R.id.button)
        {
            button1Count++;
            button1.setText(String.valueOf(button1Count));


        }
    }
}
