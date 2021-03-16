package coom.hans.cloud.common.entities;

import lombok.Data;

/**
 * @Author: hans
 * @Date: 2021/3/14 17:55
 */
@Data
public class CommonResult {
    private Integer statusCode;
    private String message;
    private Object data;
}
