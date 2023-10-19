package funcionarios;

public class Principal {
	
	public static void main(String[] args) {
		
		Jornada jornada = new Jornada(1, "Jonas", "159956584", 14, "rua silva jardim nº268");
		Horista horista = new Horista(2, "Manuel Gomes", "1596386846", 156, "Rua dos bobos nº0");
		PessoaJuridica pessoajuridica = new PessoaJuridica(3, "Rogerio", "1599864741", 68, "Rua do sorriso nº56");
		
		System.out.println(jornada.getId());
		System.out.println(jornada.getNome());
		System.out.println(jornada.getTelefone());
		System.out.println(jornada.getMatricula());
		System.out.println(jornada.getEndereco());
		
		System.out.println(horista.getId());
		System.out.println(horista.getNome());
		System.out.println(horista.getTelefone());
		System.out.println(horista.getMatricula());
		System.out.println(horista.getEndereco());
		
		System.out.println(pessoajuridica.getId());
		System.out.println(pessoajuridica.getNome());
		System.out.println(pessoajuridica.getTelefone());
		System.out.println(pessoajuridica.getMatricula());
		System.out.println(pessoajuridica.getEndereco());
		
		System.out.println("Salário: " + jornada.calculaSalario(100, 20));
		System.out.println("Salário: " + horista.calculaSalario(300, 20));
		System.out.println("Salário: " + pessoajuridica.calculaSalario(6000, 1000));
	}

}
