public class Exercicio5 {


    public static Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD){
        if(umNumeroA > umNumeroC && umNumeroA > umNumeroD || umNumeroB > umNumeroC && umNumeroB > umNumeroD){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(algumMaior(10,2,7,9));
    }
}
