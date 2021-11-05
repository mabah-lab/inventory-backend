package com.daralab.inventaire.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@EqualsAndHashCode
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @ToString
public class Model implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true,nullable = false,length = 25)
    private String Name;
    @ManyToOne
    private Manufacturer manufacturer;
}
