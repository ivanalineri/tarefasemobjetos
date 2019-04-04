public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println(maiorDeTres(12,7,2));


    }

    public static Integer maiorDeTres(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC){
        if(umNumeroA > umNumeroB && umNumeroA > umNumeroC){
            return umNumeroA;
        }else if(umNumeroB > umNumeroA && umNumeroB >umNumeroC ){
            return umNumeroB;
        }else{
            return umNumeroC;
        }


    }
}
