package sg.edu.rp.c346.id21040247.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView module;
    TextView moduleInfo;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        module = findViewById(R.id.moduleTextView);
        moduleInfo = findViewById(R.id.moduleInfoTextView);
        back = findViewById(R.id.backButton);

        Intent intentReceived = getIntent();
        String moduleTitle = intentReceived.getStringExtra("module");
        String moduleDetails = intentReceived.getStringExtra("module info");
        module.setText(moduleTitle);
        moduleInfo.setText(moduleDetails);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}