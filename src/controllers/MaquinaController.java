package controllers;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import models.Maquina;

public class MaquinaController {
    public Stack<Maquina> filtrarPorSubRed(List<Maquina> maquinas,int umbral){
        Stack<Maquina> maquinas2=new Stack<>();
        for (Maquina maquinas1 : maquinas) {
            if(maquinas1.getSubred()>100){
                maquinas2.add(maquinas1);
            }
        }
        return maquinas2;
    }
    public Set<Maquina> ordenarPorSubRed(Stack<Maquina> pila){
       return new TreeSet<>(pila);
       
    }
    public Map<Integer,Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas){
        Map<Integer,Queue<Maquina>> maquinas1=new TreeMap<>();
        Queue<Maquina> maquinaCola= new Queue<>();
        for(Maquina maquina4: maquinas){
            maquinaCola.add(maquina4);
        }

        for (Maquina maquinas2 : maquinas) {
            maquinas1.put(maquinas2.getRiesgo(), maquinaCola);
        }
        return maquinas1;
    }
    public Stack<Maquina> explotarGrupo(Map<Integer,Queue<Maquina>> mapa){
        return null;
    }

}
