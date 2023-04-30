// 03 controlando o fluxo da aplicacao 

public class CrontrolFluxodaAplicao {
    public static void main(String[] args) {
        
        int anoDeLancamento = 2022;
        boolean IncluidoNoPlano = true;
        double notaDoFilme  = 5.1;
        String planodaplataforma= "normal";
      

        if (anoDeLancamento >= 2022){
            System.out.println("movie is no release");
        }
        else{
            System.out.println("movie is not no release");
        }
        
        if(IncluidoNoPlano == true && planodaplataforma.equals("plus")){
            System.out.println("move liberado");
        } else{
            System.out.println("deve paga a conta");
        }
       
    }
}
