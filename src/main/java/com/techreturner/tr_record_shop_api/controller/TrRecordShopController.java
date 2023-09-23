package com.techreturner.tr_record_shop_api.controller;


import com.techreturner.tr_record_shop_api.model.Album;
import com.techreturner.tr_record_shop_api.service.TrRecordShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/album")
public class TrRecordShopController {

    @Autowired
    TrRecordShopService trRecordShopService;

    @GetMapping
    public ResponseEntity<List<Album>> getAllAlbums() {
        List<Album> albums = trRecordShopService.getAllAlbums();
        return new ResponseEntity<>(albums, HttpStatus.OK);
    }
}
