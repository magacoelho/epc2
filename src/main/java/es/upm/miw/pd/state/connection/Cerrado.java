package es.upm.miw.pd.state.connection;

public class Cerrado extends EstadoConexion {
   
	public Cerrado(){
		estado= Estado.CERRADO;
    }
	
	@Override
	public void abrir(Conexion conexion) {
		conexion.setEstadoConexion(new Preparado());
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		
		conexion.setEstadoConexion(this);
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Acción no permitida... ");	
	}

}
