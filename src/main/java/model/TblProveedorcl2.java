package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_proveedorcl2 database table.
 * 
 */
@Entity
@Table(name="tbl_proveedorcl2")
@NamedQuery(name="TblProveedorcl2.findAll", query="SELECT t FROM TblProveedorcl2 t")
public class TblProveedorcl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproveedorcl2;

	private String emailproveedorcl2;

	@Temporal(TemporalType.DATE)
	private Date feingproveedorcl2;

	private String nomproveedorcl2;

	private String rsocialproveedorcl2;

	private String rucproveedorcl2;

	public TblProveedorcl2() {
	}

	public int getIdproveedorcl2() {
		return this.idproveedorcl2;
	}

	public void setIdproveedorcl2(int idproveedorcl2) {
		this.idproveedorcl2 = idproveedorcl2;
	}

	public String getEmailproveedorcl2() {
		return this.emailproveedorcl2;
	}

	public void setEmailproveedorcl2(String emailproveedorcl2) {
		this.emailproveedorcl2 = emailproveedorcl2;
	}

	public Date getFeingproveedorcl2() {
		return this.feingproveedorcl2;
	}

	public void setFeingproveedorcl2(Date feingproveedorcl2) {
		this.feingproveedorcl2 = feingproveedorcl2;
	}

	public String getNomproveedorcl2() {
		return this.nomproveedorcl2;
	}

	public void setNomproveedorcl2(String nomproveedorcl2) {
		this.nomproveedorcl2 = nomproveedorcl2;
	}

	public String getRsocialproveedorcl2() {
		return this.rsocialproveedorcl2;
	}

	public void setRsocialproveedorcl2(String rsocialproveedorcl2) {
		this.rsocialproveedorcl2 = rsocialproveedorcl2;
	}

	public String getRucproveedorcl2() {
		return this.rucproveedorcl2;
	}

	public void setRucproveedorcl2(String rucproveedorcl2) {
		this.rucproveedorcl2 = rucproveedorcl2;
	}

}