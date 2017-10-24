package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Symkach on 10/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorResId;
    int mSoundResId;

    public static MediaPlayer mp;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            mp.release();
        }
    };


    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    public WordAdapter(Context context, ArrayList<Word> words, int colorResId) {
        super(context, 0, words);
        mColorResId = colorResId;
    }

    public WordAdapter(Context context, ArrayList<Word> words, int colorResId, int soundResId) {
        super(context, 0, words);
        mColorResId = colorResId;
        mSoundResId = soundResId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Word currentWord = getItem(position);

        TextView rusTextView = (TextView) listItemView.findViewById(R.id.list_item_1);

        rusTextView.setText(currentWord.getEnglishTranslation());

        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.image);

        wordImage.setImageResource(currentWord.getImgResId());

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResId);

        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
