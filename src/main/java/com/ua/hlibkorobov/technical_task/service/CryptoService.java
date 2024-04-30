package com.ua.hlibkorobov.technical_task.service;

import com.ua.hlibkorobov.technical_task.dto.CryptoDTO;

public interface CryptoService {

    CryptoDTO getMarkPrice(String symbol);
}
