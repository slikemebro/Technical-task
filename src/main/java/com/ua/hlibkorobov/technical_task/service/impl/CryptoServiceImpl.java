package com.ua.hlibkorobov.technical_task.service.impl;

import com.ua.hlibkorobov.technical_task.dto.CryptoDTO;
import com.ua.hlibkorobov.technical_task.exception.InvalidSymbolException;
import com.ua.hlibkorobov.technical_task.service.CryptoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@RequiredArgsConstructor
@Service
public class CryptoServiceImpl implements CryptoService {

    private static final String BINANCE_API_URL = "https://fapi.binance.com/fapi/v1/premiumIndex";
    private final RestTemplate restTemplate;

    @Override
    public CryptoDTO getMarkPrice(String symbol) {
        String url = BINANCE_API_URL;
        if (symbol != null && !symbol.isEmpty()) {
            url += "?symbol=" + symbol;
        } else {
            throw new InvalidSymbolException("Invalid symbol");
        }

        ResponseEntity<CryptoDTO> responseEntity = restTemplate.getForEntity(url, CryptoDTO.class);
        return responseEntity.getBody();
    }
}
