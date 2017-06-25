package pro.lonelywolf.example.butterknife;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import pro.lonelywolf.example.butterknife.basic.BasicActivity;
import pro.lonelywolf.example.butterknife.basic.BasicWithButterKnifeActivity;
import pro.lonelywolf.example.butterknife.fragment.FragmentActivity;
import pro.lonelywolf.example.butterknife.recycler.RecyclerActivity;
import pro.lonelywolf.example.butterknife.recycler.RecyclerWithButterKnifeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    /**
     * Example of basic usage.
     * Get controls from findViewById(),
     * and set property or event listener with logic.
     */
    @OnClick(R.id.opt_basic)
    public void basic() {
        startActivity(new Intent(this, BasicActivity.class));
    }

    /**
     * Example of basic usage using Butter Knife.
     * Get controls, resources and event handle method from annotation and ButterKnife.bind(),
     * and set property with logic.
     */
    @OnClick(R.id.opt_basic_butterknife)
    public void basicVia() {
        startActivity(new Intent(this, BasicWithButterKnifeActivity.class));
    }

    /**
     * Example of basic recycler view usage. (ViewHolder)
     * You can get controls from View.findViewById().
     */
    @OnClick(R.id.opt_recycler)
    public void recycler() {
        startActivity(new Intent(this, RecyclerActivity.class));
    }

    /**
     * Example of basic recycler view usage using Butter Knife. (ViewHolder)
     * You can get controls from annotation and ButterKnife.bind(Object, View).
     * You cannot use @OnClick annotation in this case.
     * When you set logic of click method, (string) item is not defined yet.
     */
    @OnClick(R.id.opt_recycler_butterknife)
    public void recyclerVia() {
        startActivity(new Intent(this, RecyclerWithButterKnifeActivity.class));
    }

    /**
     * Example of fragment.
     * FragmentA is basic fragment example.
     * FragmentB is fragment example using Butter Knife.
     * Fragments have a different view lifecycle than activities.
     * You have to call unbind method in the appropriate lifecycle callback.
     */
    @OnClick(R.id.opt_fragment)
    public void fragment() {
        startActivity(new Intent(this, FragmentActivity.class));
    }
}
