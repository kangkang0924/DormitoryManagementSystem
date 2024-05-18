package com.example.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 报修单
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@TableName(value = "score")
public class Score {

    @TableId(value = "id")
    private Integer id;
    @TableField("scoreer")
    private String scoreer;
    @TableField("dormbuild_id")
    private int dormBuildId;
    @TableField("dormroom_id")
    private int dormRoomId;
    @TableField("title")
    private String title;
    @TableField("content")
    private String content;
    @TableField("state")
    private String state;
    @TableField("order_buildtime")
    private String orderBuildTime;
    @TableField("order_finishtime")
    private String orderFinishTime;
}