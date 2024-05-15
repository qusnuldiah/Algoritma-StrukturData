public class LinkedList24 {
    Node24 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node24 currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        Node24 newNode = new Node24(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node24 newNode = new Node24(input, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node24 currentNode = head;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node24 newNode = new Node24(input, null);

        if (!isEmpty()) {
            Node24 currentNode = head;

            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }
    
    public int getData(int index) {
        Node24 currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public int indexOf(int key) {
        Node24 currentNode = head;
        int index = 0;

        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }

        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kososng");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            Node24 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node24 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }

                currentNode = currentNode.next;
            }
        }
    }

    public void insertAt(int index, int key) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
    
        if (index == 0) {
            addFirst(key);
            return;
        }
    
        Node24 newNode = new Node24(key, null);
        Node24 currentNode = head;
        int count = 0;
    
        while (currentNode != null && count < index - 1) {
            currentNode = currentNode.next;
            count++;
        }
    
        if (currentNode == null) {
            System.out.println("Indeks melebihi jumlah elemen dalam linked list");
        } else {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void insertBefore(int key, int input) {
        Node24 newNode = new Node24(input, null);

        if (!isEmpty()) {
            if (head.data == key) {
                addFirst(input);
                return;
            }

            Node24 currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    return;
                }

                currentNode = currentNode.next;
            }

            System.out.println("Keyword tidak ditemukan");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeAt(int index) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
    
        if (index == 0) {
            removeFirst();
            return;
        }
    
        Node24 currentNode = head;
        int count = 0;
    
        while (currentNode != null && count < index - 1) {
            currentNode = currentNode.next;
            count++;
        }
    
        if (currentNode == null || currentNode.next == null) {
            System.out.println("Indeks melebihi jumlah elemen dalam linked list");
        } else {
            currentNode.next = currentNode.next.next;
        }
    }
}
