package model;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaBeans.
 */
public class JavaBeans {
	
	/** The idcon. */
	private String idcon;
	
	/** The nome. */
	private String nome;
	
	/** The fone. */
	private String fone;
	
	/** The email. */
	private String email;
	
	
	
	/**
	 * Instantiates a new java beans.
	 */
	public JavaBeans() {
		super();
		
	}
	
	/**
	 * Instantiates a new java beans.
	 *
	 * @param idicon the idicon
	 * @param nome the nome
	 * @param fone the fone
	 * @param email the email
	 */
	public JavaBeans(String idicon, String nome, String fone, String email) {
		super();
		this.idcon = idicon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	/**
	 * Gets the idicon.
	 *
	 * @return the idicon
	 */
	public String getIdicon() {
		return idcon;
	}
	
	/**
	 * Sets the idicon.
	 *
	 * @param idicon the new idicon
	 */
	public void setIdicon(String idicon) {
		this.idcon = idicon;
	}
	
	/**
	 * Gets the nome.
	 *
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Sets the nome.
	 *
	 * @param nome the new nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Gets the fone.
	 *
	 * @return the fone
	 */
	public String getFone() {
		return fone;
	}
	
	/**
	 * Sets the fone.
	 *
	 * @param fone the new fone
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}

