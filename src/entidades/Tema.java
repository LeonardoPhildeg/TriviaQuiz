/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Leonardo
 */
public enum Tema {
    
    HISTORIA(0),
    GEOGRAFIA(1),
    ESPORTES(2),
    CIENCIAS(3),
    INGLES(4),
    ENTRETENIMENTO(5);
    
    protected Integer id;
    
    Tema(Integer id){
        this.id = id;
    }
}
