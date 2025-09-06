package com.InventarioBicicletas.LAG_Inventario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InventarioBicicletas.LAG_Inventario.entity.Bicicleta;

@Repository
public interface BicicletasRepository extends JpaRepository<Bicicleta, Long> {
    List<Bicicleta> findAllByCategoriaIgnoreCase(String categoria);
    List<Bicicleta> findAllByTipoIgnoreCase(String tipo);
}

