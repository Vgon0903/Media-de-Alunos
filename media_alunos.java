package exemplos;
import java.util.Scanner;
import java.util.Arrays;

public class media_alunos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Criacao da variaveis
		int soma = 0;
		float media = 0;
		// Criacao do vetor com 6 modulos
		int q[] = new int[6];
		// Laco de repeticao de acordo com tamanho do vetor
		for (int i = 0; i < q.length; i++) {
			// Usuario vai digitar a resposta e depois vai somar 1 na contagem automaticamente
			System.out.printf("Qtd de alunos da sala %d\n", (i + 1));
			// Guarda informação obtida no vetor
			q[i] = sc.nextInt();
			// recebe soma + valor do vetor
			soma = soma + q[i];
			// calculo da media a partir de uma divisao
			media = soma / q.length;
		}
		// Ordenar vetor do maior numero para o menor
		Arrays.sort(q);
		// Criacao variaveis
		int M = q[5];
		int m = q[0];
		
		// Exibir dados obtidos
		System.out.printf("A media de alunos das salas e: %f\n", media);
		System.out.printf("A sala com mais alunos tem %d alunos\n", M);
		System.out.printf("A sala com menos alunos tem %d alunos\n", m);
	}
}