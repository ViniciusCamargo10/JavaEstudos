public enum PeriodoEnum {

    MANHA("Manha"),
    Tarde("Tarde"),
    Noite("Noite");

    private String periodo;

    PeriodoEnum(String periodo){
        this.periodo = periodo;
    }

    public String getPeriodo(){
        return this.periodo;
    }


}

