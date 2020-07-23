package com.eleven.rick.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RickResult<T> {
    private String code;
    private String msg;
    private Boolean success;
    private T data;

    public static <T> RickResult<T> success(T data){
        return new RickResult("200", "请求成功", true, data);
    }
}
