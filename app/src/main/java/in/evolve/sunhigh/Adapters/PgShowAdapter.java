package in.evolve.sunhigh.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.evolve.sunhigh.Models.Pg;
import in.evolve.sunhigh.R;

/**
 * Created by Brekkishhh on 22-12-2016.
 */
public class PgShowAdapter extends RecyclerView.Adapter<PgShowAdapter.PgShowViewHolder> {


    private List<Pg> pgList;

    public PgShowAdapter(List<Pg> pgList) {
        this.pgList = pgList;
    }

    @Override
    public void onBindViewHolder(PgShowViewHolder holder, int position) {

    }

    @Override
    public PgShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PgShowViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_single_pg,parent,false));
    }

    @Override
    public int getItemCount() {
        return pgList.size();
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
