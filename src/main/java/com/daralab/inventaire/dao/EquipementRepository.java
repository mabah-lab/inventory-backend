package com.daralab.inventaire.dao;

import com.daralab.inventaire.model.EquipementEq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipementRepository extends JpaRepository<EquipementEq, Long> {
}
