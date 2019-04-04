import java.util.ArrayList;

public class Exercicio7 {
    public static void main(String[] args) {
        listaDeNumerosEntre(5,10);
    }

    public static void listaDeNumerosEntre(Integer minimo, Integer maximo){
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for(int i = minimo+1; i < maximo ;i++){
            listaNumeros.add(i);
        }

        System.out.println(listaNumeros);
    }
}
