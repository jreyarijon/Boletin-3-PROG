/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccionbol3;

/**
 *
 * @author jreyarijon
 */
public class Consumo {
    //Parametros
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //Constructores
    //Constructor sen parámetros
    public Consumo(){
        //Deixar esto en blanco é o mesmo que km = 0, etc
    }
    
    //Creamos un contructor con parámetros para ponerlle o valor que queramos
    public Consumo (float k,float l,float vM,float pG){
        km = k;
        litros = l;
        vMed = vM;
        pGas = pG;
    }
    //Vamos a crear un método para poder visualizar os valores de cada un
    public void amosar(){
        System.out.println("Km :"+ km+"\nLitros :"+ litros+"\nVelocidade media :"+ vMed+"\nPrecio da gasolina :"+ pGas);
    }   

     //Vamos á clase principal a intanciar os obxectos
     
     //Creamos os métodos de acceso (GETTERS E SETTERS)
    public void setKm(float k){
        km = k;
    }
    public float getKm(){
        return km;
    }
    public void setLitros(float l){
        litros = l;
    }
    public float getLitros(){
        return litros;
    }
    public void setVMed(float vM){
        vMed = vM;
    }
    public float getVMed(){
        return vMed;
    }
    public void setPGas(float pG){
        pGas = pG;
    }
    public float getPGas(){
        return pGas;
    }
    //Todas as variables saben xa os seus valores polo que non fai falta porlle parámetros
    //Nos devolve un float polo que hai que devolvelo cun return float
    public float consumoMedio(){
        float consu = 100*litros/km;
        return consu;
    }
    
            
 }    