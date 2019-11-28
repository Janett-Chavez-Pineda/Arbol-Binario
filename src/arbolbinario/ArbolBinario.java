
package arbolbinario;

public class ArbolBinario {

    public static void main(String[] args) {
    Arbol ar = new  Arbol ( 23 );
    Nodo nuevo = new  Nodo ( 14 );
    ar . agregar (nuevo, ar . getRaiz ());
    ar . recorrerPreorden (ar . getRaiz ());
    }

    
}
