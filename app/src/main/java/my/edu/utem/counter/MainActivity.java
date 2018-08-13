package my.edu.utem.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv_Num);
        cnt = 0;
    }

    public void buttonPlus(View view) {
        Log.d("debug", "Plus");
        Toast.makeText(MainActivity.this, "Plus", Toast.LENGTH_LONG).show();
        cnt = cnt + 1;
        textView.setText(cnt+"");
    }

    public void buttonMinus(View view) {
        Log.d("debug", "Minus");
        Toast.makeText(MainActivity.this, "Minus", Toast.LENGTH_LONG).show();

        if (cnt == 0)
            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
        else {
            cnt = cnt - 1;
            textView.setText(cnt + "");
        }
    }

    public void buttonReset(View view) {
        Log.d("debug", "Reset");
        Toast.makeText(MainActivity.this, "Reset", Toast.LENGTH_LONG).show();
        cnt = 0;
        textView.setText("0");
    }
}
