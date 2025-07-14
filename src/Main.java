//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(100, "superMan", false);
        MeiaEntrada meia = new MeiaEntrada(100, "superMan", false);
        IngressoFamilia ingressoFamilia = new IngressoFamilia(100, "superMan", false, 4);

        System.out.printf("Interia: %.2fR$\n", ingresso.getPrice());
        System.out.printf("Meia: %.2fR$\n", meia.getPrice());
        System.out.printf("Familia para %d pessoas: %.2fR$\n", ingressoFamilia.getNumberPeople(), ingressoFamilia.getPrice());
    }
}