import javax.swing.JOptionPane;

public class Fornecedor {
    public String nome;
    public String cidade;
    private String tempo_Entrega;
    
    
    public String getTempo_entrega(){
        return this.tempo_Entrega;
    }
    
    public void setTempo_entrega(String tempo_Entrega){
        this.tempo_Entrega = tempo_Entrega;
    }
    
    public String AnalisaTempo(String tempo_Entrega){
        
        int tempo = Integer.parseInt(tempo_Entrega);
        
        if(tempo <= 2){
            return "Prioritario";
        } else {
            return "Normal";
        }
        
    }
}
