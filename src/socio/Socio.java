/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socio;

/**
 * @author Ithaisa
 * @version 1.0
 */

/**
 * Clase socio
 */
public class Socio {
    
        //Atributos
    /**
     * nombre
     * apellidos
     * direccion
     * email
     * poblacion
     */
    
        private String nombre;
        private String apellidos;
        private String direccion;
        private String email;
        private String poblacion;



        //Métodos

        //Constructor por defecto
    
        /**
         *  Parámetros que recibe el constructor
         * @param nombre
         * @param apellidos
         * @param direccion
         * @param email
         * @param poblacion
         */
        public Socio(String nombre, String apellidos, String direccion, String email, String poblacion){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.direccion = direccion;
            this.email = email;
            this.poblacion = poblacion;
        }

        //Getter y setter

    /**
     * Devuelve nombre
     * @return nombre
     */
    public String getNombre() {
            return nombre;
        }

    /**
     * Introduce un nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    /**
     * Devuelve apellidos
     * @return apellidos
     */

    public String getApellidos() {
            return apellidos;
        }

    /**
     * Introduce los apellidos
     * @param apellidos
     */
        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }


    /**
     *  Devuelve dirección
     * @return direccion
     */

    public String getDireccion() {
            return direccion;
        }

    /**
     * Introduce una dirección
     * @param direccion
     */

    public void setDireccion(String direccion) {
            this.direccion = direccion;
        }


    /**
     * Devuelve email
     * @return email
     */

    public String getEmail() {
            return email;
        }

    /**
     * Introduce un email
     * @param email
     */

    public void setEmail(String email) {
            this.email = email;
        }


    /**
     * Devuelve población
     * @return poblacion
     */

    public String getPoblacion() {
            return poblacion;
        }


    /**
     * Introduce una población
     * @param poblacion
     */
    public void setPoblacion(String poblacion) {
            this.poblacion = poblacion;
        }



        //Metodos

    /**
     * Este método sirve para crear un pedido
     * Deberia ser un Objeto de la clase articulo pero lo pongo como string porque la clase articulo no lo voy a implementar
     * @param articulo
     * @param cantidad
     */
        public void CrearPedido(String articulo, int cantidad){

        }

    /**
     * Este método sirve para visualizar un pedido
     * @param numeroPedido
     */

    public void VisualizarPedido(int numeroPedido){

        }

    /**
     * Este método sirve para cancelar un pedido
     * @param numeroPedido
     */

    public void CancelarPedido(int numeroPedido){

        }


    /**
     * Estge método sirve para modificar un pedido
     * @param numeroPedido
     */
    public void ModificaPedido(int numeroPedido){

        }

    }

