package com.additives.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "long_name")
    private String longName;

    @Column(name = "trade_mark")
    private String tradeMark;

    @Column(name = "producing_factory")
    private String producingFactory;

    @Column(name = "producing_country")
    private String producingCountry;

    @Column(name = "composition")
    private String composition;

    @Column(name = "e_additives")
    private String eAdditives;

    @Column(name = "other_additives")
    private String otherAdditives;

    @Column(name = "term_and_conditions_storage")
    private String termAndConditionsStorage;

    @Column(name = "product_weight")
    private Float productWeight;

    @Column(name = "protein")
    private Float protein;

    @Column(name = "fat")
    private Float fat;

    @Column(name = "carbohydrate")
    private Float carbohydrate;

    @Column(name = "calorie_content")
    private Float CalorieContent;

    @Column(name = "standards")
    private String standards;

    @Column(name = "barcode")
    private String barcode;
}