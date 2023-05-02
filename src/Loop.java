import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner leitura=new Scanner(System.in);

        double mediaAvalivacao=0;
        double nota=0;


        for (int i = 0; i < 3; i++) {
            System.out.println("qual avaliacao voce da a ao filme:");
            nota=leitura.nextDouble();
           // mediaAvalivacao = mediaAvalivacao+notac 
           mediaAvalivacao +=nota;
        }
       

       
       System.out.println("media de avaliacao e igual a:" + mediaAvalivacao/3);
    }
}
