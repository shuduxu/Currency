package com.xy.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private EditText editInput;     //定义文本框
    private Button btnR2D;
    private Button btnR2E;
    private Button btnR2W;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = (TextView) findViewById(R.id.tv_result);
        editInput = (EditText) findViewById(R.id.value_hint);
        btnR2D = (Button) findViewById(R.id.RMB_to_DOLLAR);
        btnR2E = (Button) findViewById(R.id.RMB_to_EURO);
        btnR2W = (Button) findViewById(R.id.RMB_to_WON);

        btnR2D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inputValue = Float.parseFloat(editInput.getText().toString());
                tvResult.setText(String.valueOf(getR2D(inputValue)));
            }

            private float getR2D(float c) {
                return c * 0.147f;
            }
        });

        btnR2E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float inputValue = Float.parseFloat(editInput.getText().toString());
                tvResult.setText(String.valueOf(getR2E(inputValue)));
            }

            private float getR2E(float c) {
                return c * 0.125f;
            }
        });
                btnR2W.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        float inputValue = Float.parseFloat(editInput.getText().toString());
                        tvResult.setText(String.valueOf(getR2W(inputValue)));
                    }

                    private float getR2W(float c) {
                        return c * 171.0712f;
                    }
                });

    }
}

