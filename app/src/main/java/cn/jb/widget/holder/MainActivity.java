package cn.jb.widget.holder;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends BaseActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_retry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadData();
            }
        });
    }

    @Override
    protected void loadData() {
        showLoading();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                show();
            }
        }, 300);
    }

    private void show() {
        switch (count++) {
            case 0: {
                showDataEmpty();
                break;
            }
            case 1: {
                showDataError();
                break;
            }
            case 2: {
                showDataNoNet();
                break;
            }
            case 3: {
                showContent();
                break;
            }
            default: {
                count = 0;
                show();
                break;
            }
        }
    }
}
