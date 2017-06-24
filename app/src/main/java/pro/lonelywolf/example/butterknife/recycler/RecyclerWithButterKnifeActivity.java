package pro.lonelywolf.example.butterknife.recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pro.lonelywolf.example.butterknife.R;

public class RecyclerWithButterKnifeActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        ButterKnife.bind(this);
        recyclerView.setAdapter(new RecyclerWithButterKnifeAdapter(ItemSupplier.get()));
    }
}
