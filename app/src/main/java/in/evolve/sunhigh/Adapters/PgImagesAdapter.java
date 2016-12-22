package in.evolve.sunhigh.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Brekkishhh on 22-12-2016.
 */
public class PgImagesAdapter extends RecyclerView.Adapter<PgImagesAdapter.PgImageViewHolder> {

    @Override
    public void onBindViewHolder(PgImageViewHolder holder, int position) {

    }

    @Override
    public PgImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    protected class PgImageViewHolder extends RecyclerView.ViewHolder{

        public PgImageViewHolder(View itemView) {
            super(itemView);
        }
    }
}
