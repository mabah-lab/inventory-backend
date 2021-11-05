package com.daralab.inventaire.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@EqualsAndHashCode
@Getter @Setter
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Location implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true,nullable = false,length = 25)
    private String Name;
    @Column(nullable = false)
    private int floorNumber;
    @Column(length = 100)
    private String address;
}
