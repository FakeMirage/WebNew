package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cadastro.model.Personagem;

public class PersonagemDAO {
	Connection connection;
	
	@Autowired
	public PersonagemDAO(DataSource dataSource) throws ClassNotFoundException{
		try {
            this.connection = dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
	
	public void adiciona(Personagem personagem){
		String sql = "insert into personagens (idUser ,nome, raca , classe, habilidade, foto) " +
					"values (?, ?, MD5(?), ?, ?)";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, personagem.getNome());
			stmt.setString(2, personagem.getRaca());
			stmt.setString(3, personagem.getClasse());
			stmt.setString(4, personagem.getHabilidade());
			stmt.setString(5, personagem.getFotosCaminho());
			stmt.execute();
			stmt.close();
		}catch (SQLException e){
			throw new RuntimeException (e);
		}
	}
	
	public List<Personagem> lista(){
		try{
			List<Personagem> personagens = new ArrayList<Personagem>();
			PreparedStatement stmt = this.connection.prepareStatement
			("SELECT * FROM personagens WHERE idUser = ''");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Personagem personagem = new Personagem();
				
				personagem.setId(rs.getLong("id"));
				personagem.setNome(rs.getString("nome"));
				personagem.setRaca(rs.getString("raca"));
				personagem.setClasse(rs.getString("classe"));
				personagem.setHabilidade(rs.getString("habilidade"));
				personagem.setFotosCaminho(rs.getString("foto"));
				personagens.add(personagem);
			}
			rs.close();
			stmt.close();
			return personagens;
	
			}catch(SQLException e){
				throw new RuntimeException(e);
		}
	}
	
	public void remove(Personagem personagem){
		try{
			PreparedStatement stmt = this.connection.prepareStatement
			("delete from personagens where id = ?");
			
			stmt.setLong(1, personagem.getId());
			stmt.execute();
			stmt.close();

			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public Personagem buscaPorNome(String nome){
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from personagens where idUser = ''");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{

				if(nome == rs.getString("nome"))
				{
					Personagem personagem = new Personagem();
					
					personagem.setNome(rs.getString("nome"));
					personagem.setRaca(rs.getString("raca"));
					personagem.setClasse(rs.getString("classe"));
					personagem.setHabilidade(rs.getString("habilidade"));
					personagem.setFotosCaminho(rs.getString("foto"));
					
					return personagem;
				}
			}
				return null;
			}catch(SQLException e){
				throw new RuntimeException(e);
			}	
	}
	
	public void altera(Personagem personagem){
		String sql = "update personagens set idUser=?, nome=? , raca=?, classe=?, habilidade=?, foto=? where id=?";
		
		try{
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, personagem.getNome());
			stmt.setString(2, personagem.getRaca());
			stmt.setString(3, personagem.getClasse());
			stmt.setString(4, personagem.getHabilidade());
			stmt.setString(5, personagem.getFotosCaminho());
			stmt.setLong(6, personagem.getId());
				
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
