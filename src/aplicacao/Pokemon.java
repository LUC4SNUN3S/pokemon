package aplicacao;


 public class Pokemon{
    public String nome;
    public int level;
    public String tipo;
    private int força;
    
    private String[] ataques = new String[5];

    public Pokemon(String nome, int level, String tipo) {
        this.nome = nome;
        this.level = level;
        this.tipo = tipo;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public String[] getAtaques() {
        return ataques;
    }

    public void setAtaques(String[] ataques) {
        this.ataques = ataques;
    }
    public void Ataques(){
        for( int a = 0; a<this.ataques.length; a++){
            System.out.println(ataques[a]);
    
    }
    }
public int posArray(String ataque){int i = -1;
     for(int a = 0; a< this.ataques.length; a++){
         
     if(ataques[a] == ataque){
         System.out.println("chuva de pedras");
     }
     }
     return i;
     }
public void mostraAtaque(int i){
    System.out.println(i);
}
    
    

}
