package com.example.dell.wallpaper;

import android.app.ActionBar;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Ricktter on 30/11/2015.
 */
public class ImageAdapter extends BaseAdapter {

    public Integer[] mThumbIds = {
            R.drawable.carita, R.drawable.coche,
            R.drawable.cora, R.drawable.ham,
            R.drawable.katn, R.drawable.kity,
            R.drawable.lego, R.drawable.mega,
            R.drawable.pape, R.drawable.play,
    };

    private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount(){
        return mThumbIds.length;
    }

    @Override
    public  Object getItem(int position){
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(GridLayout.LayoutParams.WRAP_CONTENT, 200));
        return imageView;
    }

}
