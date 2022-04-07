package motel;

public class JavaBeans {
	private String idicon;
	private String nome;
	private String fone;
	private String email;
	
	
	
	public JavaBeans() {
		super();
		
	}
	
	public JavaBeans(String idicon, String nome, String fone, String email) {
		super();
		this.idicon = idicon;
		this.nome = nome;
		this.fone = fone;
		this.email = email;
	}

	public String getIdicon() {
		return idicon;
	}
	public void setIdicon(String idicon) {
		this.idicon = idicon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
