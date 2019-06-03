package com.cskaoyan.meetfilm.bean.actor;

/**
 * @author czy
 * @date 2019/6/3 16:48
 */
public class Actor {
    private int Uuid;
    private String actorName;
    private String actorImg;

    public int getUuid() {
        return Uuid;
    }

    public void setUuid(int uuid) {
        Uuid = uuid;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorImg() {
        return actorImg;
    }

    public void setActorImg(String actorImg) {
        this.actorImg = actorImg;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Uuid=" + Uuid +
                ", actorName='" + actorName + '\'' +
                ", actorImg='" + actorImg + '\'' +
                '}';
    }
}
