package cn.jb.widget.holder;

import android.content.Context;
import android.view.View;

import cn.jb.view.holder.BaseHolder;

/**
 * Created by JustBlue on 2019-08-27.
 *
 * @email: bo.li@cdxzhi.com
 * @desc:
 */
public class LoadingVH extends BaseHolder {


    public LoadingVH() {
        super(HolderStatus.LOADING);
    }

    @Override
    protected View getContentView(Context mContext) {
        return inflater(R.layout.layout_loadding);
    }

    @Override
    protected void initContentView(View contentView) {

    }

}
