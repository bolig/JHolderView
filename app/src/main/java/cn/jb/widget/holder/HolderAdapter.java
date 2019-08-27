package cn.jb.widget.holder;

import android.view.ViewGroup;

import cn.jb.view.holder.BaseAdapter;
import cn.jb.view.holder.BaseHolder;

/**
 * Created by JustBlue on 2019-08-27.
 *
 * @email: bo.li@cdxzhi.com
 * @desc:
 */
public abstract class HolderAdapter extends BaseAdapter implements Runnable {

    @Override
    public BaseHolder onCreateHolder(ViewGroup parent, int status) {
        switch (status) {
            case HolderStatus.EMPTY:
                return new EmptyVH();
            case HolderStatus.ERROR:
                return new ErrorVH();
            case HolderStatus.NONET:
                return new NoNetVH();
            case HolderStatus.LOADING:
                return new LoadingVH();
            default:
                throw new IllegalArgumentException("无效的状态码");
        }
    }

    @Override
    public void onCompleteShow(BaseHolder holder) {
        if (holder instanceof IRetry) {
            ((IRetry) holder).setRetryCallback(this);
        }
    }
}
