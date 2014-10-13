package es.upm.miw.pd.state.connection;

public class Preparado extends EstadoConexion {
    public Preparado(){
    	estado= Estado.PREPARADO;
     }
	
	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstadoConexion(this);

	}
    @Override
	public void cerrar(Conexion conexion) {
		conexion.setEstadoConexion(new Cerrado());

	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstadoConexion(new Parado());

	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstadoConexion(this);

	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		
		conexion.getLink().enviar(msg);
		
		conexion.setEstadoConexion(new Esperando());

	}

	@Override
	public void recibir(Conexion conexion,  int respuesta) {
		 throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
