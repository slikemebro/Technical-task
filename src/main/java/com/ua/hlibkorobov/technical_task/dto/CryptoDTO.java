package com.ua.hlibkorobov.technical_task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CryptoDTO {

    @JsonProperty(value = "symbol")
    private String name;

    @JsonProperty(value = "markPrice")
    private String markPrice;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CryptoDTO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", markPrice='").append(markPrice).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
