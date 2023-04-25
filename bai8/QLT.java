package bai8;

import java.util.ArrayList;
import java.util.List;

public class QLT {

    private List<the> thes;
    private List<hocsinh> hocsinhs;

    public QLT() {
        this.thes = new ArrayList<>();
    }

    public void addthe(the card) {
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
    public void hienthi()
    {
        this.thes.forEach(o -> System.out.println(o.toString()));
    }
}
