package intro;

public class Main {

	public static void main(String[] args) {
		
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.10;
		double dolarBugun = 8.10;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Doalr d��t� resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("dolar artt� resmi");
		}		
		else {
			System.out.println("E�it resmi");
		}
		
		//String kredi1 = "H�zl� kredi";
		//String kredi2 = "Mutlu kredi";
		//String kredi3 = "Konut kredi";
		//String kredi4 = "�if�ti kredi";
		//String kredi5 = "msb kredi";
		
		String[] krediler = 
			{
					"H�zl� kredi",
					"Mutlu kredi",
					"Konut kredi",
					"�if�ti kredi",
					"msb kredi",
					"Meb kredisi",
					"K�lt�r bakanl��� kredisi"
					};
		
		//foreach d�ng�s�
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		

	}

}
