package com.origin.infrastructure.vo;

import com.origin.infrastructure.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class PostVo extends Post {

    private String authorId;

    private String authorName;

    private String authorAvatar;

    private String categoryName;

    private LocalDateTime createdTime;

    private LocalDateTime modifiedTime;
}
