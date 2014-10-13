package es.upm.miw.pd.state.connection;

public class Parado extends EstadoConexion {
    public Parado(){
    	estado= Estado.PARADO;
    }
	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstadoConexion(this);

	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstadoConexion(new Preparado());

	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void recibir(Conexion conexion,  int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
