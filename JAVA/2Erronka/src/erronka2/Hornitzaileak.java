package erronka2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

public class Hornitzaileak {

	// EZAUGARRIAK
	private int id;
	private String nan;
	private String izena;
	private String telefonoa;
	private String email;
	private String helbidea;
	private String herria;
	private String postakodea;
	
	private static final String URL = "jdbc:mysql://172.16.242.107:3306/1.erronka";
	private static final String ERABILTZAILEA = "administratzailea";
	private static final String PASAHITZA = "1erronka";

	// SORTZAILEAK(CONSTRUCTORES)
	public Hornitzaileak() {
	}	
	
	public Hornitzaileak(int id, String nan, String izena, String telefonoa, String email, String helbidea,
			String herria, String postakodea) {
		super();
		this.id = id;
		this.nan = nan;
		this.izena = izena;
		this.telefonoa = telefonoa;
		this.email = email;
		this.helbidea = helbidea;
		this.herria = herria;
		this.postakodea = postakodea;
	}




	// GETTERS eta SETTERS	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getHelbidea() {
		return helbidea;
	}

	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}

	public String getHerria() {
		return herria;
	}

	public void setHerria(String herria) {
		this.herria = herria;
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
		return "Hornitzaileak [id=" + id + ", nan=" + nan + ", izena=" + izena + ", telefonoa=" + telefonoa + ", email="
				+ email + ", helbidea=" + helbidea + ", herria=" + herria + ", postakodea=" + postakodea + "]";
	}
	
	// HASHCODE eta EQUALS



	@Override
	public int hashCode() {
		return Objects.hash(email, helbidea, herria, id, izena, nan, postakodea, telefonoa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hornitzaileak other = (Hornitzaileak) obj;
		return Objects.equals(email, other.email) && Objects.equals(helbidea, other.helbidea)
				&& Objects.equals(herria, other.herria) && id == other.id && Objects.equals(izena, other.izena)
				&& Objects.equals(nan, other.nan) && Objects.equals(postakodea, other.postakodea)
				&& Objects.equals(telefonoa, other.telefonoa);
	}

	// METODOAK
	// Imprimitu metodoa, produktuen datu guztiak ematen dituena.
	public void hornitzaileakErakutsi() {
		String kontsulta = "SELECT * FROM hornitzaileak LIMIT ? OFFSET ?";
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
							System.out.println("Ez daude hornitzaile gehiago erakusteko.");
							break;
						}

						while (erantzuna.next()) {
							int id = erantzuna.getInt("id");
							String nan = erantzuna.getString("nifedocif");
							String izena = erantzuna.getString("izena");
							String telefonoa = erantzuna.getString("telefonozenbakia");
							String email = erantzuna.getString("postaelektronikoa");
							String helbidea = erantzuna.getString("helbidea");
							String herria = erantzuna.getString("herria");
							String postakodea = erantzuna.getString("postakodea");
							
							
							System.out.println("ID: " + id + "| NIF-a: " + nan + "| Izena: " + izena  + "| Telefonoa: " + telefonoa + "| Posta elektronikoa: " + email
									+ "| Helbidea: " + helbidea + "| Posta kodea: " + postakodea );
						}
					}
				}

				System.out.print("Hurrengo 5 hornitzaileak ikusi nahi dituzu?(bai/ez): ");
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
