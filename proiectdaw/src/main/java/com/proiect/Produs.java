package com.proiect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Produs{
		private Long Id;
		private String Denumire;
		private String Firma;
		private Float Pret;
		
		protected Produs() {
			super();
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getId() {
			return Id;
		}
		public void setId(Long Id) {
			this.Id=Id;
		}
		public String getDenumire() {
			return Denumire;
		}
		public void setDenumire(String Denumire) {
			this.Denumire=Denumire;
		}
		public String getFirma() {
			return Firma;
		}
		public void setFirma(String Firma) {
			this.Firma=Firma;
		}
		
		public Float getPret() {
			return Pret;
		}
		public void setPret(Float Pret) {
			this.Pret=Pret;
		}

	}

