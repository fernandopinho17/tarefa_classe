public class PrimeiroCarro {

    public static void main(String args[]) {
        System.out.println("Olá Fernando");
        Carro carro = new Carro();
        carro.cadastrarEndereco("Test driver");

        System.out.println(carro.getEndereco());
    }
}
