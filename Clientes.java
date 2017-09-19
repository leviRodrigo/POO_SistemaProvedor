
public class Clientes {
	private String nome;
	private String endereço;
	private String tel;
	private int quantMega;
	
	public Clientes (String nome, String endereço, int quantMega, String tel){
		this.setNome(nome);
		this.setEndereço(endereço);
		this.setQuantMega(quantMega);
		this.setTel(tel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getQuantMega() {
		return quantMega;
	}

	public void setQuantMega(int quantMega) {
		this.quantMega = quantMega;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
