package com.sitechdev.shoppingcart;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.sitechdev.shoppingcart.bean.GoodsBean;
import com.sitechdev.shoppingcart.bean.NormalBean;
import com.sitechdev.shoppingcart.bean.ShopBean;
import com.sitechdev.shoppingcart.cartlayout.CartAdapter;
import com.sitechdev.shoppingcart.cartlayout.viewholder.CartViewHolder;
import com.sitechdev.shoppingcart.viewholder.ChildViewHolder;
import com.sitechdev.shoppingcart.viewholder.GroupViewHolder;
import com.sitechdev.shoppingcart.viewholder.NormalViewHolder;

import java.util.List;

public class MainAdapter extends CartAdapter<CartViewHolder> {

    public MainAdapter(Context context, List datas) {
        super(context, datas);
    }

    @Override
    protected CartViewHolder getNormalViewHolder(View itemView) {
        return new NormalViewHolder(itemView, -1);
    }

    @Override
    protected CartViewHolder getGroupViewHolder(View itemView) {
        return (CartViewHolder) new GroupViewHolder(itemView, R.id.checkbox);
    }

    @Override
    protected CartViewHolder getChildViewHolder(View itemView) {
        return (CartViewHolder) (new ChildViewHolder(itemView, R.id.checkbox) {
            @Override
            public void onNeedCalculate() {
                if (onCheckChangeListener != null) {
                    onCheckChangeListener.onCalculateChanged(null);
                }
            }
        });
    }

    @Override
    protected int getChildItemLayout() {
        return R.layout.activity_main_item_child;
    }

    @Override
    protected int getGroupItemLayout() {
        return R.layout.activity_main_item_group;
    }

    @Override
    protected int getNormalItemLayout() {
        return R.layout.activity_main_item_normal;
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);
        if (holder instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) holder;
            childViewHolder.textView.setText(((GoodsBean) mDatas.get(position)).getGoods_name());
            childViewHolder.textViewPrice.setText(
                    mContext.getString(R.string.rmb_X, ((GoodsBean) mDatas.get(position)).getGoods_price()));
            childViewHolder.textViewNum.setText(String.valueOf(((GoodsBean) mDatas.get(position)).getGoods_amount()));
        } else if (holder instanceof GroupViewHolder) {
            GroupViewHolder groupViewHolder = (GroupViewHolder) holder;
            groupViewHolder.textView.setText(((ShopBean) mDatas.get(position)).getShop_name());
        } else if (holder instanceof NormalViewHolder) {
            NormalViewHolder normalViewHolder = (NormalViewHolder) holder;
            normalViewHolder.imgViewClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mDatas.remove(position);
                    notifyItemRemoved(position);
                    notifyItemRangeChanged(position, mDatas.size());
                }
            });
            normalViewHolder.textView.setText(mContext.getString(R.string.normal_tip_X,
                    ((NormalBean) mDatas.get(position)).getMarkdownNumber()));
        }
    }
}
