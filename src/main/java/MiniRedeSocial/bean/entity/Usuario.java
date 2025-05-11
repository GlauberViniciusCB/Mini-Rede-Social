package MiniRedeSocial.bean.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="USUARIO")
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USUARIO_ID")
    private  long id; 
    
    @Column(name = "USUARIO_NOME", nullable = false,length = 50)
    private String nomeUsuario;

    @Column(name = "USUARIO_EMAIL", nullable = false)
    private String emailUsuario;

    @Column(name = "USUARIO_SENHA", nullable = false )
    private String senhaUsuario;
}
