package modelos;

/**
 *
 * @author Marcus Vinicius
 */
public enum TipoPessoa {
    
    F("Fisica"),
    J("Juridica");
    
    private String descricao;

    private TipoPessoa(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
