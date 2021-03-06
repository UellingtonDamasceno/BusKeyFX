/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uefs.ecomp.buskeyfx.util;

import br.uefs.ecomp.buskeyfx.model.Pagina;
import java.util.Comparator;

/**
 *
 * @author Uellington Damasceno
 */
public class PaginaComparatorMaiorOcorrencia implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Pagina aComparar = (Pagina) o1;
        Pagina comparada = (Pagina) o2;
        return aComparar.getOcorrencia() - comparada.getOcorrencia();
    }
    
}
