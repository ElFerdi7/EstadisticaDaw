package net.ausiasmarch.estadistica.utils;

import java.util.Comparator;
import net.ausiasmarch.estadistica.modelo.Ciudad;

/**
 * NombreCiudadComparator.java
 *
 * @author Luis
 */
public class NombreCiudadComparator implements Comparator<Ciudad> {
  
    /**
     * Compara dos nombres de ciudad
     * @param c1
     * @param c2
     */ 
    @Override
    public int compare(Ciudad c1, Ciudad c2) {
        return c1.getNombre().compareToIgnoreCase(c2.getNombre());
    }
}
