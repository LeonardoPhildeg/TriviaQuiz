package entidades;

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
