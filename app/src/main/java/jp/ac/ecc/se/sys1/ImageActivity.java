package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.backup.FullBackupDataOutput;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView fullView = findViewById(R.id.fullView);

        Intent i = getIntent();
        Uri imageUri = (i != null)?i.getParcelableExtra("data"):null;
        fullView.setImageURI(imageUri);
    }
}