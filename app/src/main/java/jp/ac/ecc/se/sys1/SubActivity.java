package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_sub);
         setContentView(R.layout.activity_const);
        // setContentView(R.layout.activity_const2);

        findViewById(R.id.sendButton).setOnClickListener(this::onClick);
        findViewById(R.id.clearButton).setOnClickListener(this::onClick);
        findViewById(R.id.confirmButton).setOnClickListener(this::onClick);

        TextView namelabel = findViewById(R.id.nameLabel);
        namelabel.setText("Name");

        EditText nameText = findViewById(R.id.nameText);

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameText.setText("");
            }
        });

        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTitle("Button Clicked");
            }
        });
        sendButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                finish();
                return true;
            }
        });
        setTitle("Sub Activity");
    }

    public void onClick(View v){
        if (v.getId() == R.id.sendButton){
           Toast.makeText(this,"送信しました",Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.clearButton){
            Toast.makeText(this,"クリアしました",Toast.LENGTH_SHORT).show();
        }
        else if (v.getId() == R.id.confirmButton){
            Toast.makeText(this,"確認します",Toast.LENGTH_SHORT).show();
        }
    }
}