public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        byte idade = 123;
        short ano = 2021;
        int cep = 24463541;
        long cpf = 52024813544L;
        float pi = 3.14F;

        int numero = 5;
        numero = 10;
        
        final double VALOR_DE_PI = 3.14;

        String nome = "João";
        int[] numeros = {1, 2, 3, 4, 5};
        Pessoa pessoa = new Pessoa();

        double salario = 3500.75;
        boolean ativo = true;
        System.out.println(Empresa.nomeEmpresa);
        
    }

    private  void mostrarIdade() {
        int idade = 30; // Só existe dentro deste método
        System.out.println(idade);
    }

    class Pessoa {
        String nome; // Variável de instância
    }

    class Empresa {
        static String nomeEmpresa = "Tech Inovation";
    }

    int num = 10;
    double valor = num; // int -> double (automático)

    double preco = 9.99;
    int precoInteiro = (int) preco; // double -> int (perde a parte decimal)

    
}
