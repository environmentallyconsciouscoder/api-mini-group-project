package com.techreturner.tr_record_shop_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    int id;

    @Column
    String title;

    @Column
    String artist;

    @Column
    int releaseYear;

    @Column
    Genre genre;

    @Column
    int stock;
}
