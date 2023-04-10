# Introducao a JAVA

        Ola me chamo Joao e atraves da alura estarei me comprometendo a esta aprendendo a linguagem JAVA e a tambem esta publicando e mostrando meu proguesso espero que gostem!!

        Hello, my name is Joao and through this I am committing myself to learning the JAVA language and also publishing and showing my progress, I hope you like it!!


## Me desafiando a aprende e presquisando 

* "\n" Para fazer o quebramento de linhas nas strings do println
* Sempre use o + para adiciona e para junta no println
* Para coloca o numero como um decimal completo e nescessario este exemplo

        import java.text.DecimalFormat;
        import java.util.Locale;

        public class ExemploDeFormatoDePreco {
                public static void main(String[] args) {
                        double preco = 12.3456;

                        DecimalFormat formatoPreco = (DecimalFormat) DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
                         System.out.println("Preço: " + formatoPreco.format(preco));
                }
        }

* Para escrever uma String e o oposto de Int exemplo

        //Com valor 

        int valor = 42;
        String valorString = String.valueOf(valor);
        System.out.println("O valor é: " + valorString);
        
        //Sem valor 

        String Empresa = String.valueOf("Marvel Studio");

### Resultado do teste
        //PRIMEIRO TESTE COM O JAVA : lISTA

        import java.text.DecimalFormat;
        import java.util.Locale;

        public class PriProjeto {
        public static void main (String[] args){
        
        int Lancamento = 2022;
        String Empresa = String.valueOf("Marvel Studio");
        String NomedoFilme = String.valueOf("Homem Aranha");

        double preco = 18.3456;

        DecimalFormat formatoPreco = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Ano de Lancamento: " + Lancamento + "\nEmpresa: " + Empresa + "\nNome do Filme: " + NomedoFilme + "\nPreço: " + formatoPreco.format(preco) );

                }
        }