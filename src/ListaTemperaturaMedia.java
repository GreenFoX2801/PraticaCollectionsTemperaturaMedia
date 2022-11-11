import java.util.*;

public class ListaTemperaturaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while (true){
            if(count == 6) break;
            System.out.println("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("----------");
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t+" "));

        double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.printf("\nMédia das temperatuas: %.1f\n", media);
        System.out.println("Temperatura acima da média: ");
        temperaturas.stream().filter(t->t>media).forEach(t-> System.out.printf("%.1f ",t));
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();
        count = count +1;
        while (iterator.hasNext()){
            Double temp = iterator.next();
            if(temp>media){
                switch (count){
                    case(0):
                        System.out.printf("Janeiro: %.1f\n ",temp);
                        break;
                    case(1):
                        System.out.printf("Fevereiro: %.1f\n ",temp);
                        break;
                    case(2):
                        System.out.printf("Março: %.1f\n ",temp);
                        break;
                    case(3):
                        System.out.printf("Abril: %.1f\n ",temp);
                        break;
                    case(4):
                        System.out.printf("Junho: %.1f\n ",temp);
                        break;
                    case(5):
                        System.out.printf("Julho: %.1f\n ",temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count=count+1;
        }
    }
}
