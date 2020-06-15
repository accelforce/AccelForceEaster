package net.accelf.eastertest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import net.accelf.easter.AccelForceEasterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AccelForceEasterView) findViewById(R.id.accelForceEasterView)).setOnEasterEggExecuteListener(this::onEasterEggExecute);
    }

    private void onEasterEggExecute(View view) {
        Toast.makeText(view.getContext(), "Message from MainActivity!", Toast.LENGTH_SHORT).show();
    }
}
