package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation operationDebit1 = new Debit("05/02/2015", 58);
		Operation operationDebit2 = new Debit("08/08/2015", 895);
		Operation operationCredit1 = new Credit("15/02/2015", 258);
		Operation OperationCredit2 = new Credit("09/03/2015",485);
		
		Debit debit = new Debit();
		Credit credit = new Credit();
		
		Operation[] operations = {operationDebit1, operationDebit2, operationCredit1, OperationCredit2};
		
		for(int i = 0; i<operations.length; i++) {
			//System.out.println(operations[i]+ credit + debit);
		}
		
		
	}

}
