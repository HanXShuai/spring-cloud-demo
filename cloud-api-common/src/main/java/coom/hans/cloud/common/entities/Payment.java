package coom.hans.cloud.common.entities;

import lombok.Data;

/**
 * @Author: hans
 * @Date: 2021/3/14 17:36
 */
@Data
public class Payment {
    private Long id;
    private String serial;
    private String description;
}
