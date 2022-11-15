public class Pez {
        //solo tiene atributo nombre
        private String nombre;

        //contructor por defecto
        public Pez(){

        }
        //constructor que cree un objeto Pez con los mismos atributos que el objeto principal
        public Pez(Pez p){
            this.nombre=p.nombre;
        }
        //Método set del nombre
        public void setNombre(String nombre){ this.nombre=nombre;
        }
        //Método get del nombre
        public String getNombre(){
            return nombre;
        }
    }

