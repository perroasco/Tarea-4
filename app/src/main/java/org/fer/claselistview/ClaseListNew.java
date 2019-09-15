package org.fer.claselistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ClaseListNew extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase_list_new);
        listView = findViewById(R.id.listView);
        final ClaseAdapter adapter = new ClaseAdapter(ListDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        adapter.getItem(position).getTitle(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}

