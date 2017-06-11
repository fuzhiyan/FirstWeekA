package com.bwei.firstweeka.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwei.firstweeka.R;
import com.bwei.firstweeka.bean.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.TViewHolder> {
    private Context context;
    private List<Bean> list=new ArrayList<>();
    private LayoutInflater layoutInflater;

    public RecycleAdapter(Context context, List<Bean> list) {
        this.context = context;
        this.list = list;
        layoutInflater=LayoutInflater.from(context);
    }


    @Override
    public TViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v=layoutInflater.inflate(R.layout.list_item,parent,false);
        TViewHolder tv=new TViewHolder(v);
        return tv;
    }
    @Override
    public void onBindViewHolder(TViewHolder holder, final int position) {
        holder.textView1.setText(list.get(position).getTitle());
        holder.textView2.setText(list.get(position).getText());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClickListener(position,v);

            }
        });
        holder.textView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                listener.onItemLongClickListener(position,v);
                return true;
            }
        });


    }


    class TViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1,textView2;
        public TViewHolder(View itemView) {
            super(itemView);
            textView1= (TextView) itemView.findViewById(R.id.text);
            textView2= (TextView) itemView.findViewById(R.id.text1);
            imageView= (ImageView) itemView.findViewById(R.id.image);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    interface OnItemClickListener {

        void onItemClickListener(int position,View view);
        void onItemLongClickListener(int position,View view);
    }


    public OnItemClickListener listener ;



    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

}
