package com.app.statusbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends DisableStatusBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        disableTouchesToStatuseBar();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click_me).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Touch detected!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
