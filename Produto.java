package projeto1;

public class Produto implements Cloneable{
    double desconto;
    String nome;
    double preco;

    Produto(){
        this("sem nome", 9999999, 9999999);
    }
    public Produto(String nome){
        this.nome = nome;

    }
    public Produto(String nome, double preco){
        this.preco = preco;
        this.nome = nome;
    }
    public Produto(String nome, double preco, double desconto){
        this.preco = preco;
        this.nome = nome;
        this.desconto = desconto;
    }
    String retornaStringFormatada(){
        return String.format("O produto %s está " + "com preço %.2f e com desconto %.2f", this.nome, this.preco, this.desconto);

    }
    @Override
    public Produto clone(){
        try {
            Produto clone = (Produto) super.clone();
            return clone;
        }
        catch (CloneNotSupportedException e){
            throw  new AssertionError();
        }
    }

}
