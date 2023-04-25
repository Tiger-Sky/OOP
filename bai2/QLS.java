package bai2;

import java.util.*;

public class QLS {
    List<thongtinchung> thongtinchungs;
    public QLS() {
        this.thongtinchungs = new ArrayList<>();
    }

    public void addDocument(thongtinchung data) {
        this.thongtinchungs.add(data);
    }

    public boolean deleteDocument(String id) {
        thongtinchung dataThongtinchung = this.thongtinchungs.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (dataThongtinchung == null) {
            return false;
        }
        this.thongtinchungs.remove(dataThongtinchung);
        return true;
    }

    public void showInfor() {
        this.thongtinchungs.forEach(documents -> System.out.println(documents.toString()));
    }

    public void searchByBook() {
        this.thongtinchungs.stream().filter(doc -> doc instanceof sach).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByNewspaper() {
        this.thongtinchungs.stream().filter(doc -> doc instanceof bao).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByJournal() {
        this.thongtinchungs.stream().filter(doc -> doc instanceof tapchi).forEach(doc -> System.out.println(doc.toString()));
    }
}
