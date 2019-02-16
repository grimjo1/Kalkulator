package com.example.kalkulator;


public class CalkController {
    double A;
    double B;
    Operaciia oper;
    NumberController nc;

    public void setNc(NumberController nc) {
        this.nc = nc;
    }


    public void slojit() {
        if (oper != null) {
            vichislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operaciia.SLOJENIE;
            nc.clear();
        }
    }
    public void vichest() {
        if (oper != null) {
            vichislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operaciia.VICHITANIE;
            nc.clear();
        }
    }
    public void ymnojit() {
        if (oper != null) {
            vichislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operaciia.YMNOJENIE;
            nc.clear();
        }
    }
    public void delit() {
        if (oper != null) {
            vichislit();
        }
        if (!nc.getError()) {
            A = nc.getValue();
            oper = Operaciia.DELENIE;
            nc.clear();
        }
    }
    public void vichislit() {
        B = nc.getValue();
        nc.clear();
        if (oper == Operaciia.SLOJENIE) {
            oper = null;
            Double R = A + B;
            nc.setResult(R);
        }
        if (oper == Operaciia.VICHITANIE) {
            oper = null;
            Double R = A - B;
            nc.setResult(R);
        }
        if (oper == Operaciia.YMNOJENIE) {
            oper = null;
            Double R = A * B;
            nc.setResult(R);
        }

        try {
            if (oper == Operaciia.DELENIE) {
                oper = null;
                Double R = A / B;
                nc.setResult(R);
            }
        }catch (Exception e){
            nc.setError();
        }
    }



}
