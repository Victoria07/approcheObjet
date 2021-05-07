package fr.diginamic.resencement;

public class Ville {

	private String codeRegion;
	private String nomRegion;
	private String codeDept;
	private String codeCommune;
	private String nomCommune;
	private int populationTotale;
	
	//Constructeur
	public Ville() {
		
	}
	
	public Ville(String codeRegion,String nomRegion,String codeDept,String codeCommune,String nomCommune,int populationTotale) {
		super();
		this.codeRegion = codeRegion; 
		this.nomRegion = nomRegion; 
		this.codeDept = codeDept;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune; 
		this.populationTotale = populationTotale; 
	}
	
	
	
	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDept=" + codeDept
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", populationTotale="
				+ populationTotale + "]";
	}

	//Get et Set
	public String getCodeRegion() {
		return codeRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public String getCodeDept() {
		return codeDept;
	}
	public String getCodeCommune() {
		return codeCommune;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public int getPopulationTotale() {
		return populationTotale;
	}
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}
	public void setNomCommune(String nonCommune) {
		this.nomCommune = nonCommune;
	}
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
}
