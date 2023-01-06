package org.africalib.gallery.backend.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(name = "img_Path",length = 100)
    private String imgPath;

    private int price;

    @Column(name = "discount_per")
    private int discountPer;
}
