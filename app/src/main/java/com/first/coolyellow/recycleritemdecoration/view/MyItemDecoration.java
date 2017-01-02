package com.first.coolyellow.recycleritemdecoration.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/**
 * Created by coolyellow on 1/2/17.
 */

public class MyItemDecoration extends RecyclerView.ItemDecoration {

    private Paint paint;
    private Paint dPaint;

    public MyItemDecoration() {
        init();
    }

    private void init() {
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        dPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        dPaint.setTextSize(18);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int position = parent.getChildAdapterPosition(view);
        if (position % 5 == 0) {
            outRect.top = 40;
        } else {
            outRect.top = 0;
        }
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        for (int i = 0; i < parent.getChildCount(); i++) {
            View view = parent.getChildAt(i);
            int left = parent.getLeft();
            int right = parent.getWidth() + left;
            int top = view.getTop();
            int positon = parent.getChildAdapterPosition(view);
            if (positon % 5 == 0) {
                c.drawRect(left, top - 40, right, top, paint);
            }
        }
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        Log.e("width",parent.getWidth()+"======");
        c.drawRect(0,0,parent.getWidth(),40,paint);
        c.drawText("xx",0+30,0+20,dPaint);
    }
}
