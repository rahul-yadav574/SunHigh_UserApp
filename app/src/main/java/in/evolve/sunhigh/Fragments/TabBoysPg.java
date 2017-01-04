package in.evolve.sunhigh.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import in.evolve.sunhigh.Adapters.PgShowAdapter;
import in.evolve.sunhigh.Models.Pg;
import in.evolve.sunhigh.R;

/**
 * Created by Brekkishhh on 22-12-2016.
 */
public class TabBoysPg  extends Fragment{

    private RecyclerView pgRecyclerView;
    private PgShowAdapter adapter;

    public TabBoysPg() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boys_pg,container,false);

        pgRecyclerView = (RecyclerView) view.findViewById(R.id.boysPgRecyclerView);

        List<Pg> lis = new ArrayList<>();
        lis.add(new Pg("","",new ArrayList<String>(),new HashMap<String,String>(),new ArrayList<String>()));
        lis.add(new Pg("","",new ArrayList<String>(),new HashMap<String,String>(),new ArrayList<String>()));
        lis.add(new Pg("","",new ArrayList<String>(),new HashMap<String,String>(),new ArrayList<String>()));
        lis.add(new Pg("","",new ArrayList<String>(),new HashMap<String,String>(),new ArrayList<String>()));
        lis.add(new Pg("","",new ArrayList<String>(),new HashMap<String,String>(),new ArrayList<String>()));
        adapter = new PgShowAdapter(lis);
        pgRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        pgRecyclerView.setAdapter(adapter);
        return view;
    }

}
