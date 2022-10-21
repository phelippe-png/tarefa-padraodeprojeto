package com.company;

public class CasaBuilder {
    private Casa casa = new Casa();

    public CasaBuilder comPiscina(){
        this.casa.setIsComPiscina(true);
        return this;
    }

    public CasaBuilder comChurrasqueira(){
        this.casa.setIsComChurrasqueira(true);
        return this;
    }

    public CasaBuilder comJardim(){
        this.casa.setIsComJardim(true);
        return this;
    }

    public Casa build(){
        return this.casa;
    }
}
