package cn.jb.widget.holder;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import cn.jb.view.holder.HolderView;

/**
 * Created by JustBlue on 2019-08-27.
 *
 * @email: bo.li@cdxzhi.com
 * @desc:
 */
public class BaseActivity extends AppCompatActivity {

    private HolderView mHolder;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        mHolder = findViewById(R.id.holder_view);
        if (mHolder != null) {
            mHolder.setAdapter(new HolderAdapter(){
                @Override
                public void run() {
                    loadData();
                }
            });
        }
    }

    protected void loadData() {

    }

    protected void showLoading() {
        if (mHolder != null) {
            mHolder.showStatus(HolderStatus.LOADING);
        }
    }

    protected void showDataEmpty() {
        if (mHolder != null) {
            mHolder.showStatus(HolderStatus.EMPTY);
        }
    }

    protected void showDataError() {
        if (mHolder != null) {
            mHolder.showStatus(HolderStatus.ERROR);
        }
    }

    protected void showDataNoNet() {
        if (mHolder != null) {
            mHolder.showStatus(HolderStatus.NONET);
        }
    }

    protected void showContent() {
        if (mHolder != null) {
            mHolder.showStatus(HolderStatus.CONTENT);
        }
    }

}
