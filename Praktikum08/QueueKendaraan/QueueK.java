public class QueueK {
    public int[] data;
    public int max, size, front, rear;

    public QueueK(int max) {
        this.max = max;
        this.data = new int[max];
        this.size = 0;
        this.front = this.rear = -1;
    }
    
    public boolean isEmptyK() {
        return (size == 0);
    }

    public boolean isFullK() {
        return (size == max);
    }

    public void peekK() {
        if (!isEmptyK()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue kosong.");
        }
    }

    public void printK() {
        if (isEmptyK()) {
            System.out.println("Queue kosong");
        } else {
            int i = front;

            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }

            System.out.print(data[i] + " ");
            System.out.println("\nJumlah elemen: " + size);
        }
    }

    public void clearK() {
        front = rear = -1;
        size = 0;
    }

    public void enqueueK(int dt) {
        if (isFullK()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmptyK()) {
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

    public int dequeueK() {
        int temp = 0;

        if (isEmptyK()) {
            System.out.println("Queue masih kosong");
        } else {
            temp = data[front];
            size--;
        
            if (isEmptyK()) {
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