public class Car {
    private int  cilindrata;
    private String  targa;
    private String  auto;
    private String  modello;

    public Car (int cilindrata, String targa, String auto, String modello){
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.auto = auto;
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getModello(){
        return  modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void showDetails(){
        System.out.println("Auto: " + auto);
        System.out.println("Modello : " + modello);
        System.out.println("Cilindrata: " + cilindrata);
        System.out.println("Targa: " + targa);
    }


}
