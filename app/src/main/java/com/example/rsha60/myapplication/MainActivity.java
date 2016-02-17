package com.example.rsha60.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText numbers =  (EditText) findViewById(R.id.editText);
        final TextView results = (TextView) findViewById(R.id.resultView);

        Button btnConvert = (Button) findViewById(R.id.button);
        btnConvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                String numberz =numbers.getText().toString();
                try {
                    final long number = Long.parseLong(numberz);
                    String returnz = ConvertNumbers.convert(number);

                    results.setText(returnz);

                } catch ( NumberFormatException e) {
                    //Toast.makeToast("illegal number or empty number" , toast.long)
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
