package edu.lucas.primeirasemana;
public class MinhaClasse {


    public static void main(String[] args) {

        System.out.println("Olá, turma! Sejão bem vindos!");

        String primeiroNome = "Lucas";
        String segundoNome = "Alves";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }


    public static String nomeCompleto (String primeiroNome, String sobreNome) {
        return "Meu nome é " + primeiroNome.concat(" ").concat(sobreNome);


    }
    
}
