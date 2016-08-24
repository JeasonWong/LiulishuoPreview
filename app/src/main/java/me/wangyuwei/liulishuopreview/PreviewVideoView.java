package me.wangyuwei.liulishuopreview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * 作者： 巴掌 on 16/8/22 23:00
 * Github: https://github.com/JeasonWong
 */
public class PreviewVideoView extends VideoView {

    public PreviewVideoView(Context context) {
        super(context);
    }

    public PreviewVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PreviewVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int w = MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(w, (int) (w / 0.56f));
    }
}
