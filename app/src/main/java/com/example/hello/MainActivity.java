package com.example.hello;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast= Toast.makeText(getApplicationContext(),"Hallo there! ", Toast.LENGTH_SHORT);
        toast.setMargin(100, 100);
        toast.show();


    }
    public void clickTheButton(View view){
        Spinner spinn = findViewById(R.id.spinner);
        TextView vi = findViewById(R.id.textView);
        String item = spinn.getSelectedItem().toString();
        if (item.equalsIgnoreCase("first name")){
            vi.setText(item+ ": Aman mohammed");
            vi.setTextColor(Color.BLUE);
        }
        else if (item.equalsIgnoreCase("last name")){
            Toast.makeText(getApplicationContext(), "the text color chnges: ",
                    Toast.LENGTH_SHORT).show();
            vi.setText(item + ": Mohammed");
            vi.setTextColor(Color.RED);
        }
        else if (item.equalsIgnoreCase("city")){
            vi.setText(item + ": Bollnäs");
        }
        else{
            vi.setText(item + ": Hedhamregatan 9b");
        }


    }
}