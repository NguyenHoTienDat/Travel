package com.example.dattienbkhn.travel.network.message.city;

/**
 * Created by dattienbkhn on 08/02/2018.
 */

public class CityResponse<T> {
    private T data;
    private String mes;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
