
public class AnimalSelvagem extends Animal {
	String hierarquiaBando;
	boolean ameacado;
	String cadeiaAlimentar;
	
	AnimalSelvagem(String especie,int idade,String familia,
			String hierarquiaBando,boolean ameacado,
			String cadeiaAlimentar) {
		super(especie,idade,familia);
		this.hierarquiaBando = hierarquiaBando;
		this.ameacado = ameacado;
		this.cadeiaAlimentar = cadeiaAlimentar;
	}

	public String getHierarquiaBando() {
		return hierarquiaBando;
	}

	public void setHierarquiaBando(String hierarquiaBando) {
		this.hierarquiaBando = hierarquiaBando;
	}

	public boolean isAmeacado() {
		return ameacado;
	}

	public void setAmeacado(boolean ameacado) {
		this.ameacado = ameacado;
	}

	public String getCadeiaAlimentar() {
		return cadeiaAlimentar;
	}

	public void setCadeiaAlimentar(String cadeiaAlimentar) {
		this.cadeiaAlimentar = cadeiaAlimentar;
	}
	
}
