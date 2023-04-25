package bai8;

import java.util.ArrayList;
import java.util.List;

public class QLHS {

    private List<the> thes;

    public QLHS() {
        this.thes = new ArrayList<>();
    }

    public void add(Card card) {
        this.thes.add(card);
    }

    public boolean delete(String id) {
        the card = this.thes.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        if (card == null) {
            return false;
        }
        this.thes.remove(card);
        return true;
    }
}
