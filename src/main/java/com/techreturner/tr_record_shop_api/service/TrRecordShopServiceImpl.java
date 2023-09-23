package com.techreturner.tr_record_shop_api.service;

import com.techreturner.tr_record_shop_api.model.Album;
import com.techreturner.tr_record_shop_api.repository.TrRecordShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrRecordShopServiceImpl implements TrRecordShopService {

    @Autowired
    TrRecordShopRepository trRecordShopRepository;

    @Override
    public List<Album> getAllAlbums() {
        List<Album> albums = new ArrayList<>();
        trRecordShopRepository.findAll().forEach(albums::add);
        System.out.println(albums);
        return albums;
    }
}
