
public class Clientes {
	private String nome;
	private String endere�o;
	private String tel;
	private int quantMega;
	
	public Clientes (String nome, String endere�o, int quantMega, String tel){
		this.setNome(nome);
		this.setEndere�o(endere�o);
		this.setQuantMega(quantMega);
		this.setTel(tel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
