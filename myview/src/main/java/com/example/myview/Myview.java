package com.example.myview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Myview extends View {
    public float nx;
    public float ny;
    public Myview(Context con) {
        super(con);
        this.nx=121;
        this.ny=333;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(this.getResources(),R.mipmap.anz);
        canvas.drawBitmap(bitmap,nx,ny,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
     }
}
