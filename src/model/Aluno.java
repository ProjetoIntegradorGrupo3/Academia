
package model;

import java.util.Calendar;


public class Aluno {
    
    private String nome, cpf, email, telefone;
    
    private int ModalidadesCod, PlanosCod, codigo, TotalCod;
    
    private Calendar dataNascimento;
    
    private Double pagamento;

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getModalidadesCod() {
        return ModalidadesCod;
    }

    public void setModalidadesCod(int ModalidadesCod) {
        this.ModalidadesCod = ModalidadesCod;
    }

    public int getPlanosCod() {
        return PlanosCod;
    }

    public void setPlanosCod(int PlanosCod) {
        this.PlanosCod = PlanosCod;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public void setPagamento(Double pagamento) {
        this.pagamento = pagamento;
    }

    public Double getTotalCod() {
        return TotalCod;
    }

    public void setTotalCod(Double TotalCod) {
        this.TotalCod = TotalCod;
    }
   

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
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
   
}
