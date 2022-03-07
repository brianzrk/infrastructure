package com.origin.infrastructure.entity;

import com.origin.infrastructure.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
//@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("m_comment")
public class Comment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 评论的内容
     */
    private String content;

    /**
     * 回复的评论ID
     */
    private String parentId;

    /**
     * 评论的内容ID
     */
    private String postId;

    /**
     * 评论的用户ID
     */
    private String userId;

    /**
     * “顶”的数量
     */
    private Integer voteUp;

    /**
     * “踩”的数量
     */
    private Integer voteDown;

    /**
     * 置顶等级
     */
    private Integer level;

    /**
     * 评论的时间
     */
    private LocalDateTime createdTime;

    /**
     * 评论的更新时间
     */
    private LocalDateTime modifiedTime;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    public Integer getVoteDown() {
        return voteDown;
    }

    public void setVoteDown(Integer voteDown) {
        this.voteDown = voteDown;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    @Override
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    @Override
    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
