package com.sifannnn.alipaydemo;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by lishifan on 2022/8/20.
 */

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int row = 1;
    private int space = 1;

    public SpaceItemDecoration(int row, int space) {
        this.row = row;
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.bottom = space;
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);

    }

}
