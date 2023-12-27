package com.cdf.ProyectoThyleaf.Controllers;


import com.cdf.ProyectoThyleaf.Moduls.CarritoCompra;
import com.cdf.ProyectoThyleaf.Moduls.Cliente.ClienteRegular;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Comestible;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Electronico;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Producto;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Ropa;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
@SessionAttributes({"comidas", "electronicos", "ropas"})

public class UsuarioController {

    ClienteRegular anonimo = new ClienteRegular("anonimo");

    CarritoCompra carritoAnonimo = new CarritoCompra(anonimo);
        double getPrecioCarrito(){
            carritoAnonimo.mostrarProductos();
            return carritoAnonimo.calcularTotal();
        }

    @Autowired
    private List<Comestible> comidas;

    @Autowired
    private List<Electronico> electronicos;

    @Autowired
    private List<Ropa> ropas;


    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
    @PostMapping("/addToCarrito")
    public String addToCarrito(@RequestParam("productId") int productId, Model model, HttpServletRequest request) {
        Producto producto = encontrarProductoPorId(productId);
        addToCart(producto); // Agrega el producto al carrito
        model.addAttribute("ropas", ropas);
        // Obtener la URL actual
        String referer = request.getHeader("Referer");

        // Redirigir de vuelta a la URL actual
        return "redirect:" + referer;
    }

    private Producto encontrarProductoPorId(int productId) {
        // Implementa la lógica para encontrar el producto por su ID
        // Buscar en la lista de comidas
        for (Comestible comida : comidas) {
            if (comida.getId() == productId) {
                return comida;
            }
        }

        // Buscar en la lista de electronicos
        for (Electronico electronico : electronicos) {
            if (electronico.getId() == productId) {
                return electronico;
            }
        }

        // Buscar en la lista de ropas
        for (Ropa ropa : ropas) {
            if (ropa.getId() == productId) {
                return ropa;
            }
        }

        // Si no se encuentra el producto, puedes lanzar una excepción o devolver null
        throw new IllegalArgumentException("Producto no encontrado con ID: " + productId);
    }

    private void addToCart(Producto producto) {
        carritoAnonimo.agregarProducto(producto);
    }

    @GetMapping("/ropa")
    public String home(Model model){
        model.addAttribute("ropas", ropas);
        return "Ropa";
    }
    @GetMapping("/electronico")
    public String mapElectronico(Model model){
        model.addAttribute("electronicos", electronicos);
        return "electronico";
    }
    @GetMapping("/comida")
    public String mapComida(Model model){
        model.addAttribute("comidas", comidas);
        return "comestible";
    }
    @GetMapping ("/carrito")
    public String carrito(Model model){
        model.addAttribute("carrito", carritoAnonimo.getProductos());
        model.addAttribute("total", getPrecioCarrito());
        return "carrito";
    }
}
