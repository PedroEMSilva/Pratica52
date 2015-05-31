
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        try
        {
            Equacao2Grau teste1 = new Equacao2Grau(1, 1, -100);
            
            double teste1Raiz1, teste1Raiz2;
            
            teste1Raiz1 = teste1.getRaiz1();
            teste1Raiz2 = teste1.getRaiz2();
            
            System.out.println("As raizes são " + teste1Raiz1 + " e " + teste1Raiz2 );
        }catch(RuntimeException e)
        {
            System.err.println(e);
        }
        try
        {
            Equacao2Grau teste2 = new Equacao2Grau(0, 1, -100);
            
            double teste2Raiz1, teste2Raiz2;
            teste2Raiz2 = teste2.getRaiz2();
            
            teste2Raiz1 = teste2.getRaiz1();
            
            System.out.println("As raizes são " + teste2Raiz1 + " e " + teste2Raiz2 );
            
        }catch(RuntimeException e)
        {
            System.err.println(e);
        }
        try
        {
            Equacao2Grau teste3 = new Equacao2Grau(1, 2, 1);
           
            double teste3Raiz1, teste3Raiz2;
 
            teste3Raiz1 = teste3.getRaiz1();
            teste3Raiz2 = teste3.getRaiz2();

            System.out.println("As raizes são " + teste3Raiz1 + " e " + teste3Raiz2 );
        }catch(RuntimeException e)
        {
            System.err.println(e);
        }
        
        
        
    }
}
