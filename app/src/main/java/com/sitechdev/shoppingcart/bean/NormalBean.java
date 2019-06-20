package com.sitechdev.shoppingcart.bean;


import com.sitechdev.shoppingcart.cartlayout.bean.CartItemBean;


public class NormalBean extends CartItemBean {
    int markdownNumber;

    public int getMarkdownNumber() {
        return markdownNumber;
    }

    public void setMarkdownNumber(int markdownNumber) {
        this.markdownNumber = markdownNumber;
    }
}
