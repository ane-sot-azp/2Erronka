package erronka2;

import java.util.Objects;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produktuak {

	// EZAUGARRIAK
	private int id;
	private String mota;
	private String marka;
	private String modeloa;
	private String memoria;
	private String prozesagailua;
	private String tamaina;
	private String sistemaEragilea;
	private String kamara;
	private String resoluzioa;
	private String frekuentzia;
	private String kolorea;
	private double erosketaPrezioa;
	private double salmentaPrezioa;
	private boolean stocka;

	// Datu basearekin konektatzeko datuak
	private static final String URL = "jdbc:mysql://172.16.242.107:3306/1.erronka";
	private static final String ERABILTZAILEA = "administratzailea";
	private static final String PASAHITZA = "1erronka";

	// SORTZAILEAK(CONSTRUCTORES)
	public Produktuak() {
	}

	public Produktuak(int id, String mota, String marka, String modeloa, String memoria, String prozesagailua,
			String tamaina, String sistemaEragilea, String kamara, String resoluzioa, String frekuentzia,
			String kolorea, double erosketaPrezioa, double salmentaPrezioa, boolean stocka) {
		super();
		this.id = id;
		this.mota = mota;
		this.marka = marka;
		this.modeloa = modeloa;
		this.memoria = memoria;
		this.prozesagailua = prozesagailua;
		this.tamaina = tamaina;
		this.sistemaEragilea = sistemaEragilea;
		this.kamara = kamara;
		this.resoluzioa = resoluzioa;
		this.frekuentzia = frekuentzia;
		this.kolorea = kolorea;
		this.erosketaPrezioa = erosketaPrezioa;
		this.salmentaPrezioa = salmentaPrezioa;
		this.stocka = stocka;
	}

	// GETTERS eta SETTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModeloa() {
		return modeloa;
	}

	public void setModeloa(String modeloa) {
		this.modeloa = modeloa;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getProzesagailua() {
		return prozesagailua;
	}

	public void setProzesagailua(String prozesagailua) {
		this.prozesagailua = prozesagailua;
	}

	public String getTamaina() {
		return tamaina;
	}

	public void setTamaina(String tamaina) {
		this.tamaina = tamaina;
	}

	public String getSistemaEragilea() {
		return sistemaEragilea;
	}

	public void setSistemaEragilea(String sistemaEragilea) {
		this.sistemaEragilea = sistemaEragilea;
	}

	public String getKamara() {
		return kamara;
	}

	public void setKamara(String kamara) {
		this.kamara = kamara;
	}

	public String getResoluzioa() {
		return resoluzioa;
	}

	public void setResoluzioa(String resoluzioa) {
		this.resoluzioa = resoluzioa;
	}

	public String getFrekuentzia() {
		return frekuentzia;
	}

	public void setFrekuentzia(String frekuentzia) {
		this.frekuentzia = frekuentzia;
	}

	public String getKolorea() {
		return kolorea;
	}

	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}

	public double getErosketaPrezioa() {
		return erosketaPrezioa;
	}

	public void setErosketaPrezioa(double erosketaPrezioa) {
		this.erosketaPrezioa = erosketaPrezioa;
	}

	public double getSalmentaPrezioa() {
		return salmentaPrezioa;
	}

	public void setSalmentaPrezioa(double salmentaPrezioa) {
		this.salmentaPrezioa = salmentaPrezioa;
	}

	public boolean isStocka() {
		return stocka;
	}

	public void setStock(boolean stocka) {
		this.stocka = stocka;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Produktuak [id=" + id + ", mota=" + mota + ", marka=" + marka + ", modeloa=" + modeloa + ", memoria="
				+ memoria + ", prozesagailua=" + prozesagailua + ", tamaina=" + tamaina + ", sistemaEragilea="
				+ sistemaEragilea + ", kamara=" + kamara + ", resoluzioa=" + resoluzioa + ", frekuentzia=" + frekuentzia
				+ ", kolorea=" + kolorea + ", erosketaPrezioa=" + erosketaPrezioa + ", salmentaPrezioa="
				+ salmentaPrezioa + ", stocka=" + stocka + "]";
	}

	// HASHCODE eta EQUALS

	@Override
	public int hashCode() {
		return Objects.hash(erosketaPrezioa, frekuentzia, id, kamara, kolorea, marka, memoria, modeloa, mota,
				prozesagailua, resoluzioa, salmentaPrezioa, sistemaEragilea, stocka, tamaina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produktuak other = (Produktuak) obj;
		return Double.doubleToLongBits(erosketaPrezioa) == Double.doubleToLongBits(other.erosketaPrezioa)
				&& Objects.equals(frekuentzia, other.frekuentzia) && id == other.id
				&& Objects.equals(kamara, other.kamara) && Objects.equals(kolorea, other.kolorea)
				&& Objects.equals(marka, other.marka) && Objects.equals(memoria, other.memoria)
				&& Objects.equals(modeloa, other.modeloa) && Objects.equals(mota, other.mota)
				&& Objects.equals(prozesagailua, other.prozesagailua) && Objects.equals(resoluzioa, other.resoluzioa)
				&& Double.doubleToLongBits(salmentaPrezioa) == Double.doubleToLongBits(other.salmentaPrezioa)
				&& Objects.equals(sistemaEragilea, other.sistemaEragilea) && stocka == other.stocka
				&& Objects.equals(tamaina, other.tamaina);
	}

	// METODOAK
	// Imprimitu metodoa, produktuen datu guztiak ematen dituena.
	public void inprimitu() {
		System.out.println("Hau da produktuaren informazioa: \n id kodea: " + id + "\n Mota: " + mota + "\n Marka: "
				+ marka + "\n Modeloa: " + modeloa + "\n Memoria: " + memoria + "\n Prozesagailua: " + prozesagailua
				+ "\n Tamaina: " + tamaina + "\n Sistema eragilea: " + sistemaEragilea + "\n Mota: " + mota
				+ "\n Marka: " + marka + "\n Modeloa: " + modeloa + "\n Kamara: " + kamara + "\n Resoluzioa: "
				+ resoluzioa + "\n Frekuentzia: " + frekuentzia + "\n Kolorea: " + kolorea + "\n Erosketa prezioa: "
				+ erosketaPrezioa + "\n Salmenta prezioa: " + salmentaPrezioa + "\n Stock-a: " + stocka);
	}

	public void produktuakErakutsi() {
		String kontsulta = "SELECT * FROM produktuak LIMIT ? OFFSET ?";
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
							System.out.println("Ez daude produktu gehiago erakusteko.");
							break;
						}

						while (erantzuna.next()) {
							int id = erantzuna.getInt("id");
							String mota = erantzuna.getString("mota");
							String marka = erantzuna.getString("marka");
							String modeloa = erantzuna.getString("modeloa");
							String memoria = erantzuna.getString("memoria");
							String prozesagailua = erantzuna.getString("prozesagailua");
							String tamaina = erantzuna.getString("tamaina");
							String sistemaEragilea = erantzuna.getString("sistemaEragilea");
							String kamara = erantzuna.getString("kamara");
							String resoluzioa = erantzuna.getString("resoluzioa");
							String frekuentzia = erantzuna.getString("frekuentzia");
							String kolorea = erantzuna.getString("kolorea");
							double erosketaPrezioa = erantzuna.getDouble("erosketaPrezioa");
							double salmentaPrezioa = erantzuna.getDouble("salmentaPrezioa");
							boolean stocka = erantzuna.getBoolean("stocka");

							System.out.println("ID: " + id + "| Mota: " + mota + "| Marka: " + marka + "| Modeloa: "
									+ modeloa + "| Memoria: " + memoria + "| Prozesagailua: " + prozesagailua
									+ "| Tamaina: " + tamaina + "| Sistema Eragilea: " + sistemaEragilea + "| Kamera: "
									+ kamara + "| Resoluzioa: " + resoluzioa + "| Frekuentzia: " + frekuentzia
									+ "| Kolorea: " + kolorea + "| Erosketa Prezioa: " + erosketaPrezioa
									+ "| Salmenta Prezioa: " + salmentaPrezioa + "| Stocka: " + stocka);
						}
					}
				}

				System.out.print("Hurrengo 5 produktuak ikusi nahi dituzu?(bai/ez): ");
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

	public void produktuakGehitu() {
		String kontsulta = "INSERT INTO produktuak (mota, marka, modeloa, memoria, prozesagailua, tamaina, sistemaEragilea, kamara, resoluzioa, frekuentzia, kolorea, erosketaPrezioa, salmentaPrezioa, stocka) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Scanner scanner = new Scanner(System.in);

		try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
				PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {

			// Solicitar datos del usuario
			System.out.print("Sartu produktuaren mota: ");
			String mota = scanner.nextLine();

			System.out.print("Sartu produktuaren marka: ");
			String marka = scanner.nextLine();

			System.out.print("Sartu produktuaren modeloa: ");
			String modeloa = scanner.nextLine();
			
			System.out.print("Sartu produktuaren memoria: ");
			String memoria = scanner.nextLine();

			System.out.print("Sartu produktuaren prozesagailua: ");
			String prozesagailua = scanner.nextLine();

			System.out.print("Sartu produktuaren tamaina: ");
			String tamaina = scanner.nextLine();

			System.out.print("Sartu produktuaren sistema eragilea: ");
			String sistemaEragilea = scanner.nextLine();

			System.out.print("Sartu produktuaren kamara: ");
			String kamara = scanner.nextLine();

			System.out.print("Sartu produktuaren resoluzioa: ");
			String resoluzioa = scanner.nextLine();

			System.out.print("Sartu produktuaren frekuentzia: ");
			String frekuentzia = scanner.nextLine();

			System.out.print("Sartu produktuaren kolorea: ");
			String kolorea = scanner.nextLine();

			System.out.print("Sartu produktuaren erosketa prezioa: ");
			double erosketaPrezioa = scanner.nextDouble();

			System.out.print("Sartu produktuaren salmenta prezioa: ");
			double salmentaPrezioa = scanner.nextDouble();

			System.out.print("Stocka dago? (true/false): ");
			boolean stocka = scanner.nextBoolean();

			// Configurar los parámetros en la consulta
			deklarazioa.setString(1, mota);
			deklarazioa.setString(2, marka);
			deklarazioa.setString(3, modeloa);
			deklarazioa.setString(4, memoria);
			deklarazioa.setString(5, prozesagailua);
			deklarazioa.setString(6, tamaina);
			deklarazioa.setString(7, sistemaEragilea);
			deklarazioa.setString(8, kamara);
			deklarazioa.setString(9, resoluzioa);
			deklarazioa.setString(10, frekuentzia);
			deklarazioa.setString(11, kolorea);
			deklarazioa.setDouble(12, erosketaPrezioa);
			deklarazioa.setDouble(13, salmentaPrezioa);
			deklarazioa.setBoolean(14, stocka);

			// Ejecuta la inserción
			int lerroak = deklarazioa.executeUpdate();
			System.out.println("Ongi sartu dituzu datuak. Sartutako lerroak: " + lerroak);
		} catch (SQLException e) {
			System.out.println("Zerbaitek ez du funtzionatu.");
		}
	}

public void produktuakEguneratu() {
	String kontsulta = "UPDATE produktuak SET mota=?, marka=?, modeloa=?, memoria=?, prozesagailua=?, tamaina=?, sistemaEragilea=?, kamara=?, resoluzioa=?, frekuentzia=?, kolorea=?, erosketaPrezioa=?, salmentaPrezioa=?, stocka=? WHERE id=?";
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Sartu aldatu nahi duzun produktuaren id-a:");
	int id= scanner.nextInt();
	scanner.nextLine();

	try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
			PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {

		// Solicitar datos del usuario
			
		System.out.print("Sartu produktuaren mota: ");
		String mota = scanner.nextLine();

		System.out.print("Sartu produktuaren marka: ");
		String marka = scanner.nextLine();

		System.out.print("Sartu produktuaren modeloa: ");
		String modeloa = scanner.nextLine();
		
		System.out.print("Sartu produktuaren memoria: ");
		String memoria = scanner.nextLine();

		System.out.print("Sartu produktuaren prozesagailua: ");
		String prozesagailua = scanner.nextLine();

		System.out.print("Sartu produktuaren tamaina: ");
		String tamaina = scanner.nextLine();

		System.out.print("Sartu produktuaren sistema eragilea: ");
		String sistemaEragilea = scanner.nextLine();

		System.out.print("Sartu produktuaren kamara: ");
		String kamara = scanner.nextLine();

		System.out.print("Sartu produktuaren resoluzioa: ");
		String resoluzioa = scanner.nextLine();

		System.out.print("Sartu produktuaren frekuentzia: ");
		String frekuentzia = scanner.nextLine();

		System.out.print("Sartu produktuaren kolorea: ");
		String kolorea = scanner.nextLine();

		System.out.print("Sartu produktuaren erosketa prezioa: ");
		double erosketaPrezioa = scanner.nextDouble();

		System.out.print("Sartu produktuaren salmenta prezioa: ");
		double salmentaPrezioa = scanner.nextDouble();

		System.out.print("Stocka dago? (true/false): ");
		boolean stocka = scanner.nextBoolean();

		// Configurar los parámetros en la consulta
		deklarazioa.setString(1, mota);
		deklarazioa.setString(2, marka);
		deklarazioa.setString(3, modeloa);
		deklarazioa.setString(4, memoria);
		deklarazioa.setString(5, prozesagailua);
		deklarazioa.setString(6, tamaina);
		deklarazioa.setString(7, sistemaEragilea);
		deklarazioa.setString(8, kamara);
		deklarazioa.setString(9, resoluzioa);
		deklarazioa.setString(10, frekuentzia);
		deklarazioa.setString(11, kolorea);
		deklarazioa.setDouble(12, erosketaPrezioa);
		deklarazioa.setDouble(13, salmentaPrezioa);
		deklarazioa.setBoolean(14, stocka);
		deklarazioa.setInt(15, id);

		// Ejecuta la inserción
		int lerroak = deklarazioa.executeUpdate();
		System.out.println("Ongi sartu dituzu datuak. Sartutako lerroak: " + lerroak);
	} catch (SQLException e) {
		System.out.println("Zerbaitek ez du funtzionatu.");
	}
}

public void produktuakEzabatu() {
	String kontsulta = "DELETE FROM produktuak WHERE id=?";
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Sartu ezabatu nahi duzun produktuaren id-a:");
	int id= scanner.nextInt();
	scanner.nextLine();

	try (Connection konexioa = DriverManager.getConnection(URL, ERABILTZAILEA, PASAHITZA);
			PreparedStatement deklarazioa = konexioa.prepareStatement(kontsulta)) {

		// Solicitar datos del usuario
			
		
		deklarazioa.setInt(1, id);

		// Ejecuta la inserción
		int lerroak = deklarazioa.executeUpdate();
		System.out.println("Ongi ezabatu dira datuak. Ezabatutako lerroak: " + lerroak);
	} catch (SQLException e) {
		System.out.println("Zerbaitek ez du funtzionatu.");
	}
}
}
