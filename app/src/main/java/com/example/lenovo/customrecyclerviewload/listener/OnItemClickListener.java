package com.example.lenovo.customrecyclerviewload.listener;


import com.example.lenovo.customrecyclerviewload.viewholder.ViewHolder;

/**
 */
public interface OnItemClickListener<T> {
    void onItemClick(ViewHolder viewHolder, T data, int position);

}
