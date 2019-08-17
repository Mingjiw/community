package com.wjs.community.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
}
