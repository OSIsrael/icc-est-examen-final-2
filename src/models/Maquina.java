package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maquina implements Comparable<Maquina> {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int  subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = new ArrayList<Integer>();
        this.subred=agarrarSubred(ip);
        this.riesgo=obtenerRiesgo(nombre, codigos);
        
    }
    private int  agarrarSubred(String ip){
        String[] subred1=ip.split("\\.");
        return Integer.parseInt(subred1[2]);
    }
    private int obtenerRiesgo(String nombre, List<Integer> codigos){
        int suma=0;
       Set<Character> nombre1=new HashSet<>();
       for (Character nomCharacter : nombre.toCharArray()) {
            nombre1.add(nomCharacter);
       }
       int numCharUnioco=nombre1.size();
       for (int numero : codigos) {
            if(numero%5==0){
                suma=suma+numero;
            }
       }
       return suma*numCharUnioco;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
    @Override
    public String toString() {
        return "[Nombre=" + nombre + ", Ip=" + ip + ", Codigos=" + codigos + ", Subred=" + subred + ", Riesgo="
                + riesgo + "]\n";
    }

    @Override
    public int compareTo(Maquina o) {
        throw new UnsupportedOperationException("Not supported yet.");
        
        
    }
    

   
    
}
