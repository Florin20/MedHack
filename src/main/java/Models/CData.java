package Models;

import java.util.ArrayList;
import java.util.List;


public class CData {

    List<String> data = new ArrayList<String>();

    public void setData(List<String>data){
        this.data = data;
    }

    public List<String> getData(){
        return this.data;
    }
}
