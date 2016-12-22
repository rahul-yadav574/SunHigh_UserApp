package in.evolve.sunhigh.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.evolve.sunhigh.R;

/**
 * Created by Brekkishhh on 22-12-2016.
 */
public class TabGirlsPg extends Fragment {

    private RecyclerView pgRecyclerView;

    public TabGirlsPg() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_girls_pg,container,false);
        pgRecyclerView = (RecyclerView) view.findViewById(R.id.girlsPgRecyclerView);
        pgRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}
