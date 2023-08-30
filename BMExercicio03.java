// a)

public class BMExercicio03 {

    public static void main(String[] args){

        final float TAXA = 8.25f;

        float arroz = 2.95f;
        float feijao = 3.50f;

        System.out.printf("O item arroz custa: %.2f e o item feijão custa: %.2f \n", arroz, feijao);

        float somaItem = arroz + feijao;

        System.out.println("E o valor total dos items é de: " + somaItem);

        float taxaCalculada = somaItem * (TAXA / 100);

        System.out.printf("O valor da taxa calculada: %.2f\n", taxaCalculada);

        float novoCusto = (arroz + taxaCalculada) + (feijao + taxaCalculada);

        boolean muitoCaro = novoCusto > 10 ? true : false;

        System.out.printf("O valor total da compra é muito caro? %b\n", muitoCaro);

    }

}