package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_change_language;
    private TextView text_view_language;
    private EditText edit_text_country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_change_language=this.findViewById(R.id.button_change_language);
        text_view_language=this.findViewById(R.id.text_view_language);
        edit_text_country= (EditText)this.findViewById(R.id.edit_text_country);
        button_change_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String str=edit_text_country.getText().toString();
                    if(str.equals("en"))
                    {
                        button_change_language.setText(R.string.change_language_en);
                        text_view_language.setText(R.string.language_en);
                    }
                    else if(str.equals("cn"))
                    {
                        button_change_language.setText(R.string.change_language_cn);
                        text_view_language.setText(R.string.language_cn);
                    }
                    else if(str.equals("jp"))
                    {
                        button_change_language.setText(R.string.change_language_jp);
                        text_view_language.setText(R.string.language_jp);
                    }
                    else if(str.equals("kr"))
                    {
                        button_change_language.setText(R.string.change_language_kr);
                        text_view_language.setText(R.string.language_kr);
                    }
            }
        });



    }
}
