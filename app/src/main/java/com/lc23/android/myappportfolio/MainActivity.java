package com.lc23.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButton(R.id.button_popular_movies, getString(R.string.msg_popular_movies));
        setupButton(R.id.button_stock_hawk, getString(R.string.msg_stock_hawk));
        setupButton(R.id.button_build_it_bigger, getString(R.string.msg_build_it_bigger));
        setupButton(R.id.button_make_your_app_material, getString(R.string.msg_make_your_app_material));
        setupButton(R.id.button_go_ubiquitous, getString(R.string.msg_go_ubiquitous));
        setupButton(R.id.button_capstone, getString(R.string.msg_capstone));
    }

    void setupButton(final int buttonId, final String msg) {
        Button button = (Button) findViewById(buttonId);
        if (button != null)
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
                }
            });
    }
}
