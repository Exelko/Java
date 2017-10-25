package com.example.android.miwok;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Symkach on 10/23/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<Word> mDataset;
    private Context mContext;
    public OnPlayClickListener onPlayClickListener;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageView;
        public View mContainer;

        public ViewHolder(View v) {
            super(v);

            mTextView = (TextView) v.findViewById(R.id.list_item_1);
            mImageView = (ImageView) v.findViewById(R.id.image);
            mContainer = v.findViewById(R.id.list_item);
        }
    }

    public MyAdapter(Context context, ArrayList<Word> myDataset) {
        mDataset = myDataset;
        mContext = context;
    }

    public Context getmContext() {
        return mContext;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        final Word word = mDataset.get(position);

        TextView textView = holder.mTextView;
        textView.setText(word.getEnglishTranslation());

        ImageView imageView = holder.mImageView;
        imageView.setImageResource(word.getImgResId());

        View container = holder.mContainer;
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPlayClickListener.onPlayClicked(word.getSoundResId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public interface OnPlayClickListener {
        void onPlayClicked(int resId);
    }

    public void setOnPlayClickListener(OnPlayClickListener onPlayClickListener) {
        this.onPlayClickListener = onPlayClickListener;
    }
}
