package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] curryList = {"ドライカレー","カツカレー","チーズカレー","スープカレー"};

        ListView listView = findViewById(R.id.curryList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,curryList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView tv = (TextView) view;
                Intent intent = new Intent(getApplicationContext(),PreferencesActivity.class);
                intent.putExtra("name",tv.getText() );
                startActivity(intent);
                //Toast.makeText(getApplicationContext(),tv.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}