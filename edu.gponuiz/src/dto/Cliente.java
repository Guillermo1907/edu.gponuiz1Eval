package dto;

public class Cliente {
		
		public long id;
		public String nombre;
		public String apellidos;
		
		public Cliente(long id, String nombre, String apellidos) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.apellidos = apellidos;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellidos() {
			return apellidos;
		}

		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}

		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
		}
		
		
		

	

}
