package jp.ac.ecc.se.sys1;


import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EventActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        EditText nameText = findViewById(R.id.nameText);
        Button clearButton = findViewById(R.id.clearButton);
        Button clearButton2 = findViewById(R.id.clearButton2);
        Button confirmButton = findViewById(R.id.end);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), nameText.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameText.setText("");
            }
        });
        clearButton2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                EditText passText = findViewById(R.id.PassText);
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        setTitle(passText.getText());
                        break;
                    case MotionEvent.ACTION_UP:
                        passText.setText("");
                        setTitle(R.string.app_name);
                        break;
                }
                return false;
            }
        });
        confirmButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                finish();
                return true;
            }
        });
    }

    public void onClick(View view) {
        EditText nameText = findViewById(R.id.nameText);
        switch (view.getId()){
            case R.id.clearButton:

                break;
            case R.id.clearButton2:
                EditText passText = findViewById(R.id.PassText);
                passText.setText("");
                break;
            case R.id.end:
                Toast.makeText(this, nameText.getText(), Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}