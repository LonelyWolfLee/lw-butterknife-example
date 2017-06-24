package pro.lonelywolf.example.butterknife.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pro.lonelywolf.example.butterknife.R;

public class RecyclerWithButterKnifeViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_item)
    TextView text;
    @BindView(R.id.btn_item)
    Button button;

    String item;

    public RecyclerWithButterKnifeViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(itemView);
    }

    @OnClick(R.id.btn_item)
    public void clickButton() {
        text.setText(item);
    }

    public void bind(final String item) {
        this.item = item;
    }
}