/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notafiscal;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class TesteNotaFiscal {
    
    public static void main(String[] args) {
        
        ItensNotaFiscal nf = new ItensNotaFiscal(0, 0, " ", 0);
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Digite o codigo do item \n"
                + "1 - café \n"
                + "2 - leite \n"
                + "3 - ração pra gato \n"
                + "4 - gato \n");
        nf.setItem(tec.nextInt());
        
        System.out.println("Digite a quantidade do produto");
        nf.setQuantidadeItem(tec.nextInt());
        
        System.out.println("Digite a descrição do protudo");        
        nf.setDescricao(tec.next());
        
        System.out.println("Digite o valor do produto");
        nf.setValor(tec.nextDouble());
        
        System.out.println(nf.toString());
                
    }
    
}
