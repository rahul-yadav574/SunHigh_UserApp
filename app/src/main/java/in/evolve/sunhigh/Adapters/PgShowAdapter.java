package in.evolve.sunhigh.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Brekkishhh on 22-12-2016.
 */
public class PgShowAdapter extends RecyclerView.Adapter<PgShowAdapter.PgShowViewHolder> {

    @Override
    public void onBindViewHolder(PgShowViewHolder holder, int position) {

    }

    @Override
    public PgShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    protected class PgShowViewHolder extends RecyclerView.ViewHolder{

        public PgShowViewHolder(View itemView) {
            super(itemView);
        }
    }
}
