package pro.lonelywolf.example.butterknife.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pro.lonelywolf.example.butterknife.R;

class RecyclerWithButterKnifeViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_item)
    TextView text;
    @BindView(R.id.btn_item)
    Button button;

    RecyclerWithButterKnifeViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    void bind(final String item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(item);
            }
        });
    }
}