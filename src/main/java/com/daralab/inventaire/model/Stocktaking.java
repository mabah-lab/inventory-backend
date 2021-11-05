package com.daralab.inventaire.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
@EqualsAndHashCode
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString
public class Stocktaking implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private Boolean clearance;
    @ManyToOne
    private EquipementEq equipementEq;
    @Column(length = 30)
    private String user;
    @ManyToOne
    private Location location;
    @Column(nullable = false)
    private int floor;
    @Column(nullable = false)
    private int officeNumber;
    @Column(length = 17)
    private String ipaddress;
    @Column(length = 5)
    private String socket;
    @Column(length = 10)
    private String rack;
    @Column(nullable = false)
    private LocalDate dateInstall;

}
