package com.michelletan11nov17.testviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class testing extends TextView {
    private Paint linePaint;

    public testing(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        // Create the paint brushes you will use in the onDraw method.
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setColor(Color.MAGENTA);
        linePaint.setStrokeWidth(5);

    }

    public testing(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public testing(Context context) {
        super(context);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawLine(0,0, getMeasuredWidth(), 0, linePaint);
        canvas.drawLine(0,  getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(),linePaint);
        canvas.save();
        super.onDraw(canvas);
        canvas.restore();
    }



} // End of TextView
