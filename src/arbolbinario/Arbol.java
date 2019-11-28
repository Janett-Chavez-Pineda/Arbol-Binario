package arbolbinario;

public class Arbol {
    private Nodo raiz;
    
    public Arbol(Nodo raiz)  {
        this.raiz = raiz;
        
    }

    Arbol(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void agregar (Nodo nodo, Nodo raiz) {
        if(raiz == null){
            this.setRaiz(nodo);
            
        } else {
             if (nodo.getDato () <= raiz.getDato ()) {
                if(raiz.getIzdo() == null){
                    raiz.setIzdo(nodo);
                }else{
                agregar(nodo, raiz.getIzdo());
            }
        }
    }
    }
    public void agregarNodo(Nodo nodo){
        this.agregar(nodo, this.raiz);
    }
    
    public void recorrerPreorden(Nodo nodo){
        if (nodo == null) {
            return;
    } else{
            System.out.println("Dato "+ nodo.getDato());
        }
    }
    public void recorrerPostorden(Nodo nodo) {
        if (nodo == null){
        return;
        } else {
            recorrerPostorden(nodo.izdo);
            recorrerPostorden(nodo.dcho);
            System.out.println("Dato: " + nodo.getDato());
        } 
        
    }
    
    public void Inorden(Nodo nodo){
        if(nodo == null){
            return;
        } else {
            Inorden(nodo.getIzdo());
            System.out.println("Dato: " + nodo.getDato());
            Inorden(nodo.dcho);
        }
    }
}