package com.techreturner.tr_record_shop_api.repository;

import com.techreturner.tr_record_shop_api.model.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrRecordShopRepository extends CrudRepository<Album, Integer> {

}

