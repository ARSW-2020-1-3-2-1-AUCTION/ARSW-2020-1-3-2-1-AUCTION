package edu.escuelaing.arsw.auctions.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity(name="usuario")
@Table(name="usuario")
public class Usuario implements Serializable{     
	
    	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
        int id;
        
        @Column(name="contrasena")
        private String Contrasena; 
        
        @Column(name="saldo")
        private int Saldo;
        
        @Column(name="puntuacion")
        private int Puntuacion;
        
        public Usuario() {
            
    	}
        
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}        
        
        public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		this.Contrasena = contrasena;
	}
	
	public int getSaldo() {
		return Saldo;
	}

	public void setSaldo(int saldo) {
		this.Saldo = saldo;
	}

	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.Puntuacion  = puntuacion;
	}
	
}