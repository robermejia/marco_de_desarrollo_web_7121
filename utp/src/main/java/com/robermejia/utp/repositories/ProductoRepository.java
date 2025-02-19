package com.robermejia.utp.repositories;

import java.util.ArrayList;
import java.util.List;

import com.robermejia.utp.entities.Producto;

public class ProductoRepository {

    public static List<Producto> productos = new ArrayList<>();

    public static void iniciarProductos(){

        productos.add(new Producto(1000000, "Audifonos", "Sansung", 30.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/16688488/pexels-photo-16688488/free-photo-of-blanco-y-negro-escritorio-ordenador-portatil-oficina.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(2000000, "Disco Duro Externo", "Google", 200.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/20076003/pexels-photo-20076003/free-photo-of-cable-tecnologia-portatil-electronica.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(3000000, "Camara Pro", "Microsoft", 400.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/11002709/pexels-photo-11002709.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(4000000, "Auriculares", "Panasonic", 40.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/3921803/pexels-photo-3921803.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(5000000, "Siri", "Lg", 150.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/1034653/pexels-photo-1034653.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(6000000, "Tarjeta de Video", "Atx", 300.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/4581903/pexels-photo-4581903.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(7000000, "Celular", "Motorola", 800.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/10343717/pexels-photo-10343717.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
        productos.add(new Producto(8000000, "Laptop", "Lenovo", 3200.00, "Lorem ipsum", 
        "https://images.pexels.com/photos/577210/pexels-photo-577210.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", 10));
    }

}
