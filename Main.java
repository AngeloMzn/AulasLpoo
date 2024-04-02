public class Main {
    public static void main(String [] args){
        Caneta bic = new Caneta("azu", 12.5, "faber castel", false);
        System.out.println("antes de mudar: " + bic.getCor());
        bic.setCor("azul");
        System.out.println(bic.getCor());
    }
}
