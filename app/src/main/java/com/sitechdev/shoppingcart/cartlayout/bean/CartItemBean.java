package com.sitechdev.shoppingcart.cartlayout.bean;


public class CartItemBean implements ICartItem {

    private boolean isChecked = false;
    private int itemType;
    protected long itemId;

    @Override
    public boolean isChecked() {
        return isChecked;
    }

    @Override
    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public long getItemId() {
        return itemId;
    }

    @Override
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Override
    public int getItemType() {
        return itemType;
    }

    @Override
    public void setItemType(int itemType) {
        this.itemType = itemType;
    }
}
