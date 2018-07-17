package com.example.lenovo.customrecyclerviewload.listener;


import com.example.lenovo.customrecyclerviewload.viewholder.ViewHolder;

/**
 * Time:
 */
public interface OnSwipeMenuClickListener<T> {
    void onSwipMenuClick(ViewHolder viewHolder, T data, int position);
}
