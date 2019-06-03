package com.cskaoyan.meetfilm.bean.resultvo;

import com.cskaoyan.meetfilm.bean.banner.Banner;
import com.cskaoyan.meetfilm.bean.film.Films;

import java.util.List;

/**
 * @author czy
 * @date 2019/6/3 20:07
 */
public class IndexData {
    private List<Banner> banners;
    private List<Films> hotFilms;
    private List<Films> soonFilms;
    private List<Films> boxRanking;
    private List<Films> expectRanking;
    private List<Films> top100;

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public List<Films> getHotFilms() {
        return hotFilms;
    }

    public void setHotFilms(List<Films> hotFilms) {
        this.hotFilms = hotFilms;
    }

    public List<Films> getSoonFilms() {
        return soonFilms;
    }

    public void setSoonFilms(List<Films> soonFilms) {
        this.soonFilms = soonFilms;
    }

    public List<Films> getBoxRanking() {
        return boxRanking;
    }

    public void setBoxRanking(List<Films> boxRanking) {
        this.boxRanking = boxRanking;
    }

    public List<Films> getExpectRanking() {
        return expectRanking;
    }

    public void setExpectRanking(List<Films> expectRanking) {
        this.expectRanking = expectRanking;
    }

    public List<Films> getTop100() {
        return top100;
    }

    public void setTop100(List<Films> top100) {
        this.top100 = top100;
    }

    @Override
    public String toString() {
        return "IndexData{" +
                "banners=" + banners +
                ", hotFilms=" + hotFilms +
                ", soonFilms=" + soonFilms +
                ", boxRanking=" + boxRanking +
                ", expectRanking=" + expectRanking +
                ", top100=" + top100 +
                '}';
    }
}
