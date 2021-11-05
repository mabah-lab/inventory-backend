package com.daralab.inventaire.dao;

import com.daralab.inventaire.model.Stocktaking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocktakingRepository extends JpaRepository<Stocktaking,Long> {
}
