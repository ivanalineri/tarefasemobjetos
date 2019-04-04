import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println(listaDePrimeiroCemPositivos());
    }

    public static ArrayList listaDePrimeiroCemPositivos(){
        ArrayList<Integer>   listaNumeros = new ArrayList<>();
        for(int i = 1; i <=100 ;i++){
           listaNumeros.add(i);
        }

        return listaNumeros;
    }
}
