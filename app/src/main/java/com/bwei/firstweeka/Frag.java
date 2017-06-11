package com.bwei.firstweeka;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.firstweeka.adapter.RecycleAdapter;
import com.bwei.firstweeka.bean.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */

public class Frag extends Fragment implements RecycleAdapter.OnItemClickListener {
    private RecyclerView recyclerView;
    private RecycleAdapter recycleAdapter;
    private List<Bean> list=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment,container,false);
        recyclerView= (RecyclerView) v.findViewById(R.id.recy);
        initDate();
        LinearLayoutManager manager=new LinearLayoutManager
                (getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recycleAdapter=new RecycleAdapter(getContext(),list);
        recyclerView.setAdapter(recycleAdapter);
        return v;
    }

    private void initDate() {
        for(int i=0;i<10;i++){
            Bean bean=new Bean();
            bean.setTitle("第"+i+"条标题");
            bean.setText("第"+i+"条内容");
            list.add(bean);
        }
    }


    @Override
    public void onItemClickListener(int position, View view) {
        Intent intent = new Intent(getContext(), Second.class);
        intent.putExtra("title", list.get(position).getTitle());
        intent.putExtra("text", list.get(position).getText());
        startActivity(intent);

    }

    @Override
    public void onItemLongClickListener(int position, View view) {

    }
}
