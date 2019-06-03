package com.cskaoyan.meetfilm.bean.resultvo;

/**
 * @author czy
 * @date 2019/6/3 20:04
 */
public class ResponsVo {
    private int status;
    private String imgPre;
    private IndexData data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public IndexData getData() {
        return data;
    }

    public void setData(IndexData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponsVo{" +
                "status=" + status +
                ", imgPre='" + imgPre + '\'' +
                ", data=" + data +
                '}';
    }
}
