package com.limerobotsoftware.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup button click listeners
        findViewById(R.id.button1).setOnClickListener(new ToastMessageOnClickListener(R.string.button_1_message));
        findViewById(R.id.button2).setOnClickListener(new ToastMessageOnClickListener(R.string.button_2_message));
        findViewById(R.id.button3).setOnClickListener(new ToastMessageOnClickListener(R.string.button_3_message));
        findViewById(R.id.button4).setOnClickListener(new ToastMessageOnClickListener(R.string.button_4_message));
        findViewById(R.id.button5).setOnClickListener(new ToastMessageOnClickListener(R.string.button_5_message));
        findViewById(R.id.button6).setOnClickListener(new ToastMessageOnClickListener(R.string.button_6_message));
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

    static class ToastMessageOnClickListener implements View.OnClickListener {
        private final int resId;

        public ToastMessageOnClickListener(int resId) {
            this.resId = resId;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), resId, Toast.LENGTH_SHORT).show();
        }
    }
}
