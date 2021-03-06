package com.example.logapro.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long price;
    private Long count;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
}
