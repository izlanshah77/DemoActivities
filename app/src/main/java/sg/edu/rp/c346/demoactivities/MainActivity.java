package sg.edu.rp.c346.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnDone);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText etName = findViewById(R.id.etName);
                EditText etAge = findViewById(R.id.etAge);
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("info", info);
                startActivity(intent);
            }
        });
    }
}
