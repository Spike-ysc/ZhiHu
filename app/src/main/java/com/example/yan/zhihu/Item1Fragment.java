package com.example.yan.zhihu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Item1Fragment extends Fragment {
    private List<ListMessage> messagesList = new ArrayList<>();


    public Item1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_item1, container, false);
        initMessage();
        MessageAdapter adapter = new MessageAdapter(getActivity(), R.layout.layout_list, messagesList);
        ListView listView = (ListView) view.findViewById(R.id.main_ltem);
        listView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }


    private void initMessage(){
        ListMessage frist = new ListMessage(R.drawable.topic, "来自话题",
                "为什么机器学习的框架都偏向于python",

                "阿加莎·玛丽·克莱丽莎·克里斯蒂女爵士(1890年9月15日－1976年1月12日），\n" +
                        "        另外又称马洛温爵士夫人，是英国侦探小说作家。玛丽·维斯马科特则是她写浪漫爱情小说所用的笔名。"
                , "230赞同· ","68评论· ","关注问题");
        messagesList.add(frist);
        ListMessage second = new ListMessage(R.drawable.topic, "来自话题",
                "为什么机器学习的框架都偏向于python",

                "阿加莎·玛丽·克莱丽莎·克里斯蒂女爵士(1890年9月15日－1976年1月12日），\n" +
                        "        另外又称马洛温爵士夫人，是英国侦探小说作家。玛丽·维斯马科特则是她写浪漫爱情小说所用的笔名。"
                , "230赞同· ","68评论· ","关注问题");
        messagesList.add(second);
        ListMessage third = new ListMessage(R.drawable.topic, "来自话题",
                "为什么机器学习的框架都偏向于python",

                "阿加莎·玛丽·克莱丽莎·克里斯蒂女爵士(1890年9月15日－1976年1月12日），\n" +
                        "        另外又称马洛温爵士夫人，是英国侦探小说作家。玛丽·维斯马科特则是她写浪漫爱情小说所用的笔名。"
                , "230赞同· ","68评论· ","关注问题");
        messagesList.add(third);
        ListMessage fourth = new ListMessage(R.drawable.topic, "来自话题",
                "为什么机器学习的框架都偏向于python",

                "阿加莎·玛丽·克莱丽莎·克里斯蒂女爵士(1890年9月15日－1976年1月12日），\n" +
                        "        另外又称马洛温爵士夫人，是英国侦探小说作家。玛丽·维斯马科特则是她写浪漫爱情小说所用的笔名。"
                , "230赞同· ","68评论· ","关注问题");
        messagesList.add(fourth);
        ListMessage fiveth = new ListMessage(R.drawable.topic, "来自话题",
                "为什么机器学习的框架都偏向于python",

                "阿加莎·玛丽·克莱丽莎·克里斯蒂女爵士(1890年9月15日－1976年1月12日），\n" +
                        "        另外又称马洛温爵士夫人，是英国侦探小说作家。玛丽·维斯马科特则是她写浪漫爱情小说所用的笔名。"
                , "230赞同· ","68评论· ","关注问题");
        messagesList.add(fiveth);
        ListMessage sixth = new ListMessage(R.drawable.topic, "来自话题",
                "为什么机器学习的框架都偏向于python",

                "阿加莎·玛丽·克莱丽莎·克里斯蒂女爵士(1890年9月15日－1976年1月12日），\n" +
                        "        另外又称马洛温爵士夫人，是英国侦探小说作家。玛丽·维斯马科特则是她写浪漫爱情小说所用的笔名。"
                , "230赞同· ","68评论· ","关注问题");
        messagesList.add(sixth);
    }

}
