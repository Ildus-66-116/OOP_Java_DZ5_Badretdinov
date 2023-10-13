package org.example.DZ5;


import java.util.ArrayList;
import java.util.List;

public  class Logi {
    List<String> logJournal = new ArrayList<>();

    public Logi(List<String> logJournal) {
        this.logJournal = logJournal;
    }

    public Logi() {
    }
    public  void addList(String value){
        logJournal.add(value);
    }
    @Override
    public String toString() {
        return "Действия = " + logJournal;
    }

    public void printLog(){
        System.out.println(logJournal);
    }
}


