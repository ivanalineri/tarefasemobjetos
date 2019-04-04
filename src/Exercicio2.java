public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println(cadeiaDeTextoDiferentes("palavra", "Castelo"));


    }

    public static Boolean cadeiaDeTextoDiferentes(String umTextoA, String umTextoB){
        if(!umTextoA.equals(umTextoB )){
            return true;
        }else{
            return false;
        }
    }
}
