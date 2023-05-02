import java.util.Scanner;

public class OutroLoop {

public static void main(String[] args) {
    Scanner leitura=new Scanner(System.in);

        double mediaAvalivacao=0;
        double nota=0;
        int totaldenotas= 0;

        while (nota!= -1) {
            System.out.println("qual avaliacao voce da a ao filme ou -1 para encerrar:");
            nota=leitura.nextDouble();
            // mediaAvalivacao = mediaAvalivacao+notac 
            if (nota != -1) {

                mediaAvalivacao +=nota;
                totaldenotas++;
            }
            
            
        }
       

       
       System.out.println("media de avaliacao e igual a:" + mediaAvalivacao/totaldenotas); 
}
}
