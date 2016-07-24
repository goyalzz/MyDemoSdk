package demolibrary.labs.it.pronto.mydemoliberary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import demolibrary.labs.it.pronto.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> data = MyLibrary.getInstance(this).getSavedData();

        List<String> dataSet = new ArrayList<>();
        for (HashMap<String, String> dataValue: data) {
            for (String key : dataValue.keySet()) {
                dataSet.add(key + " : " + dataValue.get(key));
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.list_item, dataSet);
        ((ListView) findViewById(R.id.listview)).setAdapter(adapter);

    }
}
