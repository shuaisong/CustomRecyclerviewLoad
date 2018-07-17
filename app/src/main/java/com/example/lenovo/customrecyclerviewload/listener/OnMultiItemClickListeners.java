package com.example.lenovo.customrecyclerviewload.listener;


import com.example.lenovo.customrecyclerviewload.viewholder.ViewHolder;

/**
 * Time:
 */
public interface OnMultiItemClickListeners<T> {
    void onItemClick(ViewHolder viewHolder, T data, int position, int viewType);
}
