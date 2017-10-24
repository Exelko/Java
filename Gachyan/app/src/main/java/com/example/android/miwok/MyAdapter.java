package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Symkach on 10/23/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Word> mDataset;
    private Context mContext;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);

            mTextView = (TextView) v.findViewById(R.id.list_item_1);
            mImageView = (ImageView) v.findViewById(R.id.image);
        }
    }

    public MyAdapter(Context context, ArrayList<Word> myDataset) {
        mDataset = myDataset;
        mContext = context;
    }

    private Context getmContext() {
        return mContext;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        Word word = mDataset.get(position);

        TextView textView = holder.mTextView;
        textView.setText(word.getEnglishTranslation());

        ImageView imageVIew = holder.mImageView;
        imageVIew.setImageResource(word.getImgResId());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
