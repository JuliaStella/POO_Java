public class ExecicioUdemy35{
   Double nota01; 
   Double nota02; 
 
   // criação do método para a leitura do atributos.
   // this corresponde corresponde ao objeto que está chamando o método naquele momento.
   void mostrarDados(){
    System.out.printf("A pkrimeira nota %.2f e segunda nota %.2f", this.nota01, this.nota02);
  }
}