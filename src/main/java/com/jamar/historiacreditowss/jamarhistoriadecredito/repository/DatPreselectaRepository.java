/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.repository;

import com.jamar.historiacreditowss.jamarhistoriadecredito.entities.DatPreselecta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jleira
 */
@Repository
public interface DatPreselectaRepository  extends JpaRepository<DatPreselecta, Long>{
    
}
