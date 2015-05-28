package org.odk.collect.android.activities;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.odk.collect.android.R;

/**
 * Created by johannfjs on 06/05/15.
 */
public class FailActivity extends Activity {
    Button btnOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);
        btnOpen = (Button) findViewById(R.id.btnOpen);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intents = new Intent(Intent.ACTION_MAIN);
                intents.setComponent(new ComponentName("com.johannfjs.demoodk","com.johannfjs.demoodk.MainActivity"));
                startActivity(intents);
            }
        });
    }
}
