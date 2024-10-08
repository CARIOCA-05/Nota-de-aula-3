class Animal {
    protected String nome;
    protected String raca;

    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    public void caminha() {
        System.out.println(this.nome + " está caminhando.");
    }
}
