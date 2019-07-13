package com.twelve.dtos;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by wang0 on 2016/9/13.
 */
@Getter
@Setter
public class RecordsDto {
    private String name;
    private StringBuilder totaltime;
    private Integer buqian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuilder getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(StringBuilder totaltime) {
        this.totaltime = totaltime;
    }

    public Integer getBuqian() {
        return buqian;
    }

    public void setBuqian(Integer buqian) {
        this.buqian = buqian;
    }
}
