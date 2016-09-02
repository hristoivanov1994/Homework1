package com.example.hristo.textbuttonandview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ButtonPropperties selectedButton;
    int buttonCount;
    int buttonCount2;
    int buttonCount3;
    Button button1;
    Button button2;
    Button button3;
    TextView information;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCount=0;
        buttonCount2=0;
        buttonCount3=0;

        button1 = (Button)findViewById(R.id.buttonid);
        button2 = (Button)findViewById(R.id.button2id);
        button3 = (Button)findViewById(R.id.button3id);
        information=(TextView)findViewById(R.id.textView);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        information.setOnClickListener(this);
        selectedButton = new ButtonPropperties();

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.textView)
        {
            Intent intent = new Intent(MainActivity.this,ButtonInfoActivity.class);
            intent.putExtra("BUTTON_PROP",selectedButton);
            startActivity(intent);
        }
        if(view.getId()==R.id.buttonid) {
            buttonCount++;

            TextButtonView(view,buttonCount,button1);

        }
        else if(view.getId()==R.id.button2id)
        {
            buttonCount2++;
            TextButtonView(view,buttonCount2,button2);

        }
        else if(view.getId()==R.id.button3id)
        {
            buttonCount3++;
            TextButtonView(view,buttonCount3,button3);

        }
    }
    //Setting the text of the textView
   private void TextButtonView(View view, int count,Button button)
    {
        selectedButton.setButtonId(String.valueOf(getResources().getResourceEntryName(button.getId())));
        selectedButton.setButtonText(String.valueOf(button.getText()));
        if (count < 2)
            information.setText(String.valueOf(getResources().getResourceEntryName(button.getId())));
        else
            information.setText(String.valueOf(button.getText()));
    }
}
