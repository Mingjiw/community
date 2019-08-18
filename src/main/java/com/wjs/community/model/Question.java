package com.wjs.community.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Question {
    private Integer id;
    private String title;
    private String desciption;
    private int creator;
    private Long gmtCreate;
    private Long gmtModified;
    private int commentCount;
    private int viewCount;
    private int likeCount;
}
