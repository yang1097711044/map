package com.ys.mapservice.utils;


import lombok.Data;

/**
 * @author liuya
 */
@Data
public class Result<T> {
    private String msg;
    private T data;
    private int status;


    public static Result success(Object obj){
        Result result = new Result();
        result.setData(obj);
        result.setMsg(Constants.SUCCESS_MSG);
        result.setStatus(Constants.SUCCESS_STATE_200);
        return result;
    }

    public static Result error() {
        Result result = new Result();
        result.setMsg(Constants.ERROR_MSG);
        result.setStatus(Constants.ERROR_STATE_404);
        return result;
    }

}
