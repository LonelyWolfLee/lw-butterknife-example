package pro.lonelywolf.example.butterknife.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import pro.lonelywolf.example.butterknife.R;

public class FragmentActivity extends AppCompatActivity {

    private static int FRAGMENT_A = 0;
    private static int FRAGMENT_B = 1;

    Fragment[] fragments = new Fragment[2];

    @OnClick(R.id.btn_frag_a)
    public void clickButtonA() {
        replaceFragment(fragments[FRAGMENT_A]);
    }

    @OnClick(R.id.btn_frag_b)
    public void clickButtonB() {
        replaceFragment(fragments[FRAGMENT_B]);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ButterKnife.bind(this);

        fragments[FRAGMENT_A] = new FragmentA();
        fragments[FRAGMENT_B] = new FragmentB();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(R.id.frag_layout, fragments[FRAGMENT_A]);
        ft.commit();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.frag_layout, fragment);
        ft.commit();
    }
}
