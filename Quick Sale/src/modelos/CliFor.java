package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Marcus Vinicius
 */
@Entity
public class CliFor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(length = 60, nullable = false)
    private String nomeFantasia;
    
    @Column(length = 60, nullable = false)
    private String razaoCompleto;
    
    @Column(length = 18, nullable = false)
    private String cpfCnpj;
    
    @Column(length = 10, nullable = false)
    private String IeRg;
    
    @Temporal(TemporalType.DATE)
    private Date dataCadastro;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoPessoa pessoa;

    public CliFor(String nomeFantasia, String razaoCompleto, String cpfCnpj, String IeRg, Date dataCadastro, TipoPessoa pessoa) {
        this.nomeFantasia = nomeFantasia;
        this.razaoCompleto = razaoCompleto;
        this.cpfCnpj = cpfCnpj;
        this.IeRg = IeRg;
        this.dataCadastro = dataCadastro;
        this.pessoa = pessoa;
    }

    public CliFor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
      
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoCompleto() {
        return razaoCompleto;
    }

    public void setRazaoCompleto(String razaoCompleto) {
        this.razaoCompleto = razaoCompleto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getIeRg() {
        return IeRg;
    }

    public void setIeRg(String IeRg) {
        this.IeRg = IeRg;
    }
    
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public TipoPessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(TipoPessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CliFor)) {
            return false;
        }
        CliFor other = (CliFor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.CliFor[ id=" + id + " ]";
    }

}
