package clases;

import java.util.List;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class genero implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idGenero;
        private String nombre;
        
        @OneToMany(mappedBy = "genero")
        private List<libro> libros;
        
        public genero() {
        }
        
        public genero(String nombre) {
            this.nombre = nombre;
        }
        
        public int getId() {
            return idGenero;
        }

        public void setId(int idGenero) {
            this.idGenero = idGenero;
        }

        public String getNombre() {
            return nombre;
        }

         public List<libro> getLibros() {
            return libros;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
}
