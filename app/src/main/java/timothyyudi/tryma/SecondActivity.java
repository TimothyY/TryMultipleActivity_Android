package timothyyudi.tryma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String username = this.getIntent().getStringExtra("username");
        Toast.makeText(this, "halo "+username, Toast.LENGTH_SHORT).show();
    }
}
