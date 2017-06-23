package pro.lonelywolf.example.butterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import pro.lonelywolf.example.butterknife.basic.BasicActivity;
import pro.lonelywolf.example.butterknife.basic.BasicViaActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.opt_basic)
    public void basic() {
        startActivity(new Intent(this, BasicActivity.class));
    }

    @OnClick(R.id.opt_basic_butterknife)
    public void basicVia() {
        startActivity(new Intent(this, BasicViaActivity.class));
    }

    @OnClick(R.id.opt_recycler)
    public void recycler() {

    }

    @OnClick(R.id.opt_recycler_butterknife)
    public void recyclerVia() {

    }

    @OnClick(R.id.opt_fragment)
    public void fragment() {

    }

    @OnClick(R.id.opt_fragment_butterknife)
    public void fragmentVia() {

    }
}
