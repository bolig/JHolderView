package cn.jb.widget.holder;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import cn.jb.view.holder.BaseHolder;

/**
 * Created by JustBlue on 2019-08-27.
 *
 * @email: bo.li@cdxzhi.com
 * @desc:
 */
public class EmptyVH extends BaseHolder implements IRetry {

    private Button btnRetry;

    public EmptyVH() {
        super(HolderStatus.EMPTY);
    }

    @Override
    protected View getContentView(Context mContext) {
        return inflater(R.layout.layout_empty);
    }

    @Override
    protected void initContentView(View contentView) {
        btnRetry = getView(R.id.btn_retry);
        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (retry != null) {
                    retry.run();
                }
            }
        });
    }

    private Runnable retry;

    @Override
    public void setRetryCallback(Runnable retryCallback) {
        retry = retryCallback;
    }
}
