package dio.joaonunodev.PadraoProjBuilder;

public class Vendedor {
    private String nome;
    private String sobrenome;
    private int idade;
    private int codigoVendedor;
    private String email;
    private int numerVendas;

    private Vendedor(String nome, String sobrenome, int idade, int codigoVendedor, String email, int numerVendas) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.codigoVendedor = codigoVendedor;
        this.email = email;
        this.numerVendas = numerVendas;
    }

    @Override
    public String toString() {
        return "Foi criado o objeto - Vendedor{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", codigoVendedor=" + codigoVendedor +
                ", email='" + email + '\'' +
                ", numerVendas=" + numerVendas +
                '}';
    }

    public static final class VendedorBuilder{
        private String nome;
        private String sobrenome;
        private int idade;
        private int codigoVendedor;
        private String email;
        private int numerVendas;

        public VendedorBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public VendedorBuilder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }

        public VendedorBuilder idade(int idade){
            this.idade = idade;
            return this;
        }

        public VendedorBuilder codigoVendedor(int codigoVendedor){
            this.codigoVendedor = codigoVendedor;
            return this;
        }

        public VendedorBuilder email(String email){
            this.email = email;
            return this;
        }

        public VendedorBuilder numerVendas(int numerVendas){
            this.numerVendas = numerVendas;
            return this;
        }

        public Vendedor build() {
            return new Vendedor(nome, sobrenome, idade, codigoVendedor, email, numerVendas);
        }
    }

}
