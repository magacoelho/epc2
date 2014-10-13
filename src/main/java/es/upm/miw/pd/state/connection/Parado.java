package es.upm.miw.pd.state.connection;

public class Parado extends EstadoConexion {
    public Parado(){
    	estado= Estado.PARADO;
    }
	@Override
	public Estado getEstado(Conexion conexion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enviar(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void recibir(Conexion conexion,  int respuesta) {
		// TODO Auto-generated method stub

	}

}
