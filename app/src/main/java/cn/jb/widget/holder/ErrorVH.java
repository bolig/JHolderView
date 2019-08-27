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
public class ErrorVH extends BaseHolder implements IRetry {

    private Button btnRetry;

    public ErrorVH() {
        super(HolderStatus.ERROR);
    }

    @Override
    protected View getContentView(Context mContext) {
        return inflater(R.layout.layout_error);
    }

    @Override
    protected void initContentView(View contentView) {
        btnRetry = getView(R.id.btn_retry);
        btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retry.run();
            }
        });
    }


    private Runnable retry;

    @Override
    public void setRetryCallback(Runnable retryCallback) {
        retry = retryCallback;
    }
}
