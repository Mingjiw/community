package com.wjs.community.dto;

import com.wjs.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
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
    private User user;
}
