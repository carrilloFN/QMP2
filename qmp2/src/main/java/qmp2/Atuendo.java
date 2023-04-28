package qmp2;

import java.util.Set;

public class Atuendo {
    private Set<Prenda> accesorios;
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;

    public void agregarPrenda(Prenda prendaNueva){
        this.listaDePrendas.add(prendaNueva);
    }

    public void quitarPrenda(Prenda otraPrenda){
        this.listaDePrendas.remove(otraPrenda);
    }
}
