
package DAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Aluno;


public class AlunoDAO {

    public static void inserir(Aluno aluno) {
        String data = "" + aluno.getDataNascimento().get(Calendar.YEAR)
                + "-" + (aluno.getDataNascimento().get(Calendar.MONTH)+1)
                + "-" +  aluno.getDataNascimento().get(Calendar.DAY_OF_MONTH);
        String sql = "INSERT INTO Alunos "
                + "(Codigo, nome, CPF, Telefone, DataNascimento, FormaPagamento, ModalidadesCod, TotalCod, PlanosCod) VALUES("
                + " '" + aluno.getNome() + "' , "
                + " '" + aluno.getCpf() + "' , "
                + " '" + aluno.getTelefone() + "' , "
                + " '" + aluno.getDataNascimento() + "' , "
                + " '" + aluno.getPagamento() + "' , "
                + " '" + aluno.getModalidadesCod() + "' , "
                + " '" + aluno.getTotalCod() + "' , "
                + " '" + aluno.getPlanosCod()
                + ")" ;
        
        Conexao.excutar( sql );
        
    }
    
    
    public static void editar (Aluno aluno) {
        String data = "" + aluno.getDataNascimento().get(Calendar.YEAR)
                + "-" + (aluno.getDataNascimento().get(Calendar.MONTH)+1)
                + "-" +  aluno.getDataNascimento().get(Calendar.DAY_OF_MONTH);
        String sql = "UPDATE Alunos "
                + " '" + aluno.getNome() + "' , "
                + " '" + aluno.getCpf() + "' , "
                + " '" + aluno.getTelefone() + "' , "
                + " '" + aluno.getDataNascimento() + "' , "
                + " '" + aluno.getPagamento() + "' , "
                + " '" + aluno.getModalidadesCod() + "' , "
                + " '" + aluno.getTotalCod() + "' , "
                + " '" + aluno.getPlanosCod()
                + " WHERE codigo = " +aluno.getCodigo();
        
        Conexao.excutar(sql);
    }
    
    
    public static void excluir (Aluno aluno) {
        String sql = "DELETE FROM Alunos "
               + " WHERE codigo = " +aluno.getCodigo();
        
        Conexao.excutar(sql);
    }
    
    public static List<Aluno> getAlunos(){
        List<Aluno> lista = new  ArrayList<>();
        
        
    }
    

}
