import java.util.Scanner;

public class Samochod {
  private String marka;
  private String model;
  private double przebieg;
  private double paliwo;
  private double spalanie;
  private double maxBak;

  public Samochod() {
    marka = "Opel";
    model = "Astra";
    przebieg = 5;
    paliwo = 35;
    maxBak = 35;
    spalanie = 7.5;
  }

  public Samochod(String marka, String model, double przebieg, double paliwo, double maxBak, double spalanie) {
    this.marka = marka;
    this.model = model;
    this.przebieg = przebieg;
    this.paliwo = paliwo;
    this.maxBak = maxBak;
    this.spalanie = spalanie;
  }

  public void Wczytaj() {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Podaj marke: ");
      String marka = scan.next();
      System.out.print("Podaj model: ");
      String model = scan.next();
      System.out.print("Podaj przebieg: ");
      double przebieg = scan.nextDouble();
      System.out.print("Podaj ilość paliwa: ");
      double paliwo = scan.nextDouble();
      System.out.print("Podaj pojemność baku paliwa: ");
      double maxBak = scan.nextDouble();
      System.out.print("Podaj spalanie (l/100km): ");
      double spalanie = scan.nextDouble();

      this.marka = marka;
      this.model = model;
      this.przebieg = przebieg;
      this.paliwo = paliwo;
      this.maxBak = maxBak;
      this.spalanie = spalanie;
    }
  }

  public void Wypisz() {
    System.out.println("\nDane auta");
    System.out.println("---------");
    System.out.println("Marka: " + marka);
    System.out.println("Model: " + model);
    System.out.println("Przebieg: " + przebieg);
    System.out.println("Ilosc paliwa: " + paliwo);
    System.out.println("Pojemność baku paliwa: " + maxBak);
    System.out.println("Spalanie (l/100km): " + spalanie);
  }

  // getery
  public String GetMarka() {
    return marka;
  }

  public String GetModel() {
    return model;
  }

  public double GetPrzebieg() {
    return przebieg;
  }

  public double GetPaliwo() {
    return paliwo;
  }

  public double GetMaxBak() {
    return maxBak;
  }

  public double GetSpalanie() {
    return spalanie;
  }

  // setery
  public void SetMarka(String marka) {
    this.marka = marka;
  }

  public void SetModel(String model) {
    this.model = model;
  }

  public void SetPrzebieg(double przebieg) {
    this.przebieg = przebieg;
  }

  public void SetPaliwo(double paliwo) {
    this.paliwo = paliwo;
  }

  public void SetMaxBak(double maxBak) {
    this.maxBak = maxBak;
  }

  public void SetSpalanie(double spalanie) {
    this.spalanie = spalanie;
  }

  public void Inicjalizuj(String marka, String model, double przebieg, double paliwo, double maxBak, double spalanie) {
    this.marka = marka;
    this.model = model;
    this.przebieg = przebieg;
    this.paliwo = paliwo;
    this.maxBak = maxBak;
    this.spalanie = spalanie;
  }

  public void Tankuj(double ilosc) {
    double stan = this.GetPaliwo();
    double maxstan = this.GetMaxBak();

    if (stan < maxstan) {
      if (stan + ilosc <= maxstan) {
        this.SetPaliwo(this.GetPaliwo() + ilosc);
        System.out.println("Pomyślnie zatankowano pojazd twój stan paliwa to: " + this.GetPaliwo());
      } else {
        double ileZatankowal = ilosc - (this.GetPaliwo() + ilosc - this.GetMaxBak());
        this.SetPaliwo(this.GetPaliwo() + ileZatankowal);
        System.out.println("Masz za dużo paliwa zatankowałeś tylko: " + ileZatankowal
            + "l. Twój aktualny stan paliwa to: " + this.GetPaliwo());
      }
    } else
      System.out.println("Masz pełny bak paliwa - brak możliwości tankowania!");
  }

  public void Jedz(double km) {
    if ((this.GetPaliwo() * 100) / this.GetSpalanie() >= km) {
      this.SetPrzebieg(this.GetPrzebieg() + km);
      this.SetPaliwo(this.GetPaliwo() - ((km * this.GetSpalanie()) / 100));
      System.out.println("Przejechales pomyslnie " + km + " km.");
    } else
      System.out.println("Nie posiadasz tyle paliwa! Zatankuj pojazd!");
  }

}