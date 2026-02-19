package kaivalya.anugula.fragmentlab5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class KaivalyaActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findViewById(R.id.main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.layout.activity_main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}