public class Principal {
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.setModelo("Gol G7");
        carro.setMarca("Volkswagen");
        carro.setAno(2020);
        carro.setPlaca("DJD-6474");
        System.out.println(carro.getModelo());
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getPlaca());
    }
}
