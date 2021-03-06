package com.wss.module.main.ui.refresh.adapter;

import android.content.Context;
import android.view.View;

import com.wss.common.base.adapter.BaseListAdapter;
import com.wss.common.listener.OnListItemClickListener;
import com.wss.module.main.R;
import com.wss.module.main.bean.Article;

import org.byteam.superadapter.SuperViewHolder;

import java.util.List;

/**
 * Describe：文章列表适配器
 * Created by 吴天强 on 2018/10/23.
 */

public class ArticleAdapter extends BaseListAdapter<Article> {


    public ArticleAdapter(Context context, List<Article> items, int layoutResId, OnListItemClickListener listener) {
        super(context, items, layoutResId, listener);
    }

    @Override
    public void onBind(SuperViewHolder holder, int viewType, final int layoutPosition, Article item) {
        holder.setText(R.id.tv_title, item.getTitle());
        holder.setText(R.id.tv_author, String.format("作者：%s", item.getAuthor()));
        holder.setText(R.id.tv_date, String.format("时间：%s", item.getNiceDate()));
        holder.setText(R.id.tv_type1, item.getChapterName());
        holder.setText(R.id.tv_type2, item.getSuperChapterName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(layoutPosition);
                }
            }
        });
    }
}
