package pro.lonelywolf.example.butterknife.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pro.lonelywolf.example.butterknife.R;


public class RecyclerWithButterKnifeAdapter extends RecyclerView.Adapter<RecyclerWithButterKnifeViewHolder> {

    private final List<String> items;

    public RecyclerWithButterKnifeAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public RecyclerWithButterKnifeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycler_view_item, parent, false);
        RecyclerWithButterKnifeViewHolder holder = new RecyclerWithButterKnifeViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerWithButterKnifeViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
