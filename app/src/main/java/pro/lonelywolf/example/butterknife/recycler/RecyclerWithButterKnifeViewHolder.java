package pro.lonelywolf.example.butterknife.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pro.lonelywolf.example.butterknife.R;

class RecyclerWithButterKnifeViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txt_item)
    TextView text;
    String item;

    RecyclerWithButterKnifeViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    void bind(final String item) {
        this.item = item;
    }

    @OnClick(R.id.btn_item)
    void clickButton() {
        text.setText(getItem());
    }

    private String getItem() {
        return this.item;
    }
}