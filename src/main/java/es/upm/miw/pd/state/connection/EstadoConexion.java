package es.upm.miw.pd.state.connection;

public abstract class EstadoConexion {
	protected Estado estado;
	public  Estado getEstado(Conexion conexion){
		return estado;
	} 
	public abstract void abrir(Conexion conexion); 
    public abstract void cerrar(Conexion conexion) ;
    public abstract void parar(Conexion conexion);
    public abstract void iniciar(Conexion conexion); 
    public abstract void enviar(Conexion conexion); 
    public abstract void recibir(Conexion conexion);
}
