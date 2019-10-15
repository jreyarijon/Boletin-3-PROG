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
public class CorreccionBol3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciamos os obxectos
        //Obxecto con contructor sen valores------------------------------------
        Consumo obxConsumo1 = new Consumo();
        obxConsumo1.amosar();
        //litros = 50 pGas=1,57-------------------------------------------------
        obxConsumo1.setLitros(50);
        obxConsumo1.setPGas(1.57f);
        obxConsumo1.amosar();
        //EXEMPLO DE VALORES
        Consumo obxConsumo2 = new Consumo(30,50,90.4f,7.3f);
        //Chamo ó método consumoMedio mediante o obxecto obxConsumo2
        float valor = obxConsumo2.consumoMedio();
        System.out.println("Consumo medio ="+ valor);
        //Cambio os libros do obx.2 a 10
        obxConsumo2.setLitros(10);
        obxConsumo2.amosar();
        //Calcula a velocidade media do obx2
        float var = obxConsumo2.getVMed();
        System.out.println("Velocidade media ="+ var);
    }
    
}
