public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 10;
        
        if(nota >= 7)           
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7 )
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");


        int nota2 = 7;
        String resultado = nota2 >7 ? "Aprovado" : nota2 >=5 && nota2 <=7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

     }
}
    

