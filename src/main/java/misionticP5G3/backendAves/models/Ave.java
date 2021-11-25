package misionticP5G3.backendAves.models;

import org.springframework.data.annotation.Id;

public class Ave {
    @Id
    private Integer idAve;
    private String nombreAve;
    private String nombreCientificoAve;
    private String tipoAve;
    private String colorCuerpo;
    private Integer tamaño;
    
    public Ave(Integer idAve, String nombreAve, String nombreCientificoAve, String tipoAve, String colorCuerpo, Integer tamaño){
        this.idAve=idAve;
        this.nombreAve=nombreAve;
        this.nombreCientificoAve=nombreCientificoAve;
        this.tipoAve=tipoAve;
        this.colorCuerpo=colorCuerpo;
        this.tamaño=tamaño;
    }

    /**
     * @return the idAve
     */
    public Integer getIdAve() {
        return idAve;
    }

    /**
     * @param idAve the idAve to set
     */
    public void setIdAve(Integer idAve) {
        this.idAve = idAve;
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
     * @return the colorCuerpo
     */
    public String getColorCuerpo() {
        return colorCuerpo;
    }

    /**
     * @param colorCuerpo the colorCuerpo to set
     */
    public void setColorCuerpo(String colorCuerpo) {
        this.colorCuerpo = colorCuerpo;
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
