package com.sitechdev.shoppingcart.cartlayout.bean;

import java.util.List;


public class GroupItemBean extends CartItemBean implements IGroupItem<ChildItemBean> {
    private List<ChildItemBean> children;

    public List<ChildItemBean> getChildren() {
        return children;
    }

    public void setChildren(List<ChildItemBean> children) {
        this.children = children;
    }
}
