package minggu6;

public class DaftarMahasiswaBerprestasi24 {
    Mahasiswa24 listMhs[] = new Mahasiswa24[5];
    int idx;
    void tambah(Mahasiswa24 m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Mahasiswa24 m : listMhs){
            m.tampil();
            System.out.println("---------------------------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //proses swap atau penukaran secara descending.
                    Mahasiswa24 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }    
    }

    void selectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            //Melakukan sorting secara ascending
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //proses swap
            Mahasiswa24 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for(int i=1; i<listMhs.length; i++){
            Mahasiswa24 tmp = listMhs[i];
            int j = i;
            //Melakukan sorting secara ascending    
            //while(j>0 && listMhs[j-1].ipk > tmp.ipk){
            //Melakukan sorting secara descending
            while(j > 0 && listMhs[j-1].ipk < tmp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
    
}
