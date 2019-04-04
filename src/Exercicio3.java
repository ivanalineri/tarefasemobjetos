public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println(par(25));

    }

    public static Boolean par(Integer umNumero){
        if(umNumero %2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
