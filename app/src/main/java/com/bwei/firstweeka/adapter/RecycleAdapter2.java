package com.bwei.firstweeka.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.firstweeka.R;
import com.bwei.firstweeka.bean.PuBuBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */

public class RecycleAdapter2 extends RecyclerView.Adapter<RecycleAdapter2.MasonryView>{
    ArrayList<PuBuBean> list;

    private List<Integer> mHeights;


    public RecycleAdapter2(ArrayList<PuBuBean> list) {
        this.list = list;
    }

    @Override
    public MasonryView onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pubu_item, parent, false);
        return new MasonryView(view);
    }

    @Override
    public void onBindViewHolder(MasonryView holder, int position) {
        holder.textView.setText(list.get(position).getText());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MasonryView extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public MasonryView(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.masonry_item_img);
            textView = (TextView) itemView.findViewById(R.id.masonry_item_title);
        }
    }
}

