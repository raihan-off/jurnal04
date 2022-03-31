package com.company;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList<PlayList> listSong = new LinkedList<PlayList>();
        listSong.add(new PlayList("Tulus", "Kita"));
        listSong.addLast(new PlayList("Tulus", "kamu"));
        listSong.addFirst(new PlayList("Tulus", "Aku"));
        listSong.add(2, new PlayList("Tulus", "Dia"));
        ListIterator<PlayList> iterator = listSong.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\nCetak mundur list\n");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        listSong.remove(1);
        System.out.println("\nSesudah hapus data\n");
        for (PlayList item:listSong) {
            System.out.println(item);
        }
        ListIterator<PlayList> iter = listSong.listIterator();
        while (iter.hasNext()) {
            PlayList ob = iter.next();
            if(ob.getJudul().equals("005")) {
                iter.remove();
            }
        }
        System.out.println("\nSesudah hapus data 2\n");
        for (PlayList item:listSong) {
            System.out.println(item);
        }
    }
}
