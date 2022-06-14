package exemplos;
import java.util.Scanner;

public class branch {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	//criacao vetor
	int soma = 0, q[] = {35,4,22,20,36,30};
	//criacao variaveis
    int M = 0; 
    float media = 0; 

    //laco de repeticao baseado no tamanho do vetor
    for(int i =0; i < q.length; i++) { 
    	//calculo
        soma = soma + q[i];
        //calcula media 
        media = soma / q.length; 

        //estrutura de decisao
        if (q[i] > media) {
        	
            M = q[i];
        }
    }
    //Exibe mensagem e resultado
    System.out.printf("A media de alunos é: %f\n", media); 
    System.out.printf("A maior quantidade de alunos é: %d", M);



}
}