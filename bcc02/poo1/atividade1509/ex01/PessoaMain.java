public class PessoaMain {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pessoa", "endereco1");
        System.out.println(pessoa.toString());
        

        PessoaFisica pessoaFisica = new PessoaFisica("pessoa fisica", "endereco2", "10987654321", "solteiro");
        System.out.println(pessoaFisica.toString());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("pessoa jurídica", "endereco 3", "6541230684", "MEI");
        System.out.println(pessoaJuridica.toString());
    }
}
