package com.example.geeksforgeeksinsertdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void insertdata(View view)
    {
        String textinput=((EditText)findViewById(R.id.text1)).getText().toString().trim();
        DatabaseReference reference=FirebaseDatabase.getInstance().getReference();
        reference.child("GfGUserData").setValue(textinput);
        Toast toast=Toast.makeText(getApplicationContext(),"Inserted "+textinput+
                " to the database!!", Toast.LENGTH_SHORT);
        toast.show();
    }
}
