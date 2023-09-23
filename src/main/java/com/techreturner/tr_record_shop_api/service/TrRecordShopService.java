package com.techreturner.tr_record_shop_api.service;

import com.techreturner.tr_record_shop_api.model.Album;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TrRecordShopService {
    List<Album> getAllAlbums();

}
