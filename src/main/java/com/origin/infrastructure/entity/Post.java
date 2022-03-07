package com.origin.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author brian
 * @since 2021-11-29
 */
@Data
//@EqualsAndHashCode(callSuper = true)
//@Accessors(chain = true)
@TableName("m_post")
public class Post extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 摘要
     */
    private String description;

    /**
     * 内容
     */
    private String content;

    /**
     * 编辑模式：html可视化，markdown ..
     */
    private String editMode;

    private String categoryId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 支持人数
     */
    private Integer voteUp;

    /**
     * 反对人数
     */
    private Integer voteDown;

    /**
     * 访问量
     */
    private Integer viewCount;

    /**
     * 评论数量
     */
    private Integer commentCount;

    /**
     * 是否为精华
     */
    private Boolean recommend;

    /**
     * 置顶等级
     */
    private Integer level;

    /**
     * 创建日期 TODO
     */
    private LocalDateTime createdTime;

    /**
     * 最后更新日期 TODO
     */
    private LocalDateTime modifiedTime;


}
