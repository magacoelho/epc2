package es.upm.miw.pd.state.connection;

public class Conexion {
    //private Estado estado;

    private Link link;
    private EstadoConexion estadoConexion;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.setEstadoConexion(new Cerrado());//???
        //this.estado = Estado.CERRADO;
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
       /* if (this.estado == Estado.CERRADO) {
            this.estado = Estado.PREPARADO;
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else
            assert false : "estado imposible";*/
    }

    public void cerrar() {
    	estadoConexion.cerrar(this);
       /* if (this.estado == Estado.CERRADO) {
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.estado = Estado.CERRADO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";*/
    }

    public void parar() {
    	estadoConexion.parar(this);
     /*   if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
        } else if (this.estado == Estado.PREPARADO) {
            this.estado = Estado.PARADO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";*/
    }

    public void iniciar() {
    	 estadoConexion.iniciar(this);
      /*  if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            this.estado = Estado.PREPARADO;
        } else if (this.estado == Estado.PREPARADO) {
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";*/
    }

    public void enviar(String msg) {
    	 estadoConexion.enviar(this, msg);
      /*  if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            this.link.enviar(msg);
            this.estado = Estado.ESPERANDO;
        } else if (this.estado == Estado.ESPERANDO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        }
        assert false : "estado imposible";*/
    }

    public void recibir(int respuesta) {
    	estadoConexion.recibir(this, respuesta);
      /*  if (this.estado == Estado.CERRADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.PREPARADO) {
            throw new UnsupportedOperationException("Acción no permitida... ");
        } else if (this.estado == Estado.ESPERANDO) {
            if (respuesta == 0) {
                this.estado = Estado.PREPARADO;
            } else {
                this.estado = Estado.CERRADO;
            }
        }
        assert false : "estado imposible";*/
    }

}
