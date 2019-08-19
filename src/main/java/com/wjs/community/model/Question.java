package com.wjs.community.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private int creator;
    private Long gmtCreate;
    private Long gmtModified;
    private int commentCount;
    private int viewCount;
    private int likeCount;
    private String tag;
}
