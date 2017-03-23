package com.example.yan.zhihu;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yan on 2017/3/23.
 */

public class MessageAdapter extends ArrayAdapter<ListMessage> {
    private int resourceId;
    public MessageAdapter(Context context, int textViewResourceId, List<ListMessage> objects){
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListMessage message = getItem(position);
        View view  = LayoutInflater.from(getContext()).inflate(resourceId, null);
        ImageView mtopicImage = (ImageView) view.findViewById(R.id.list_topic_image);
        TextView mtopic = (TextView) view.findViewById(R.id.list_topic);
        TextView mquestion = (TextView) view.findViewById(R.id.list_question);
        TextView manswer = (TextView) view.findViewById(R.id.list_answer);
        TextView magree = (TextView) view.findViewById(R.id.list_agree);
        TextView mcomment = (TextView) view.findViewById(R.id.list_comment);
        TextView mattention = (TextView) view.findViewById(R.id.list_attention);
        mtopicImage.setImageResource(message.getImageId());
        mtopic.setText(message.getTopic());
        mquestion.setText(message.getQuestion());
        manswer.setText(message.getAnswer());
        magree.setText(message.getAgree());
        mcomment.setText(message.getComment());
        mattention.setText(message.getAttention());
        return view;

    }
}
