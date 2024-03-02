import java.util.Scanner;

class Kubus {
    private float sisi;

    public Kubus(float sisi) {
        setSisi(sisi);
    }

    public float hitungLuasPermukaan() {
        return 6 * getSisi();
    }

    public float hitungVolume() {
        return (float) Math.pow(getSisi(), 3);
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        if (sisi > 0) {
            this.sisi = sisi;
        } else {
            System.out.println("Nilai sisi harus lebih dari 0.");
        }
    }
}

class Balok {
    private float panjang;
    private float lebar;
    private float tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }

    public float hitungLuasPermukaan() {
        return 2 * (getPanjang() * getLebar() + getLebar() * getTinggi() + getPanjang() * getTinggi());
    }

    public float hitungVolume() {
        return getPanjang() * getLebar() * getTinggi();
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        if (panjang > 0) {
            this.panjang = panjang;
        } else {
            System.out.println("Nilai panjang harus lebih dari 0.");
        }
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        if (lebar > 0) {
            this.lebar = lebar;
        } else {
            System.out.println("Nilai lebar harus lebih dari 0.");
        }
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            System.out.println("Nilai tinggi harus lebih dari 0.");
        }
    }
}

class Tabung {
    private float jariTabung;
    private float tinggiTabung;

    public Tabung(float jariTabung, float tinggiTabung) {
        setJariTabung(jariTabung);
        setTinggiTabung(tinggiTabung);
    }

    public float hitungLuasPermukaan() {
        return 2 * (float) Math.PI * getJariTabung() * (getJariTabung() + getTinggiTabung());
    }

    public float hitungVolume() {
        return (float) (Math.PI * Math.pow(getJariTabung(), 2) * getTinggiTabung());
    }

    public float getJariTabung() {
        return jariTabung;
    }

    public void setJariTabung(float jariTabung) {
        if (jariTabung > 0) {
            this.jariTabung = jariTabung;
        } else {
            System.out.println("Nilai jari-jari tabung harus lebih dari 0.");
        }
    }

    public float getTinggiTabung() {
        return tinggiTabung;
    }

    public void setTinggiTabung(float tinggiTabung) {
        if (tinggiTabung > 0) {
            this.tinggiTabung = tinggiTabung;
        } else {
            System.out.println("Nilai tinggi tabung harus lebih dari 0.");
        }
    }
}

public class bangun_ruang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n.:: SELAMAT DATANG DI PROGRAM BANGUN RUANG ::.\n");

        System.out.println(".:: PILIH BANGUN RUANG ::.\n");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("\nKetikkan angka pilihan Anda: ");
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.print("\nMasukkan nilai panjang sisi kubus: ");
                float sisiKubus = input.nextFloat();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("\nLuas permukaan Kubus adalah: " + kubus.hitungLuasPermukaan());
                System.out.println("Volume Kubus adalah: " + kubus.hitungVolume());
                break;
            case 2:
                System.out.print("\nMasukkan nilai panjang balok: ");
                float panjangBalok = input.nextFloat();
                System.out.print("Masukkan nilai lebar balok: ");
                float lebarBalok = input.nextFloat();
                System.out.print("Masukkan nilai tinggi balok: ");
                float tinggiBalok = input.nextFloat();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("\nLuas permukaan Balok adalah: " + balok.hitungLuasPermukaan());
                System.out.println("Volume Balok adalah: " + balok.hitungVolume());
                break;
            case 3:
                System.out.print("\nMasukkan nilai jari-jari tabung: ");
                float jariTabung = input.nextFloat();
                System.out.print("Masukkan nilai tinggi tabung: ");
                float tinggiTabung = input.nextFloat();
                Tabung tabung = new Tabung(jariTabung, tinggiTabung);
                System.out.println("\nLuas permukaan Tabung adalah: " + tabung.hitungLuasPermukaan());
                System.out.println("Volume Tabung adalah: " + tabung.hitungVolume());
                break;
            default:
                System.out.println("Masukkan angka tidak valid!!");
                break;
        }

        System.out.println("\nTerimakasih telah menggunakan Program ini!");
        input.close();
    }
}
