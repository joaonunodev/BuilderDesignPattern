package dio.joaonunodev.PadraoProjBuilder;

public class VendedorBuilderTeste {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor.VendedorBuilder()
                .nome("Jacinto")
                .sobrenome("Lucas")
                .idade(234)
                .codigoVendedor(454512)
                .email("jacintolucas@gmailo.com")
                .numerVendas(3)
                .build();

        Vendedor vendedor2 = new Vendedor.VendedorBuilder()
                .nome("Patrícia")
                .sobrenome("Borges")
                .idade(18)
                .codigoVendedor(99512)
                .email("patriciaborges@gmailo.com")
                .numerVendas(4)
                .build();

        System.out.println(vendedor1);
        System.out.println(vendedor2);
    }
}
