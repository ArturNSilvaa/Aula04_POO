public class Aluno {
    private String nome;
    private String cpf;
    private int ra;
    private String datanascimento;
    private String sexo;

  public Aluno (String nome, String cpf,
            int ra, String datanascimento, String sexo){
                this.nome = nome;
                this.cpf = cpf;
                this.ra = ra;
                this.datanascimento = datanascimento;
                this.sexo = sexo;
    }
    public Aluno (){
        
    }

    public void setNome(String entrada){
        this.nome = entrada;
        
    }
    public void setRa(int entrada){
        this.ra = entrada;
    }
    public String getNome(){
        return this.nome;
    }
    public int getRa(){
        return this.ra;
    }
 }