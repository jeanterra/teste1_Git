import java.util.function.Supplier;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {

    Calculo Soma = (a, b) -> (a + b);
    Calculo Sub = (a, b) -> (a - b);

        System.out.println(executarOperacao(Soma,3,5));

    }
    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

@FunctionalInterface
interface Calculo{
    public int calcular(int a, int b);
}