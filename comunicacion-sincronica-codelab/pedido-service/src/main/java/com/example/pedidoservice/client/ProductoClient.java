package com.example.pedidoservice.client;

import com.example.pedidoservice.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "producto-service")
public interface ProductoClient {

    @GetMapping("/productos")
    List<ProductoDTO> obtenerProductos();

}