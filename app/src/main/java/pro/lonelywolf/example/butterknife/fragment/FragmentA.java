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

import pro.lonelywolf.example.butterknife.R;


public class FragmentA extends Fragment {

    TextView description;
    ImageView image;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment, container, false);

        description = (TextView) view.findViewById(R.id.txt_description);
        image = (ImageView) view.findViewById(R.id.img_view);

        description.setText(getString(R.string.str_frag_a));
        Drawable drawable = getResources().getDrawable(android.R.drawable.star_big_off);
        image.setImageDrawable(drawable);

        return view;
    }
}
