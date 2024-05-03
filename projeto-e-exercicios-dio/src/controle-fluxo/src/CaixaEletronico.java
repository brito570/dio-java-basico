public class CaixaEletronico {

    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        
        saldo = saldo - valorSolicitado;

        if(valorSolicitado < saldo)
            System.out.println("Novo saldo " + saldo);
 
        else    
            System.out.println("Saldo insuficiente");

    }
    
}
