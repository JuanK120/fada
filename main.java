package ProyectoFada;

public class main {

	public static void main(String[] args) {
	    
		int n1 = 6;
		int m1 = 3;
		int k1 = 2;

		String[] animales1 = {"gato", "libelula", "ciempies", "nutria", "perro", "tapir"};
		int[] grandezas1 = {3, 2, 1, 6, 4, 5};

		String[][] apertura1 = {{"tapir", "nutria", "perro"}, {"tapir", "perro", "gato"},
		                {"ciempies", "tapir", "gato"}, {"gato", "ciempies", "libelula"}};

		String[][][] partes1 = {{{"tapir", "nutria", "perro"}, {"ciempies", "tapir", "gato"}},
		                        {{"gato", "ciempies", "libelula"}, {"tapir", "perro", "gato"}}};
		
		System.out.print("prueba 1 con complejidad n \n");
		
		O_n p1= new O_n(n1,m1,k1,animales1,grandezas1,apertura1,partes1);
		
		System.out.print("\n \n");
		
		System.out.print("prueba 1 con complejidad n2 \n");
		
		O_n2 p2= new O_n2(n1,m1,k1,animales1,grandezas1,apertura1,partes1);
		
		System.out.print("\n \n");
		
		System.out.print("prueba 1 con complejidad nlogn \n");
		
		System.out.print("\n \n");
		
		
		n2 = 9;
		m2 = 4;
		k2 = 3;

		animales2 = {leon, panteranegra, cebra, cocodrilo, boa, loro, caiman, tigre, capibara};
		grandezas2 = {9, 7, 6, 5, 4, 2, 3, 8, 1};
		apertura2 = {{caiman, capibara, loro}, {boa, caiman, capibara}, {cocodrilo, capibara, loro}, {panteranegra, cocodrilo, loro}, {tigre, loro, capibara}, {leon, caiman, loro}, {leon, cocodrilo, boa}, {leon, panteranegra, cebra}, {tigre, cebra, panteranegra}};
		partes2 = {{{caiman, capibara, loro}, {tigre, loro, capibara}, {tigre, cebra, panteranegra}},
			{{panteranegra, cocodrilo, loro}, {leon, panteranegra, cebra}, {cocodrilo, capibara, loro}},
			{{boa, caiman, capibara}, {leon, caiman, loro}, {leon, cocodrilo, boa}}};

		O_n p1= new O_n(n2,m2,k2,animales2,grandezas2,apertura2,partes2);
		
		System.out.print("\n \n");
		
		System.out.print("prueba 1 con complejidad n2 \n");
		
		O_n2 p2= new O_n2(n2,m2,k2,animales2,grandezas2,apertura2,partes2);
		
		System.out.print("\n \n");
		
		System.out.print("prueba 1 con complejidad nlogn \n");
		
		System.out.print("\n \n");
		

	}

}
