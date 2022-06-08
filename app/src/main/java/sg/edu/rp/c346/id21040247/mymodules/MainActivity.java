package sg.edu.rp.c346.id21040247.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView c346Text;
    TextView c203Text;
    TextView c206Text;
    TextView c218Text;
    TextView c235Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346Text = findViewById(R.id.c346TextView);
        c203Text = findViewById(R.id.c203TextView);
        c206Text = findViewById(R.id.c206TextView);
        c218Text = findViewById(R.id.c218TextView);
        c235Text = findViewById(R.id.c235TextView);

        c346Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C346 - Android Programming");
                intent.putExtra("module info", "Module Code: C346 \nVenue: E62E\nAcademic Year: 2022\nSemester: 1\nModule Credit: 5");
                startActivity(intent);
            }
        });

        c203Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C203 - Web Appln Development in php");
                intent.putExtra("module info", "Module Code: C203 \nVenue: W65H\nAcademic Year: 2022\nSemester: 1\nModule Credit: 5");
                startActivity(intent);
            }
        });

        c206Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C206 - Software Development Process");
                intent.putExtra("module info", "Module Code: C206 \nVenue: E66K\nAcademic Year: 2022\nSemester: 1\nModule Credit: 5");
                startActivity(intent);
            }
        });

        c218Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C218 - UI/UX Design for Apps");
                intent.putExtra("module info", "Module Code: C218 \nVenue: E66B\nAcademic Year: 2022\nSemester: 1\nModule Credit: 5");
                startActivity(intent);
            }
        });

        c235Text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C235 - IT Security and Management");
                intent.putExtra("module info", "Module Code: C235 \nVenue: E65H\nAcademic Year: 2022\nSemester: 1\nModule Credit: 5");
                startActivity(intent);
            }
        });

    }
}