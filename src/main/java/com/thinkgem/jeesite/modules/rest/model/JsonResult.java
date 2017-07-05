package com.thinkgem.jeesite.modules.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/5.
 */
public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean success;
    private T returnValue;
    private int errorCode;
    private String errorReason = "";

    /**
     * 接口调用是否成功
     * @return
     */
    @JsonProperty("success")
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * 接口返回的内容
     * @return
     */
    @JsonProperty("returnValue")
    public T getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(T returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * 错误码
     * @return
     */
    @JsonProperty("errorCode")
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 错误原因
     * @return
     */
    @JsonProperty("errorReason")
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

}
