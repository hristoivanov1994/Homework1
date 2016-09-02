package com.example.hristo.textbuttonandview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Hristo on 3.9.2016 г..
 */
public class ButtonInfoActivity extends Activity {
    TextView informationText;
    ButtonPropperties buttonInfo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_info);
        informationText=(TextView)findViewById(R.id.textView2);

        if(getIntent()!=null && informationText!=null) {
            buttonInfo = (ButtonPropperties) getIntent().getParcelableExtra("BUTTON_PROP");
            informationText.setText(String.valueOf("Button Id: " + buttonInfo.getButtonId() + "\nButton Text: " + buttonInfo.getButtonText()));
        }

    }
}
