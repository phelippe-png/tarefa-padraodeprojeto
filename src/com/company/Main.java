package com.company;

public class Main {

    public static void main(String[] args) {
	    Casa casa1 = new CasaBuilder().build();
        Casa casa2 = new CasaBuilder().comPiscina().build();
        Casa casa3 = new CasaBuilder().comChurrasqueira().build();
        Casa casa4 = new CasaBuilder().comJardim().build();
        Casa casa5 = new CasaBuilder().comPiscina().comChurrasqueira().build();

        System.out.println(casa1.toString());
        System.out.println(casa2.toString());
        System.out.println(casa3.toString());
        System.out.println(casa4.toString());
        System.out.println(casa5.toString());
    }
}
