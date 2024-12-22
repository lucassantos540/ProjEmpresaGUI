public class Cliente {
    public String nome;
    public int tel;
    private String tipo_Pessoa;
    
    public String getTipo_pessoa(){
        return this.tipo_Pessoa;    
    }
    public void setTipo_pessoa(String tipo_Pessoa){
        this.tipo_Pessoa = tipo_Pessoa;
    }
    
    public double CalcDesc(){
        if (tipo_Pessoa.equals("F")){
            return 10;
        }
        else {
            return 20;
        }
    }
}
