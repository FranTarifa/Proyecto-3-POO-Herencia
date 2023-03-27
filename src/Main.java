import entidades.*;

public class Main {
    public static void main(String[] args) {

        Lacteo lacteo1 = new Lacteo("Yogurt", 100.0, 200, 5);
        Lacteo lacteo2 = new Lacteo("Queso", 150.0, 500, 10);
        Fruta fruta1 = new Fruta("Manzana", 500.0, 0.2, "Rojo");
        Fruta fruta2 = new Fruta("Banana", 600.0, 0.1, "Amarillo");
        Limpieza limpieza1 = new Limpieza("Jabón líquido", 800.0, "Aloe Vera", 0.5);
        Limpieza limpieza2 = new Limpieza("Detergente", 500.0, "Lavanda", 1.0);
        NoPerecible noPerecible1 = new NoPerecible("Arroz", 150.0, 500, 200);
        NoPerecible noPerecible2 = new NoPerecible("Fideos", 200.0, 400, 150);


        Producto[] productos = {lacteo1, lacteo2, fruta1, fruta2, limpieza1, limpieza2, noPerecible1, noPerecible2};

        for (Producto producto : productos) {
            System.out.println("================================");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println(producto.toString());
        }
    }
}