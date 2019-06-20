package com.sitechdev.shoppingcart.viewholder;

import android.view.View;
import android.widget.TextView;

import com.sitechdev.shoppingcart.R;
import com.sitechdev.shoppingcart.cartlayout.viewholder.CartViewHolder;


public class GroupViewHolder extends CartViewHolder {
    public TextView textView;

    public GroupViewHolder(View itemView, int chekbox_id) {
        super(itemView, chekbox_id);
        textView = itemView.findViewById(R.id.tv);
    }
}
