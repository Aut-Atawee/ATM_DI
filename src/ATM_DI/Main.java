package ATM_DI;

public class Main {
    public static void main(String[] args) {

        DataSourceDB dataSourceDB = new DataSourceDB() ;
        DataSourceFile dataSourceFile = new DataSourceFile() ;

        Bank myBank = new Bank("My Bank", new DataSourceDB()) ;

        //Bank yourBank = new Bank("Your Bank", dataSourceFile) ;

        Atm atm = new Atm(myBank) ;

        AtmUI atmUI = new AtmUI(atm) ;
        atmUI.run() ;

//        String name = atm.validateCustomer(2, 2345) ;
//        System.out.println( name + " has " + atm.getBalance() );
//        atm.withdraw(200);
//        System.out.println( name + " has " + atm.getBalance() );

//        atm.transfer(3, 1000);
//        System.out.println( name + " has " + atm.getBalance() );
//        atm.end();
//
//        name = atm.validateCustomer(3, 3456) ;
//        System.out.println( name + " has " + atm.getBalance() );
    }
}
