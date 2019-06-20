package com.sitechdev.shoppingcart.cartlayout.bean;

import java.util.List;

public interface IGroupItem<CHILD extends IChildItem> extends ICartItem {
    List<CHILD> getChildren();

    void getChildren(List<CHILD> children);
}
