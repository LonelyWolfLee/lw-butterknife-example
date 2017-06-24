package pro.lonelywolf.example.butterknife.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import pro.lonelywolf.example.butterknife.R;

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView text;
    Button button;

    RecyclerViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView.findViewById(R.id.txt_item);
        button = (Button) itemView.findViewById(R.id.btn_item);
    }

    void bind(final String item) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(item);
            }
        });
    }
}
