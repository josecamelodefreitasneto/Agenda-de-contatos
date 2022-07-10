package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;








// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	/* Modolo de conexão */
	/** The driver. */
	// Parâmentros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://localhost:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	
	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "cml123";

	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	// Método de Conexão
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;

		}

	}

/**
 * Teste conexão.
 */
// teste de conexão
	public void testeConexão() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 *  GRUD CREATE *.
	 *
	 * @param contato the contato
	 */
	public void inserirContato(JavaBeans contato) {
		String create = " INSERT INTO contatos(nome,fone,email) VALUES (?,?,?)";
		try {
			// abri conexão
			Connection con = conectar();
			// PREPARA A QUERY PAREA EXECULTAR NO BD
			PreparedStatement pst = con.prepareStatement(create);
			// subistituir os parametros ? pelo conteudo das variaves javabeans
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			// execultar a query
			pst.executeUpdate();
			// fechar a conexão
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * Listar contatos.
	 *
	 * @return the array list
	 */
	// CREATE READ
	public ArrayList<JavaBeans> listarContatos() {
		// criando um objeto para acessar a classe javaBeans
		ArrayList<JavaBeans> contatos = new ArrayList<>();
		String read = "SELECT *FROM contatos ORDER BY nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// o laço abaixo sera execultado enguanto ouver contatos
			while (rs.next()) {
				// variaveis de apoio que receberam o dados do BD
				String idcon = rs.getString(1);
				String nome = rs.getString(2);
				String fone = rs.getString(3);
				String email = rs.getString(4);
				// populando o arrayList
				contatos.add(new JavaBeans(idcon, nome, fone, email));

			}
			con.close();
			return contatos;
		} catch (Exception e) {
			System.out.println(e);
			return null;

		}

	}

	/**
	 * Selecionar contato.
	 *
	 * @param contato the contato
	 */
	// selecionar o contato
	public void selecionarContato(JavaBeans contato) {
		String read2 = " SELECT * FROM contatos WHERE idcon = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setString(1, contato.getIdicon());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				// setar as variáveis javaBeans
				contato.setIdicon(rs.getString(1));
				contato.setNome(rs.getString(2));
				contato.setFone(rs.getString(3));
				contato.setEmail(rs.getString(4));

			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * Alterar contato.
	 *
	 * @param contato the contato
	 */
	// editar o contato
	public void alterarContato(JavaBeans contato) {
		String update = "UPDATE contatos SET nome=?, fone=?, email=? WHERE idcon=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getIdicon());
			pst. executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println();
		}
	}
	
	/**
	 * Deletar contato.
	 *
	 * @param contato the contato
	 */
	//crud delete
	public void deletarContato(JavaBeans contato) {
		String delete = "DELETE FROM contatos WHERE idcon=?";
		try {
			Connection con= conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, contato.getIdicon());
			pst.executeUpdate();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
