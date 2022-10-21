package com.company;

public class Casa {
    private Boolean isComPiscina = false;
    private Boolean isComChurrasqueira = false;
    private Boolean isComJardim = false;

    public void setIsComPiscina(Boolean isComPiscina) {
        this.isComPiscina = isComPiscina;
    }

    public void setIsComChurrasqueira(Boolean isComChurrasqueira) {
        this.isComChurrasqueira = isComChurrasqueira;
    }

    public void setIsComJardim(Boolean isComJardim) {
        this.isComJardim = isComJardim;
    }

    @Override
    public String toString() {
        String mensagem = "Minha Casa";

        if (isComChurrasqueira)
            mensagem += ", com churrasqueira";

        if (isComJardim)
            mensagem += ", com jardim";

        if (isComPiscina)
            mensagem += ", com piscina";

        return mensagem + "!";
    }
}
