import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Ropa camisa = new Ropa("Camisa", 29.99, "M");
//        Electronico laptop = new Electronico("Laptop", 899.99, "Dell");
//        Comestible manzanas = new Comestible("Manzanas", 2.49, "5 unidades");

//        ClienteRegular clienteRegular = new ClienteRegular("Juan");
//        ClientePremium clientePremium = new ClientePremium("Maria");
//
//        CarritoCompra carritoClienteRegular = new CarritoCompra(clienteRegular);
//        CarritoCompra carritoClientePremium = new CarritoCompra(clientePremium);

//        carritoClienteRegular.agregarProducto(camisa);
//        carritoClienteRegular.agregarProducto(laptop);
//        carritoClienteRegular.agregarProducto(manzanas);
//
//        carritoClientePremium.agregarProducto(camisa);
//        carritoClientePremium.agregarProducto(laptop);
//        carritoClientePremium.agregarProducto(manzanas);
//
//        double totalClienteRegular = carritoClienteRegular.calcularTotal();
//        double totalClientePremium = carritoClientePremium.calcularTotal();
//
//        System.out.println("Total para Cliente Regular: $" + totalClienteRegular);
//        System.out.println("Total para Cliente Premium: $" + totalClientePremium);

        //Menu para el cliente, permita agregar productos y realizar compra con swtich
        int input = 0;
        String tipo = "";
        System.out.println("Bienvenido al carrito de compras");
        System.out.println("Ingrese su nombre");
                String nombreCliente = sc.next();

        ClienteRegular clienteRegular = new ClienteRegular(nombreCliente);
        ClientePremium clientePremium = new ClientePremium(nombreCliente);
        CarritoCompra carritoClienteRegular = new CarritoCompra(clienteRegular);
        CarritoCompra carritoClientePremium = new CarritoCompra(clientePremium);
        do{
            System.out.println("1. Agregar producto");
            System.out.println("2. Realizar compra");
            System.out.println("3. Salir");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    String nombre = sc.next();
                    System.out.println("Ingrese el precio del producto");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese el tipo de producto (Ropa, Electronico, Comestible)");
                    tipo = sc.next();
                    System.out.println(tipo);
                    if(tipo.equals("Ropa")){
                        System.out.println("Ingrese la talla de la ropa");
                        String talla = sc.next();
                        Ropa ropa = new Ropa(nombre, precio, talla);
                        carritoClienteRegular.agregarProducto(ropa);
                        carritoClientePremium.agregarProducto(ropa);
                    }else if(tipo.equals("Electronico")){
                        System.out.println("Ingrese la marca del producto");
                        String marca = sc.next();
                        Electronico electronico = new Electronico(nombre, precio, marca);
                        carritoClienteRegular.agregarProducto(electronico);
                        carritoClientePremium.agregarProducto(electronico);
                    }else if(tipo.equals("Comestible")){
                        System.out.println("Ingrese la cantidad del producto");
                        String cantidad = sc.next();
                        Comestible comestible = new Comestible(nombre, precio, cantidad);
                        carritoClienteRegular.agregarProducto(comestible);
                        carritoClientePremium.agregarProducto(comestible);
                    }
                    break;
                case 2:
                    double totalClienteRegular = carritoClienteRegular.calcularTotal();
                    double totalClientePremium = carritoClientePremium.calcularTotal();
                    System.out.println("Total para Cliente Regular: $" + totalClienteRegular);
                    System.out.println("Total para Cliente Premium: $" + totalClientePremium);
//                    System.out.println("Lista de productos agregados");
                    carritoClientePremium.mostrarProductos();


//                    System.out.println("Total para Cliente Regular: $" + carritoClienteRegular.calcularTotal());
//                    System.out.println("Total para Cliente Premium: $" + carritoClientePremium.calcularTotal());
                    System.out.println("Gracias por usar el carrito de compras");
                    input = 3;
                    break;
                case 3:
                    System.out.println("Gracias por usar el carrito de compras");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(input != 3);

    }
}