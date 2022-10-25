package jp.ac.ecc.se.sys1;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class List2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);


        ListView listView = (ListView) findViewById(R.id.List);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        EditText dataText = findViewById(R.id.dataText);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dataText.getText().toString().equals("")){
                }else {
                    adapter.add(String.valueOf(dataText.getText()));
                    dataText.setText("");
                }
            }
        });
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String st = (String) adapterView.getItemAtPosition(i);
                if (i % 2 == 0){
                    Intent intent = new Intent(getApplicationContext(),EventActivity.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getApplicationContext(),SubActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}