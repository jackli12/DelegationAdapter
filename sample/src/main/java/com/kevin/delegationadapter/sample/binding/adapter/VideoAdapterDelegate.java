package com.kevin.delegationadapter.sample.binding.adapter;

import android.databinding.ViewDataBinding;

import com.android.databinding.library.baseAdapters.BR;
import com.kevin.delegationadapter.extras.binding.BindingAdapterDelegate;
import com.kevin.delegationadapter.sample.R;
import com.kevin.delegationadapter.sample.bean.News;

/**
 * VideoAdapterDelegate
 *
 * @author zwenkai@foxmail.com, Created on 2018-04-27 19:09:27
 *         Major Function：<b></b>
 *         <p/>
 *         注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！
 * @author mender，Modified Date Modify Content:
 */

public class VideoAdapterDelegate extends BindingAdapterDelegate<News> {

    @Override
    protected boolean isForViewType(News news, int position) {
        // 我能处理视频类型
        return news.type == 3;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_binding_news_video;
    }

    @Override
    public void setVariable(ViewDataBinding binding, News item, int position) {
        binding.setVariable(BR.model, item);
    }
}
