package org.pluralsight;

import java.util.LinkedHashMap;
import java.util.Map;

public class CashInDrawer {

    Map<CurrencyUnit, Double> cashMap;

     public CashInDrawer(Map<CurrencyUnit,Double> initialCash){
         this.cashMap=new LinkedHashMap<>(initialCash);

     }

     public double getTotalCash(){
         return this.cashMap.values().stream().mapToDouble(Double::doubleValue).sum();
     }

     public double getAvailableCash(CurrencyUnit unit){
        return cashMap.getOrDefault(unit, 0.0);
     }

    public void reduceCash(CurrencyUnit unit, double amount){
        double current = getAvailableCash(unit);
        cashMap.put(unit, current-amount);
    }
}
