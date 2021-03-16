package coom.hans.cloud.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: hans
 * @Date: 2021/3/14 17:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private Integer statusCode;
    private String message;
    private Object data;
}
