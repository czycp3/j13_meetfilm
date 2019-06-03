package com.cskaoyan.meetfilm.bean.banner;

/**
 * @author czy
 * @date 2019/6/3 20:10
 */
public class Banner {
    private int uuid;
    private String bannerAddress;
    private String bannerUrl;
    private int isValid;

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getBannerAddress() {
        return bannerAddress;
    }

    public void setBannerAddress(String bannerAddress) {
        this.bannerAddress = bannerAddress;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "uuid=" + uuid +
                ", bannerAddress='" + bannerAddress + '\'' +
                ", bannerUrl='" + bannerUrl + '\'' +
                ", isValid=" + isValid +
                '}';
    }
}
