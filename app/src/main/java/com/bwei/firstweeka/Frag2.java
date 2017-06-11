package com.bwei.firstweeka;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.firstweeka.adapter.RecycleAdapter2;
import com.bwei.firstweeka.bean.PuBuBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */

public class Frag2 extends Fragment {
    ArrayList<PuBuBean> list = new ArrayList<>();
    private RecyclerView recyclerView;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pubu, container, false);


        initView(view);


        return view;
    }

    private void initData() {

        for (int x = 0; x < 10; x++) {

            PuBuBean bean = new PuBuBean();
            bean.setText("第"+x+"条标题");
            list.add(bean);
        }


    }

    private void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

        //设置layoutManager
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        initData();

        RecycleAdapter2 adapter = new RecycleAdapter2(list);
        recyclerView.setAdapter(adapter);

        SpacesItemDecoration decoration=new SpacesItemDecoration(16);
        recyclerView.addItemDecoration(decoration);

        adapter.notifyDataSetChanged();
    }
}

