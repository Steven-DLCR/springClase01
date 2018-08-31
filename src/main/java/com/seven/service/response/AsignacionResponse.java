package com.seven.service.response;

public class AsignacionResponse {

    private String codreq;
    private Integer indorigreq;
    private String numcompxreq;
    private String codmat;
    private String numser;
    private String codtar;
    private String numtar;
    private Boolean codact;
    private String idsolicitudtecnica;

    public AsignacionResponse(String codreq, Integer indorigreq, String numcompxreq, String codmat, String numser, String codtar, String numtar, Boolean codact, String idsolicitudtecnica) {
        this.codreq = codreq;
        this.indorigreq = indorigreq;
        this.numcompxreq = numcompxreq;
        this.codmat = codmat;
        this.numser = numser;
        this.codtar = codtar;
        this.numtar = numtar;
        this.codact = codact;
        this.idsolicitudtecnica = idsolicitudtecnica;
    }

    public AsignacionResponse() {
    }

    public String getCodreq() {
        return codreq;
    }

    public void setCodreq(String codreq) {
        this.codreq = codreq;
    }

    public Integer getIndorigreq() {
        return indorigreq;
    }

    public void setIndorigreq(Integer indorigreq) {
        this.indorigreq = indorigreq;
    }

    public String getNumcompxreq() {
        return numcompxreq;
    }

    public void setNumcompxreq(String numcompxreq) {
        this.numcompxreq = numcompxreq;
    }

    public String getCodmat() {
        return codmat;
    }

    public void setCodmat(String codmat) {
        this.codmat = codmat;
    }

    public String getNumser() {
        return numser;
    }

    public void setNumser(String numser) {
        this.numser = numser;
    }

    public String getCodtar() {
        return codtar;
    }

    public void setCodtar(String codtar) {
        this.codtar = codtar;
    }

    public String getNumtar() {
        return numtar;
    }

    public void setNumtar(String numtar) {
        this.numtar = numtar;
    }

    public Boolean getCodact() {
        return codact;
    }

    public void setCodact(Boolean codact) {
        this.codact = codact;
    }

    public String getIdsolicitudtecnica() {
        return idsolicitudtecnica;
    }

    public void setIdsolicitudtecnica(String idsolicitudtecnica) {
        this.idsolicitudtecnica = idsolicitudtecnica;
    }

}
