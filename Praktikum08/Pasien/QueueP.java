public class QueueP {
    public Pasien[] antrian;
    public int front, rear, size, max;

    public QueueP(int max) {
        this.max = max;
        this.antrian = new Pasien[max];
        this.front = this.rear = -1;
        this.size = 0;
    }

    public boolean isEmptyP() {
        return (size == 0);
    }

    public boolean isFullP() {
        return (size == max);
    }

    public void enqueueP(Pasien dt) {
        if (isFullP()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmptyP()) {
                front = rear = 0;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }

            antrian[rear] = dt;
            size++;
            System.out.println(dt.nama + " telah mendaftar di klinik.");
        }
    }

    public int dequeueP() {
        int temp = -1;

        if (isEmptyP()) {
            System.out.println("Antrian masih kosong");
        } else {
            temp = front;
            size--;

            if (isEmptyP()) {
                front = rear = -1;
            } else if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }

        return temp;
    }

    public void printP() {
        if (isEmptyP()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Daftar Pasien:");
            int i = front;

            do {
                System.out.println(antrian[i]);
                i = (i + 1) % max;
            } while (i != (rear + 1) % max);

            System.out.println("\nJumlah Pasien: " + size);
        }
    }

    public void peekP() {
        if (!isEmptyP()) {
            System.out.println("Pasien terdepan:");
            System.out.println(antrian[front]);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRearP() {
        if (!isEmptyP()) {
            System.out.println("Pasien terbelakang:");
            System.out.println(antrian[rear]);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekPositionP(String nama) {
        if (!isEmptyP()) {
            int posisiRearSekarang = -1;
            for (int i = front; i != (rear + 1) % max; i = (i + 1) % max) {
                if (antrian[i].nama.equals(nama)) {
                    posisiRearSekarang = i;
                    break;
                }
            }
            if (posisiRearSekarang != -1) {
                System.out.println("Posisi " + nama + " dalam antrian: " + (posisiRearSekarang - front + 1));
            } else {
                System.out.println("Pasien " + nama + " tidak ditemukan dalam antrian");
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void daftarPasien() {
        if (!isEmptyP()) {
            System.out.println("Daftar Pasien:");
            int i = front;

            do {
                System.out.println(antrian[i]);
                i = (i + 1) % max;
            } while (i != (rear + 1) % max);
        } else {
            System.out.println("Antrian kosong");
        }
    }
}

