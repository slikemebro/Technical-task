package com.ua.hlibkorobov.technical_task.controler;

import com.ua.hlibkorobov.technical_task.dto.CryptoDTO;
import com.ua.hlibkorobov.technical_task.service.CryptoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/api/v1/crypto-price")
@RequiredArgsConstructor
@Log4j2
public class CryptoPriceController {

    private final CryptoService cryptoService;

    @GetMapping("/mark-price")
    public ResponseEntity<CryptoDTO> getMarkPrice(@RequestParam(required = false) String symbol) {
        log.info("get mark price for: {}", symbol);
        return new ResponseEntity<>(cryptoService.getMarkPrice(symbol), OK);
    }

}