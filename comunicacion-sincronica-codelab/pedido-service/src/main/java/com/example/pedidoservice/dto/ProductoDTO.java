package com.example.pedidoservice.dto;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter



public class ProductoDTO {
    private Long id;
    private String nombre;
    private Double precio;

    public ProductoDTO() {} // ← Agrega esto


    @Override
    public String toString() {
        return "ProductoDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
