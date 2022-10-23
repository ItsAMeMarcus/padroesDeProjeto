package factoryMode.main.afm.produtos.sanduiches;

public abstract class SanduicheIngredientes{
	private String pao;
	private String queijo;
	private String presunto;
	private Boolean salada;

	
	
	public void setPao(String pao) {
		this.pao = pao;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}

	public void setPresunto(String presunto) {
		this.presunto = presunto;
	}

	public void setSalada(Boolean salada) {
		this.salada = salada;
	}

	public String getPao() {
		return pao;
	}
	
	public String getQueijo() {
		return queijo;
	}
	
	public String getPresunto() {
		return presunto;
	}
	
	public String getSalada() {
		if(salada == false) {
			return "sem verdura";
		}
		return "com verdura";
	}
	
}
