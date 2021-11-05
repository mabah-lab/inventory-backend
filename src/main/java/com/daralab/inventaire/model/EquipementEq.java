package com.daralab.inventaire.model;

import com.daralab.inventaire.enumeration.OperatingSystem;
import com.daralab.inventaire.enumeration.SubFamily;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
@EqualsAndHashCode
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EquipementEq implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true,nullable = false, length = 15)
    private String networkName;
    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private SubFamily subFamily;
    @ManyToOne
    private Model model;
    @Column(nullable = false, length = 15)
    private String serialNumber;
    @Column(unique = true,nullable = false,length = 10)
    private String ict;
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private OperatingSystem os;
    private String image;

}
