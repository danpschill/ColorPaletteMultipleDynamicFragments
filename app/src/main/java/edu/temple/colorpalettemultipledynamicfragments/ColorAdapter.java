package edu.temple.colorpalettemultipledynamicfragments;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ColorAdapter extends BaseAdapter {


    Context context;
    String[] colors;
    Fragment fragment;

    public ColorAdapter(Context c, String[] colors) {
        this.context = c;
        this.colors = colors;
    }





    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        textView.setText(colors[i]);

        try {
            textView.setBackgroundColor(Color.parseColor(colors[i]));

        } catch (IllegalArgumentException e) {
            //Toast.makeText(MainActivity.this, "Select color.", Toast.LENGTH_SHORT).show();
        }

        return textView;
    }

}
