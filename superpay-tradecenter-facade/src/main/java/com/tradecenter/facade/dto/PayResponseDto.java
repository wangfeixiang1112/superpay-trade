package com.tradecenter.facade.dto;

import java.io.Serializable;

public class PayResponseDto implements Serializable {
    //返回码
    private String returnCode;
    //返回信息
    private String returnMsg;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }
}
