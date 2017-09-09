package com.yun.opern.ui.activitys;

import android.widget.Button;

import com.jakewharton.rxbinding2.view.RxView;
import com.tencent.bugly.beta.Beta;
import com.yun.opern.BuildConfig;
import com.yun.opern.R;
import com.yun.opern.ui.bases.BaseActivity;

import butterknife.BindView;

public class AboutUsActivity extends BaseActivity {
    @BindView(R.id.check_update_btn)
    Button checkUpdateBtn;

    @Override
    protected int contentViewRes() {
        return R.layout.activity_about_us;
    }

    @Override
    protected void initView() {
        checkUpdateBtn.setText(String.valueOf("当前版本 " + BuildConfig.VERSION_NAME + " 检测更新"));
        RxView.clicks(checkUpdateBtn).subscribe(o -> Beta.checkUpgrade());
    }


}
