package com.cdf.ProyectoThyleaf.Controllers;

import com.cdf.ProyectoThyleaf.Moduls.Producto.Comestible;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Electronico;
import com.cdf.ProyectoThyleaf.Moduls.Producto.Ropa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiguration {
    List<Comestible> comidas = new ArrayList<>();
    List<Electronico> electronicos = new ArrayList<>();
    List<Ropa> ropas = new ArrayList<>();

    List<Comestible> getListComestible() {
        comidas.add(new Comestible("Manzana", 1, 30.0, "https://imgs.search.brave.com/t0EyvlqLWe3J7cPBikIGFtuydN1-Qf3-EmZ9c3K2IvA/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9pbWcu/ZnJlZXBpay5jb20v/Zm90b3MtcHJlbWl1/bS9tYW56YW5hLXJv/amEtZ290YXMtYWd1/YV83NzcwNzgtMTE5/OTcuanBnP3NpemU9/NjI2JmV4dD1qcGc", "Manzana roja"));
        comidas.add(new Comestible("Naranja", 2, 20.0, "https://imgs.search.brave.com/LzENhtMhxenbunaLpWeL8Gab31zSEx5JNIR0walZblE/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9pbWcu/ZnJlZXBpay5jb20v/Zm90b3MtcHJlbWl1/bS9mcnV0YS1uYXJh/bmphLWhvamFzLXBh/cmVkLWJsYW5jYV8y/NTM5ODQtMzM1NC5q/cGc_c2l6ZT02MjYm/ZXh0PWpwZw", "Naranja jugosa"));
        comidas.add(new Comestible("Uva", 3, 5.0, "https://imgs.search.brave.com/_tvOhdLbo6vSRHansCEKSHIK5Yi3SPXWWROWNANoDSY/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5nZXR0eWltYWdl/cy5jb20vaWQvNDcx/NDE5NzU5L2VzL2Zv/dG8vdXZhLmpwZz9z/PTYxMng2MTImdz0w/Jms9MjAmYz1hSHBr/bEIwMnl3OGFILU1X/SUxROFlGYTlEdkd0/dXJSZFhGbXhiblhJ/UUJnPQ", "Uva negra"));
        comidas.add(new Comestible("Pera", 4, 35.0, "https://imgs.search.brave.com/pZfP6Kq2Z7fxnbYM6X_Vso8XbzC9Z5p9U3v7PEHNa9s/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9zdGF0/aWMubGliZXJ0eXBy/aW0uY29tL2ZpbGVz/L2ZhbWlsbGVzL3Bv/aXJlLWxhcmdlLmpw/Zz8xNTY5MjcxODMw", "Pera verde"));
        comidas.add(new Comestible("Sandía", 5, 70.0, "https://imgs.search.brave.com/9gtEbmXALJSe7DrMuLC5WKGmn-AlU7CnSTU6zk9RJuI/rs:fit:500:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5pc3RvY2twaG90/by5jb20vaWQvMTMy/MTQ0ODAxOS9lcy9m/b3RvL3NhbmQlQzMl/QURhLWp1Z29zYS1t/YWR1cmEtYWlzbGFk/YS1zb2JyZS1mb25k/by1ibGFuY28uanBn/P3M9NjEyeDYxMiZ3/PTAmaz0yMCZjPWFS/WmJKcE92UE1JTDZJ/ckdxNnNCVXU5Zm5M/bG9fV2FLLU91S0VB/RGpBQVE9", "Sandía grande"));
        return comidas;
    }

    List<Electronico> getListElectronico() {
        electronicos.add(new Electronico("Televisor", 6, 10000.0, "https://imgs.search.brave.com/DDIbgjRbhbWuNni87aIPm1pOiJplvhA-KZgOmO91ekQ/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9tdWx0/aXBvaW50LmNvbS5h/ci9JbWFnZS8wLzQ1/MF80NTAtVU42NUJV/ODAwMEdDWkItMi5Q/Tkc", "Samsung"));
        electronicos.add(new Electronico("Laptop", 7, 20000.0, "https://imgs.search.brave.com/ZExw70NJfOdmdSfA1aEW7Vb2Dmyir67WK90IP5HDl1g/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5pc3RvY2twaG90/by5jb20vaWQvMTY0/NjM3MDc5L3Bob3Rv/L2xhcHRvcC5qcGc_/cz02MTJ4NjEyJnc9/MCZrPTIwJmM9S1U1/NEJxQ2wwcmZNNjJW/QlJ2WXZtUG9qWTRN/V29rSXhUYTBRTnJ4/SFF6az0", "HP"));
        electronicos.add(new Electronico("Smartphone", 8, 15000.0, "https://imgs.search.brave.com/1FWh_qDhDawXfeaB0RPvgcQ4oIbVVAAr629JfjJDFc0/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9jb25z/dW1lci5odWF3ZWku/Y29tL2NvbnRlbnQv/ZGFtL2h1YXdlaS1j/Ymctc2l0ZS9jb21t/b24vbWt0L3BscC9w/aG9uZXMtMjAyMzA1/MDkvcC1zZXJpZXMv/cDYwLWFydC5qcGc", "Huawei"));
        return electronicos;
    }

    List<Ropa> getListRopa() {
        ropas.add(new Ropa("Musculosa", 9, 100.0, "https://imgs.search.brave.com/tl-xBI1La_ian5Zx0bH5KWE9CcSiy9PaMYyqfEmRl90/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9hc3Nl/dHMuYWRpZGFzLmNv/bS9pbWFnZXMvd18z/ODMsaF8zODMsZl9h/dXRvLHFfYXV0byxm/bF9sb3NzeSxjX2Zp/bGwsZ19hdXRvLzRm/YmM3MTY1MzMzNjQz/MWRhZDAyYWY2ZDAx/MDgzYWM1XzkzNjYv/bXVzY3Vsb3NhLWFy/Z2VudGluYS10aXJv/LTIzLmpwZw", "S"));
        ropas.add(new Ropa("MusculosaDos", 10, 120.0, "https://imgs.search.brave.com/SOZ_erkB-CtE-hp-viYykj0qoT5-44J_WAKBk8Ikrwk/rs:fit:860:0:0/g:ce/aHR0cDovL2h0dHAy/Lm1sc3RhdGljLmNv/bS9EXzgxODgwMy1N/TEE3MjE0MjQxMTg0/OF8xMDIwMjMtWC5q/cGc", "M"));
        ropas.add(new Ropa("MusculosaTres", 11, 130.0, "https://imgs.search.brave.com/Mer-AMth7HRZwP5oB4dVUzDA2j6qNu5qB6Dp0OmlOSU/rs:fit:860:0:0/g:ce/aHR0cDovL2h0dHAy/Lm1sc3RhdGljLmNv/bS9EXzYzNzU0OC1N/TEE1MTE2OTQ3NDIz/M18wODIwMjItWC5q/cGc", "L"));
        ropas.add(new Ropa("MusculosaCuatro", 12, 140.0, "https://imgs.search.brave.com/QlCfHba2dd4xEqPghBNd6VlHE5plOvNFSt6Oq71CZEU/rs:fit:860:0:0/g:ce/aHR0cDovL2h0dHAy/Lm1sc3RhdGljLmNv/bS9EXzY5MTAxOC1N/TEE1Mzg2MzkwMDg2/Ml8wMjIwMjMtWC5q/cGc", "XL"));
        return ropas;
    }

    @Bean
    @SessionScope
    public List<Comestible> comestibles() {
        return getListComestible();
    }

    @Bean
    @SessionScope
    public List<Electronico> electronicos() {
        return getListElectronico();
    }

    @Bean
    @SessionScope
    public List<Ropa> ropas() {
        return getListRopa();
    }
}

