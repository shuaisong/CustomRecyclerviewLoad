package com.example.lenovo.customrecyclerviewload.listener;


import com.example.lenovo.customrecyclerviewload.viewholder.ViewHolder;

/**
 */
public interface OnItemLongClickListener<T> {
    void onItemLongClick(ViewHolder viewHolder, T data, int position);
}
