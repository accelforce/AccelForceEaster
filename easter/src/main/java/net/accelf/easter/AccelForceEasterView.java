package net.accelf.easter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class AccelForceEasterView extends AppCompatImageView {

    public AccelForceEasterView(Context context) {
        this(context, null);
    }

    public AccelForceEasterView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.accelForceEasterViewStyle);
    }

    public AccelForceEasterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOriginalImageDrawable(context.getDrawable(R.drawable.accelf_easter_0));
    }

    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Setting drawable to AccelForceEasterView is not allowed.");
    }

    private void setOriginalImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }
}
