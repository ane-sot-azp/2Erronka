package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Langileak {

	// EZAUGARRIAK
	private int id;
	private String lanpostua;
	private String nan;
	private String izena;
	private String abizena;
	private String telefonoa;
	private String email;
	private String erabiltzailea;
	private String pasahitza;
	private String helbidea;
	private String postakodea;
	
	private static final String URL = "jdbc:mysql://172.16.242.107:3306/1.erronka";
	private static final String ERABILTZAILEA = "administratzailea";
	private static final String PASAHITZA = "1erronka";

	// SORTZAILEAK(CONSTRUCTORES)
	public Langileak() {
	}

	public Langileak(int id, String lanpostua, String nan, String izena, String abizena, String telefonoa, String email,
			String erabiltzailea, String pasahitza, String helbidea, String postakodea) {
		super();
		this.id = id;
		this.lanpostua = lanpostua;
		this.nan = nan;
		this.izena = izena;
		this.abizena = abizena;
		this.telefonoa = telefonoa;
		this.email = email;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.helbidea = helbidea;
		this.postakodea = postakodea;
	}

	// GETTERS eta SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanpostua() {
		return lanpostua;
	}

	public void setLanpostua(String lanpostua) {
		this.lanpostua = lanpostua;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getTelefonoa() {
		return telefonoa;
	}

	public void setTelefonoa(String telefonoa) {
		this.telefonoa = telefonoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getErabiltzailea() {
		return erabiltzailea;
	}

	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public String getPostakodea() {
		return postakodea;
	}

	public void setPostakodea(String postakodea) {
		this.postakodea = postakodea;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Langileak [id=" + id + ", lanpostua=" + lanpostua + ", nan=" + nan + ", izena=" + izena + ", abizena="
				+ abizena + ", telefonoa=" + telefonoa + ", email=" + email + ", erabiltzailea=" + erabiltzailea
				+ ", pasahitza=" + pasahitza + ", helbidea=" + helbidea + ", postakodea=" + postakodea + "]";
	}

	// HASHCODE eta EQUALS
	@Override
	public int hashCode() {
		return Objects.hash(abizena, email, erabiltzailea, helbidea, id, izena, lanpostua, nan, pasahitza, postakodea,
				telefonoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Langileak other = (Langileak) obj;
		return Objects.equals(abizena, other.abizena) && Objects.equals(email, other.email)
				&& Objects.equals(erabiltzailea, other.erabiltzailea) && Objects.equals(helbidea, other.helbidea)
				&& id == other.id && Objects.equals(izena, other.izena) && Objects.equals(lanpostua, other.lanpostua)
				&& Objects.equals(nan, other.nan) && Objects.equals(pasahitza, other.pasahitza)
				&& Objects.equals(postakodea, other.postakodea) && Objects.equals(telefonoa, other.telefonoa);
	}

	// METODOAK
	// Imprimitu metodoa, produktuen datu guztiak ematen dituena.
	public void langileakErakutsi() {
		String kontsulta = "SELECT * FROM langileak LIMIT ? OFFSET ?";
		int limit = 5;
		int offset = 0;
		boolean jarraitu = true;
		Scanner sc = new Scanner(System.in);

		try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA)) {
			while (jarraitu) {
				try (PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {
					deklarazioa.setInt(1, limit);
					deklarazioa.setInt(2, offset);

					try (ResultSet erantzuna = deklarazioa.executeQuery()) {
						if (!erantzuna.isBeforeFirst()) {
							System.out.println("Ez daude langile gehiago erakusteko.");
							break;
						}

						while (erantzuna.next()) {
							int id = erantzuna.getInt("id");
							String lanpostua = erantzuna.getString("lanpostua");
							String nan = erantzuna.getString("nan");
							String izena = erantzuna.getString("izena");
							String abizena = erantzuna.getString("abizena");
							String telefonoa = erantzuna.getString("telefonozenbakia");
							String email = erantzuna.getString("postaelektronikoa");
							String erabiltzaileizena = erantzuna.getString("erabiltzaileizena");
							String pasahitza = erantzuna.getString("pasahitza");
							String helbidea = erantzuna.getString("helbidea");
							String postakodea = erantzuna.getString("postakodea");
							
							
							System.out.println("ID: " + id + "| Lanpostua: " + lanpostua + "| NAN-a: " + nan + "| Izena: " + izena + "| Abizena: "
									+ abizena + "| Telefonoa: " + telefonoa + "| Posta elektronikoa: " + email
									+ "| Erabiltzaile izena: " + erabiltzaileizena	+ "| Pasahitza: " + pasahitza +"| Helbidea: " + helbidea + "| Posta kodea: " + postakodea );
						}
					}
				}

				System.out.print("Hurrengo 5 langileak ikusi nahi dituzu?(bai/ez): ");
				String erantzuna = sc.next();
				if (erantzuna.equalsIgnoreCase("bai")) {
					offset += limit;
				} else {
					jarraitu = false;
				}
			}
		} catch (SQLException e) {
			System.out.println("Zerbaitek ez du funtzionatu.");
		}

	}

}
