package com.InventarioBicicletas.LAG_Inventario.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BicicletaDTO {
    private Long id;

    private String marca;

    private String modelo;

    private String color;

    private String tipo;

    private Double precio;

    private String categoria;

    private int stock;
}