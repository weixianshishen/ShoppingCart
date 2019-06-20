package com.sitechdev.shoppingcart.cartlayout.bean;


public class ChildItemBean extends CartItemBean implements IChildItem{
    protected int groupId;

    @Override
    public int getGroupId() {
        return groupId;
    }

    @Override
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
