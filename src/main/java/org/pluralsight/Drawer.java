package org.pluralsight;

public class Drawer {
    String[] cashDenominations = {
            "PENNY",
            "NICKEL",
            "DIME",
            "QUARTER",
            "DOLLAR",
            "FIVE DOLLARS",
            "TEN DOLLARS",
            "TWENTY DOLLARS",
            "ONE-HUNDRED DOLLARS"
    };
    private String[][] cashInDrawer;

     String[][] getCashInDrawer() {
        return cashInDrawer;
    }

    void setCashInDrawer(String[] cashInDrawer) {

        String[][] annotatedCashInDrawer=new String[9][2];
        for (int i = 0; i< 9;i++){

            annotatedCashInDrawer[i] = new String[] {cashDenominations[i], (i <= cashInDrawer.length - 1 ? cashInDrawer[i] : "0")};
        }
        this.cashInDrawer = annotatedCashInDrawer;
    }
}
