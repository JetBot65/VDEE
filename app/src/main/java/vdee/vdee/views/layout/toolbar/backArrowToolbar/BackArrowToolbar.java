package vdee.vdee.views.layout.toolbar.backArrowToolbar;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import vdee.vdee.R;
import vdee.vdee.views.layout.toolbar.ToolbarSupport;

/**
 * Toolbar for a back arrow toolbar.
 */
public class BackArrowToolbar implements ToolbarSupport {

    private AppCompatActivity mActivity;

    @BindView(R.id.toolbar_no_menu) Toolbar mToolbar;
    @BindView(R.id.toolbar_title) TextView mToolbarTitle;
    @BindView(R.id.toolbar_back_arrow) ImageView mBackArrow;

    public BackArrowToolbar(AppCompatActivity activity, int titleId) {
        mActivity = activity;
        ButterKnife.bind(this, mActivity);
        mToolbarTitle.setText(titleId);
        mToolbar.setTitle("");
        mActivity.setSupportActionBar(mToolbar);
    }

    @OnClick(R.id.toolbar_back_arrow)
    void onBackArrowClicked() {
        mActivity.onBackPressed();
    }
}
