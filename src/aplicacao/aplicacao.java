package aplicacao;


public class aplicacao {
 public static void main(String[] args){
    Pokemon poke = new Pokemon("onix", 28 , "pedra");
    Pokemon poke1 = new Pokemon("arceus", 999 , "normal") ;
    
    
    poke.setForça(89);
    poke1.setForça(999);
    String[] atk1 = new String[5];
    String[] atk2 = new String[5];
    
    atk1[0] = "ain";
    atk1[1] = "nobru";
    atk1[2] = "apelao";
    atk1[3] = "risadinha";
    atk1[4] = "de";
    
    poke.setAtaques(atk1);
    poke.Ataques();
     System.out.println(poke.posArray("tackle"));
     
     poke.mostraAtaque(4);
     
 }
}