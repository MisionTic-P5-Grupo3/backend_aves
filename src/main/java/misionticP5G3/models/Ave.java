package misionticP5G3.models;

import org.springframework.data.annotation.Id;

public class Ave {
    @Id
    private String nombreCientificoAve;
    private String nombreAve;
    private String tipoAve;
    private Integer tamaño;

    public Ave(String nombreCientificoAve, String nombreAve, String tipoAve, Integer tamaño) {
        this.nombreCientificoAve = nombreCientificoAve;
        this.nombreAve = nombreAve;
        this.tipoAve = tipoAve;
        this.tamaño = tamaño;
    }

    /**
     * @return the nombreAve
     */
    public String getNombreAve() {
        return nombreAve;
    }

    /**
     * @param nombreAve the nombreAve to set
     */
    public void setNombreAve(String nombreAve) {
        this.nombreAve = nombreAve;
    }

    /**
     * @return the nombreCientificoAve
     */
    public String getNombreCientificoAve() {
        return nombreCientificoAve;
    }

    /**
     * @param nombreCientificoAve the nombreCientificoAve to set
     */
    public void setNombreCientificoAve(String nombreCientificoAve) {
        this.nombreCientificoAve = nombreCientificoAve;
    }

    /**
     * @return the tipoAve
     */
    public String getTipoAve() {
        return tipoAve;
    }

    /**
     * @param tipoAve the tipoAve to set
     */
    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }

    /**
     * @return the tamaño
     */
    public Integer getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }

}
