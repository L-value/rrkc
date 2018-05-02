package com.example.p_ttcheng.rrk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by p_ttcheng on 2018/4/16.
 */

public class DrawLineView extends View {
    public DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth(10);
    }
    public DrawLineView(Context context) {
        super(context);
        mPaint = new Paint();
        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth(10);
    }
    private Paint mPaint;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(0,getHeight()/2,getWidth(),getHeight()/2,mPaint);//float startX, float startY, float stopX, float stopY,@NonNull Paint paint
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(20,getHeight()/2,20,mPaint);
        canvas.drawCircle(getWidth()/3,getHeight()/2,20,mPaint);
        canvas.drawCircle(getWidth()*2/3,getHeight()/2,20,mPaint);
        canvas.drawCircle(getWidth()-20,getHeight()/2,20,mPaint);
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(30);
        canvas.drawText("开始申购",0,getHeight()*4/7,mPaint);
        canvas.drawText("开始挖矿",getWidth()/3,getHeight()*4/7,mPaint);
        canvas.drawText("开始收益",getWidth()*2/3,getHeight()*4/7,mPaint);
        canvas.drawText("收益停止",getWidth()-120,getHeight()*4/7,mPaint);
    }


}
