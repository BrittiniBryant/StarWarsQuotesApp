package com.example.quotes;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.support.annotation.RequiresApi;

public class MainActivity extends AppCompatActivity {
    private ImageButton quoteButton; //Created a private button and named it quoteButton
    private TextView quoteTextView; //Created a private textview and named it quoteTextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteText);
        quoteButton = findViewById(R.id.showQuoteButton);
        quoteButton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view) {
                QuoteServer quoteServer = new QuoteServer();
                quoteTextView.setText(quoteServer.getRandomQuote());
                System.out.println("Hello"); //Whatever is here is what you will see on the console
        }
    });
}}
