package com.ys.mapservice.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class TBanner {
    private Integer bannerId;

    private String bannerTitle;

    private String bannerImg;

    private String bannerUrl;

    private Date cateTime;
}