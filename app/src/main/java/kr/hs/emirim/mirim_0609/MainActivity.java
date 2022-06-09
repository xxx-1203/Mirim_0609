package kr.hs.emirim.mirim_0609;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"CSI-Newyork", "CSI-Lasvegas", "CSI-Miami", "Friends", "Lodt", "Lost-Island"};
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, items);
        AutoCompleteTextView auto = findViewById(R.id.auto);
        auto.setAdapter(adapter);

        MultiAutoCompleteTextView multi = findViewById(R.id.multi);
        MultiAutoCompleteTextView.CommaTokenizer comma = new MultiAutoCompleteTextView.CommaTokenizer();
        multi.setTokenizer(comma);
        auto.setAdapter(adapter);
    }
}