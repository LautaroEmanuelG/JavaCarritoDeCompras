package com.cdf.ProyectoThyleaf.Controllers;


import com.cdf.ProyectoThyleaf.Moduls.Producto.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")

public class UsuarioController {
    @GetMapping("")
    public String usuario(Model model){
        String saludo = "Hola como esta familia";
        Date fecha = new Date();

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Manzana","https://imgs.search.brave.com/t0EyvlqLWe3J7cPBikIGFtuydN1-Qf3-EmZ9c3K2IvA/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9pbWcu/ZnJlZXBpay5jb20v/Zm90b3MtcHJlbWl1/bS9tYW56YW5hLXJv/amEtZ290YXMtYWd1/YV83NzcwNzgtMTE5/OTcuanBnP3NpemU9/NjI2JmV4dD1qcGc",100));
        productos.add(new Producto("Naranja","https://imgs.search.brave.com/LzENhtMhxenbunaLpWeL8Gab31zSEx5JNIR0walZblE/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9pbWcu/ZnJlZXBpay5jb20v/Zm90b3MtcHJlbWl1/bS9mcnV0YS1uYXJh/bmphLWhvamFzLXBh/cmVkLWJsYW5jYV8y/NTM5ODQtMzM1NC5q/cGc_c2l6ZT02MjYm/ZXh0PWpwZw",150));
        productos.add(new Producto("Uva","https://imgs.search.brave.com/_tvOhdLbo6vSRHansCEKSHIK5Yi3SPXWWROWNANoDSY/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5nZXR0eWltYWdl/cy5jb20vaWQvNDcx/NDE5NzU5L2VzL2Zv/dG8vdXZhLmpwZz9z/PTYxMng2MTImdz0w/Jms9MjAmYz1hSHBr/bEIwMnl3OGFILU1X/SUxROFlGYTlEdkd0/dXJSZFhGbXhiblhJ/UUJnPQ",900));

        model.addAttribute("saludo",saludo);
        model.addAttribute("fecha",fecha);
        model.addAttribute("frutas",productos);
        return "index";
    }
}
