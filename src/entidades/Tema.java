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
    
    HISTÓRIA(1),
    GEOGRAFIA(2),
    ESPORTES(3),
    CIENCIAS(4),
    INGLES(5),
    ENTRETENIMENTO(6);
    
    protected Integer id;
    
    Tema(Integer id){
        this.id = id;
    }
}
