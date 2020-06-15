package net.accelf.easter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

public class AccelForceEasterView extends AppCompatImageView {

    EasterCounter counter;
    OnEasterEggExecuteListener listener;

    public AccelForceEasterView(Context context) {
        this(context, null);
    }

    public AccelForceEasterView(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.accelForceEasterViewStyle);
    }

    public AccelForceEasterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        counter = new EasterCounter();
        updateDrawable(context);
        setOriginalOnClickListener(this::onEasterEggClick);
        setOnEasterEggExecuteListener(this::defaultOnEasterEggExecute);
    }

    @Override
    public void setImageDrawable(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Setting drawable to AccelForceEasterView is not allowed.");
    }

    private void setOriginalImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    @Override
    public void setOnClickListener(@Nullable View.OnClickListener l) {
        throw new UnsupportedOperationException("Setting onClickListener to AccelForceEasterView is not allowed.");
    }

    private void setOriginalOnClickListener(@Nullable View.OnClickListener l) {
        super.setOnClickListener(l);
    }

    private void updateDrawable(Context context) {
        setOriginalImageDrawable(context.getDrawable(counter.getCurrentImageResource()));
    }

    private void onEasterEggClick(View view) {
        boolean execute = counter.countNext();
        updateDrawable(view.getContext());
        if (execute) {
            listener.execute(view);
        }
    }

    public void setOnEasterEggExecuteListener(OnEasterEggExecuteListener l) {
        listener = l;
    }

    private void defaultOnEasterEggExecute(View view) {
        Toast.makeText(view.getContext(), "Easter hooked.", Toast.LENGTH_SHORT).show();
    }

    public interface OnEasterEggExecuteListener {
        void execute(View view);
    }
}
