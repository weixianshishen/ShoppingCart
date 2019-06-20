package com.sitechdev.shoppingcart.cartlayout.listener;


import com.sitechdev.shoppingcart.cartlayout.bean.ICartItem;

import java.util.List;

public interface OnItemChangeListener {
    void normalCheckChange(List<ICartItem> beans, int position, boolean isChecked);

    void groupCheckChange(List<ICartItem> beans, int position, boolean isChecked);

    void childCheckChange(List<ICartItem> beans, int position, boolean isChecked);
}
