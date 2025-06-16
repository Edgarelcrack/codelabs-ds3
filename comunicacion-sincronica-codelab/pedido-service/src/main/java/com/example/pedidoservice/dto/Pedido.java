package com.example.pedidoservice.dto;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}