package es.upm.miw.pd.state.connection;

public class Conexion {


    private Link link;
    private EstadoConexion estadoConexion;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setEstadoConexion(new Cerrado());
        
    }
   
  	protected void setEstadoConexion(EstadoConexion estadoConexion) {
		this.estadoConexion = estadoConexion;
	}

	public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return estadoConexion.getEstado(this);
    }

    public void abrir() {
    	estadoConexion.abrir(this);
   
    }

    public void cerrar() {
    	estadoConexion.cerrar(this);

    }

    public void parar() {
    	estadoConexion.parar(this);
   
    }

    public void iniciar() {
    	 estadoConexion.iniciar(this);
  
    }

    public void enviar(String msg) {
    	 estadoConexion.enviar(this, msg);
    
    }

    public void recibir(int respuesta) {
    	estadoConexion.recibir(this, respuesta);

    }

}
