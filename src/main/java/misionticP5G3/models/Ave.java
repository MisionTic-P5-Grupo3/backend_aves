package misionticP5G3.models;

import org.springframework.data.annotation.Id;

public class Ave {
    @Id
    private String id;
    private String  nombreCientificoAve;
    private String  nombreAve;
    private String  tipoAve;
    private Integer tamano;
    private String  descripcion;
    private String  url;



    public Ave(String id, String nombreCientificoAve, String nombreAve, String tipoAve, Integer tamano, String  descripcion, String  url) {
        this.id = id;
        this.nombreCientificoAve = nombreCientificoAve;
        this.nombreAve = nombreAve;
        this.tipoAve = tipoAve;
        this.tamano = tamano;
        this.descripcion = descripcion;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * @return the tamano
     */
    public Integer getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
