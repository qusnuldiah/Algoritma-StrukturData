public class StackBelanja24 {
    int maxSize;
    StrukBelanja24[] stackArray;
    int top;

    public StackBelanja24(int size) {
        maxSize = size;
        stackArray = new StrukBelanja24[maxSize];
        top = -1;
    }

    public boolean IsEmpty() {
        return top == -1;
    }

    public boolean IsFull() {
        return top == maxSize - 1;
    }

    public void push(StrukBelanja24 struk) {
        if (!IsFull()) {
            stackArray[++top] = struk;
            System.out.println("Struk belanja telah ditambahkan.");
            System.out.println("");
        } else {
            System.out.println("Stack sudah penuh. Tidak bisa menambahkan struk belanja lagi.");
            System.out.println("");
        }
    }

    public StrukBelanja24 pop() {
        if (!IsEmpty()) {
            System.out.println("Struk belanja berhasil diambil.");
            return stackArray[top--];
        } else {
            System.out.println("Stack kosong. Tidak ada struk belanja yang bisa diambil.");
            return null;
        }
    }

    public StrukBelanja24 peek() {
        if (!IsEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack kosong. Tidak ada struk belanja yang bisa ditampilkan.");
            return null;
        }
    }

    public void print() {
        if (!IsEmpty()) {
            System.out.println("Isi stack struk belanja:");
            for (int i = top; i >= 0; i--) {
                stackArray[i].displayInfo();
                System.out.println("--------------------------------------------------");
            }
        } else {
            System.out.println("Stack kosong. Tidak ada struk belanja yang bisa ditampilkan.");
        }
    }

    public void clear() {
        top = -1;
        System.out.println("Stack struk belanja sudah dikosongkan.");
    }
}