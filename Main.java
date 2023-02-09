class Main {
  public static void main(String[] args) {

    Samochod x = new Samochod();
    x.Wczytaj();
    x.Jedz(300);
    x.Wypisz();
    x.Tankuj(30);
    x.Wypisz();

    Samochod x1 = new Samochod("VW", "Passat", 150000, 25, 45, 7.5);
    x1.Wypisz();
    x1.Tankuj(15);
    x1.Wypisz();
    x1.Jedz(400);

    Samochod x2 = new Samochod();
    x2.Inicjalizuj("Skoda", "Fabia", 195000, 10, 35, 7);
    x2.Wypisz();
    x2.Jedz(30);
    x2.Tankuj(20);
    x2.Wypisz();
  }
}