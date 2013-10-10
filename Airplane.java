class Airplane{
	int size;
	String name;
	
	void aircraftType(int repeatLines) {
		
		while (repeatLines > -1) {
		
		if (size == 0) {
			System.out.println("Cessna");
		}
		
		else if (size == 1) {
			System.out.println("Learjet");
		}
		
		else {
			System.out.println("Boeing");
			
			}
	
	repeatLines--;	
	
		}

	}
}	