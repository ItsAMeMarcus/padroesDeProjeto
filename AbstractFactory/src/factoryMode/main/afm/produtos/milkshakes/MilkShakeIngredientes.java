package factoryMode.main.afm.produtos.milkshakes;

public abstract class MilkShakeIngredientes {
	public String leite;
	public Boolean nutella = false;
	public Boolean chocolate = false;
	public Boolean doceDeLeite = false;
	public Boolean ovomaltine = false;
	
	public String getLeite() {
		return leite;
	}
	public void setLeite(String leite) {
		this.leite = leite;
	}
	public String getNutella() {
		if(nutella) {
			return "com nutella";
		}
		return "sem nutella";
	}
	public void setNutella(Boolean nutella) {
		this.nutella = nutella;
	}
	public String getChocolate() {
		if(chocolate) {
			return "com chocolate";
		}
		return "sem chocolate";
	}
	public void setChocolate(Boolean chocolate) {
		this.chocolate = chocolate;
	}
	public String getDoceDeLeite() {
		if(doceDeLeite) {
			return "com doce de leite";
		}
		return "sem doce de leite";	
	}
	public void setDoceDeLeite(Boolean doceDeLeite) {
		this.doceDeLeite = doceDeLeite;
	}
	public String getOvomaltine() {
		if(ovomaltine) {
			return "com ovomaltine";
		}
		return "sem ovomaltine";	
	}
	public void setOvomaltine(Boolean ovomaltine) {
		this.ovomaltine = ovomaltine;
	}
	
	
}
