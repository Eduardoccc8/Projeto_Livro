package projetolivro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa [3];
		LIvro []  l = new LIvro [3];
		p[0] = new Pessoa("Cassio", 22, "M");
		p[1] = new Pessoa("Denise", 22, "F");
		p[2] = new Pessoa("Guilherme", 22, "M");
		
		l[0] = new LIvro("Aprendendo Java", "Heitor da Silva", 300, p[0]);
		l[1] = new LIvro("Aprendendo Php", "Heitor da Silva", 500, p [1]);
		l[2] = new LIvro("Aprendendo Html", "Heitor da Silva", 800, p [2]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();				
		System.out.println(l[0].detalhes());
		System.out.println("=====================================");
				
		l[1].abrir();
		l[1].folhear(100);
		l[1].avancarPag();				
		System.out.println(l[1].detalhes());
		System.out.println("=====================================");
		
		l[1].abrir();
		l[1].folhear(100);
		l[1].avancarPag();				
		System.out.println(l[2].detalhes());
	}
	

}
