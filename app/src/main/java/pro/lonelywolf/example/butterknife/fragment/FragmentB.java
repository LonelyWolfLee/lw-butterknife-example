package pro.lonelywolf.example.butterknife.fragment;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import pro.lonelywolf.example.butterknife.R;


public class FragmentB extends Fragment {

    @BindView(R.id.txt_description)
    TextView description;
    @BindView(R.id.img_view)
    ImageView image;
    @BindString(R.string.str_frag_b)
    String strDescription;
    @BindDrawable(android.R.drawable.star_big_on)
    Drawable drawable;

    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment, container, false);

        unbinder = ButterKnife.bind(this, view);
        description.setText(strDescription);
        image.setImageDrawable(drawable);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
