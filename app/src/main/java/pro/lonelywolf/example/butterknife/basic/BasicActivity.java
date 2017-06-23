package pro.lonelywolf.example.butterknife.basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pro.lonelywolf.example.butterknife.R;

public class BasicActivity extends AppCompatActivity {
    TextView changeView;
    Button btnChangeText;
    Button btnChangeColor;

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button_change_text:
                    String strChanged = getString(R.string.str_basic);
                    changeView.setText(strChanged);
                    break;
                case R.id.button_change_color:
                    int colorChanged = getResources().getColor(R.color.colorBasicChanged);
                    changeView.setBackgroundColor(colorChanged);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        changeView = (TextView) findViewById(R.id.text_change_view);
        btnChangeText = (Button) findViewById(R.id.button_change_text);
        btnChangeColor = (Button) findViewById(R.id.button_change_color);

        btnChangeText.setOnClickListener(onClickListener);
        btnChangeColor.setOnClickListener(onClickListener);
    }
}