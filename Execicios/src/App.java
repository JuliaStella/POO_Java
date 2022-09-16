import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    //Declarando um objeto do tipo  celular = intanciando um objeto, é o  mesmo que criar um novo objeto.

    Aula01POO celularA = new Aula01POO();
    celularA.nome = "Iphone  12";
    celularA.tamanhoTela = 6.1f;
    celularA.espacoarmazenamento = 256;
    celularA.sistemaOperacional = "6.1f";
    
    //Execício da Udemy\
    Locale formtBrasl = new Locale("PT", "BR");
    Locale.setDefault(formtBrasl);
    Scanner alunos = new Scanner(System.in);
        ExecicioUdemy35 notas = new ExecicioUdemy35();

         //System.out.println("Informe a nota 01: ");
         notas.nota01 = alunos.nextDouble();
         //System.out.println("Informe a nota 02: ");
         notas.nota02 = alunos.nextDouble();
         notas.mostrarDados(); // a palavra reseva que seria this, vais ser trocada por notas.
         
        alunos.close();
    
     // A linha abaixo é a mesma coisa que  fazer de um por um dentro do printnl.
    System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s", celularA.nome, celularA.tamanhoTela, celularA.espacoarmazenamento, celularA.sistemaOperacional);  
 }
}
