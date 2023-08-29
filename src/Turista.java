public class Turista {

    //Atributos - Variáveis de instância
    private String nome;
    private String cpf;
    //Contrutor padrão
    Turista(){}
    //Contrutor personalizado
    Turista(String _nome) {
        this.nome= _nome;
    }
        // Métodos
        public String viajar () {
            return "Viajou";
    }
    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Validar CPF

        this.cpf = cpf;
    }
}
