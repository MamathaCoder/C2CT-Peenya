package com.tnsif.collectionframework;

public static void main(String[] args) {
    List<College> pl=new ArrayList<>();
    pl.add(new College("Rahul",1,"Bangalore"));
    pl.add(new College("Sushma",9,"mangalore"));
    pl.add(new College("Kusuma",5,"udupi"));
    pl.add(new College("Guru",3,"Hospet"));
    
    //sort by name
    Collections.sort(pl,new Namecomparator());
    System.out.println("sort by name");
    for(College t:pl) {
            t.display();
    }
    
    //sort by rollno
            Collections.sort(pl,new  RollnoComparator());
            System.out.println("sort by rollno");
            for(College t:pl) {
                    t.display();
            }
}
}
