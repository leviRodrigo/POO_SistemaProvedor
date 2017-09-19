
public class Clientes {
	private String nome;
	private String enderešo;
	private String tel;
	private int quantMega;
	
	public Clientes (String nome, String enderešo, int quantMega, String tel){
		this.setNome(nome);
		this.setEnderešo(enderešo);
		this.setQuantMega(quantMega);
		this.setTel(tel);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
