package com.example.yan.zhihu;

/**
 * Created by yan on 2017/3/23.
 */

public class ListMessage {
    private int imageId;
    private String topic;
    private String question;
    private String answer;
    private String agree;
    private String comment;
    private String attention;
    public ListMessage(int imageId, String topic, String question,
                       String answer, String agree, String comment, String attention){
        this.imageId = imageId;
        this.topic = topic;
        this.question = question;
        this.answer = answer;
        this.agree = agree;
        this.comment = comment;
        this.attention = attention;
    }
    public int getImageId(){
        return imageId;
    }
    public String getTopic(){
        return topic;
    }
    public String getQuestion(){
        return  question;
    }
    public String getAnswer(){
        return answer;
    }
    public String getAgree(){
        return agree;
    }
    public String getComment(){
        return comment;
    }
    public String getAttention(){
        return comment;
    }
}
