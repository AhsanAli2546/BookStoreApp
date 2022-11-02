package com.example.midfrag_recyc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddNewBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_book);

        EditText title,desc;
        Button button;

        title = findViewById(R.id.txtTitle);
        desc = findViewById(R.id.txtDesc);
        button = findViewById(R.id.btnAddBook);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Model book = new Model(title.getText().toString(),desc.getText().toString(),R.drawable.book);

                MainActivity.list.add(book);

                //Add toast below

                //Toast.makeText(this, "Book added successfully",Toast.LENGTH_LONG).show();
                String message = "Book added successfully";
                Toast toast;
                toast = Toast.makeText(AddNewBook.this,message,Toast.LENGTH_LONG);
                toast.show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        startActivity(new Intent(getApplicationContext(),BookList.class));
                        finish();
                    }
                },3000);
                //Add toast above
            }
        });


    }
}