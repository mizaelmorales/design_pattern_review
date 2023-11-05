import java.util.HashMap;
import java.util.Map;

public class Almacenamiento {
    private static Map<String, Producto> productosAlmacenados = new HashMap<>();

    public static Producto obtenerProducto(String clave) {
        return productosAlmacenados.get(clave);
    }

    public static void almacenarProducto(String clave, Producto producto) {
        productosAlmacenados.put(clave, producto);
    }
}
-----------------
public abstract class CreadorDeProductos {
    public abstract Producto crearProducto(String clave);

    public Producto obtenerProducto(String clave) {
        Producto producto = Almacenamiento.obtenerProducto(clave);
        if (producto == null) {
            producto = crearProducto(clave);
            Almacenamiento.almacenarProducto(clave, producto);
        }
        return producto;
    }
}

------------
public class CreadorDePaquetes extends CreadorDeProductos {
    @Override
    public Producto crearProducto(String clave) {
        return new Paquete();
    }
}

public class CreadorDeCartas extends CreadorDeProductos {
    @Override
    public Producto crearProducto(String clave) {
        return new Carta();
    }
}

-----------
public class Main {
    public static void main(String[] args) {
        CreadorDeProductos creadorDePaquetes = new CreadorDePaquetes();
        Producto paquete1 = creadorDePaquetes.obtenerProducto("paquete");
        paquete1.enviar();

        Producto paquete2 = creadorDePaquetes.obtenerProducto("paquete");
        paquete2.enviar(); // Reutiliza la instancia anterior

        CreadorDeProductos creadorDeCartas = new CreadorDeCartas();
        Producto carta1 = creadorDeCartas.obtenerProducto("carta");
        carta1.enviar();

        Producto carta2 = creadorDeCartas.obtenerProducto("carta");
        carta2.enviar(); // Reutiliza la instancia anterior
    }
}

