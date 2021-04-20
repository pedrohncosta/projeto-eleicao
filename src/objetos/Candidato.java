package objetos;

public abstract class Candidato {
 private String nome;
 private String partido;
 private long numvotos=0;

 public abstract int getNumero();
 
 public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPartido() {
	return partido;
}
public void setPartido(String partido) {
	this.partido = partido;
}
public long getNumvotos() {
	return numvotos;
}
public void implementaVoto()
{
	this.numvotos++;
}
public Candidato() {
	super();
	// TODO Auto-generated constructor stub
}
}
