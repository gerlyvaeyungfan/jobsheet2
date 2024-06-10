public class Queue8 {
    public Kendaraan8[] data;
    public int max, size, front, rear;

    public Queue8(int max) {
        this.max = max;
        this.data = new Kendaraan8[max];
        this.size = 0;
        this.front = this.rear = -1;
    }
    
    public boolean isEmpty8() {
        return (size == 0);
    }

    public boolean isFull8() {
        return (size == max);
    }

    public void peek8() {
        if (!isEmpty8()) {
            System.out.println("Elemen terdepan:");
            System.out.println(data[front]);
        } else {
            System.out.println("Queue kosong.");
        }
    }

    public void peekRear8() {
        if (!isEmpty8()) {
            System.out.println("Kendaraan di posisi paling belakang:");
            System.out.println(data[rear]);
        } else {
            System.out.println("Queue kosong.");
        }
    }

    public void print8() {
        if (isEmpty8()) {
            System.out.println("Queue kosong");
        } else {
            int i = front;

            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }

            System.out.println(data[i]);
            System.out.println("\nJumlah elemen: " + size);
        }
    }

    public void clear8() {
        front = rear = -1;
        size = 0;
    }

    public void enqueue8(Kendaraan8 dt) {
        if (isFull8()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty8()) {
                front = rear = 0;
            } else if (rear == max - 1) {
                rear = 0;
            } else {
                rear = rear + 1;
            }

            data[rear] = dt;
            size++;
        }
    }

    public Kendaraan8 dequeue8() {
        Kendaraan8 temp = null;

        if (isEmpty8()) {
            System.out.println("Queue masih kosong");
        } else {
            temp = data[front];
            size--;
        
            if (isEmpty8()) {
                front = rear = -1;
            } else if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }

        return temp;
    }
}