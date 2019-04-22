/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrojasce
 */
public class librosarrays {
    private libro[]libros;

    public libro[] getLibros() {
        return libros;
    }

    public void setLibros(libro[] libros) {
        this.libros = libros;
    }

    public librosarrays(libro[] libros) {
        this.libros = libros;
    }
   public boolean añadirl (libro libros1){
       for (int i=0;i<10;i++){
       if (this.libros[i]==null){
           this.libros[i]=libros1;
           if ( this.libros[i].getTitulo()==libros1.getTitulo()){
           return false;
           }
           else {
           return true;
           }
       }
       }
       return false;
   }
   public  boolean eliminarl (libro libros1){
       for (int i=0;i<10;i++){
       if ( this.libros[i].getTitulo()==libros1.getTitulo()){
           this.libros[i]= null;
           return true;
       }
       else {
           return false;
       }
       }
       for (int i=0;i<10;i++){
       if ( this.libros[i].getAutor()==libros1.getAutor()){
           this.libros[i]= null;
           return true;
       }
       else {
           return false;
       }
       }
       return true; 
       }
}























