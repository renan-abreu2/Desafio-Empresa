package empresa;



public class funcionario {
	private String nome;
	private String endereco;
	private double salario;
	private String email;
	private String setor;
	private String cpf;
	private String dataDeAdmissao;
	private String dataDeDemissao;
	
	
	public funcionario(String nome, String endereco, double salario, String email, String setor, 
			String cpf, String dataDeAdmissao) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
		this.email = email;
		this.setor = setor;
		this.cpf = cpf;
		this.dataDeAdmissao = dataDeAdmissao;
	
			
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public String getDataDeDemissao() {
		return dataDeDemissao;
	}


	public void setDataDeDemissao(String dataDeDemissao) {
		this.dataDeDemissao = dataDeDemissao;
	}


	public String getCpf() {
		return cpf;
	}


	public String getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	
	
	public double contracheque() {
		
		return this.getSalario();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
