package com.example.lenovo.customrecyclerviewload.listener;


import com.example.lenovo.customrecyclerviewload.viewholder.ViewHolder;

/**
 */
public interface OnItemChildClickListener<T> {
    void onItemChildClick(ViewHolder viewHolder, T data, int position);
}
