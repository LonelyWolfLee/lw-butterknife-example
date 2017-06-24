package pro.lonelywolf.example.butterknife.basic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pro.lonelywolf.example.butterknife.R;

public class BasicWithButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.text_change_view)
    TextView changeView;

    @BindString(R.string.str_basic)
    String strChanged;

    @BindColor(R.color.colorBasicChanged)
    int colorChanged;

    @OnClick(R.id.button_change_text)
    void changeText() {
        changeView.setText(strChanged);
    }

    @OnClick(R.id.button_change_color)
    void changeColor() {
        changeView.setBackgroundColor(colorChanged);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        ButterKnife.bind(this);
    }
}